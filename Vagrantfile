# -*- mode: ruby -*-
# vi: set ft=ruby :

ENV["LC_ALL"] = "en_US.UTF-8"

Vagrant.require_version ">= 1.8.1"

Vagrant.configure(2) do |config|

  # SSH config
  config.ssh.insert_key = false

  config.vm.network "forwarded_port", guest: 3306, host: 3000, auto_correct: true
  config.vm.network "forwarded_port", guest: 80, host: 8999, auto_correct: true
  config.vm.network "forwarded_port", guest: 8090, host: 8090, auto_correct: true

  config.vm.synced_folder "..", "/vagrant"

  config.vm.box = "larryli/wily32"
  config.vm.box_url = "https://cloud-images.ubuntu.com/vagrant/wily/20160325/wily-server-cloudimg-i386-vagrant-disk1.box"

  config.vm.hostname = "ordertracker-dev"

  # Private network up
  config.vm.network :private_network, ip: "10.0.0.2"

  config.vm.provision "shell", privileged: false, inline: <<-SHELL
    #!/bin/bash
    #Aseguramos que este todo updateado
    sudo apt-get clean
    sudo apt-get update

    #Aseguramos los security issues actualizados
    sudo apt-get upgrade -y
    
    #Herramientas de buildeo
    sudo apt-get install -y build-essential libssl-dev curl
    sudo apt-get install -y openjdk-7-jdk
    sudo apt-get install -y vim
    sudo apt-get install -y git
    sudo apt-get install -y apache2
    
    #Config de la base de datos
    sudo apt-get install debconf-utils
    sudo debconf-set-selections <<< 'mysql-server mysql-server/root_password password admin'
    sudo debconf-set-selections <<< 'mysql-server mysql-server/root_password_again password admin'
    sudo apt-get install -y mysql-server mysql-client libmysqlclient-dev
    
    #mysql 5.6 tiene el config en /etc/mysql/mysql.conf.d/mysqld.cnf
    sudo sed -i 's/bind-address/#bind-address/' /etc/mysql/mysql.conf.d/mysqld.cnf
    mysql -uroot -padmin -e "grant all privileges on *.* to 'root'@'gateway'; flush privileges;"
    sudo service mysql restart

    #Instalar NVM
    curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.31.0/install.sh | bash
    source "/home/vagrant/.bashrc"
    source "/home/vagrant/.nvm/nvm.sh"
    nvm install 0.12.7

    #Instalar sdk-man
    curl -s http://get.sdkman.io | bash
    source "/home/vagrant/.sdkman/bin/sdkman-init.sh"
    
    #Instalar grails
    sdk install grails 3.0.4

  SHELL

  config.vm.provision "file", source: "~/.gitconfig", destination: ".gitconfig"

end