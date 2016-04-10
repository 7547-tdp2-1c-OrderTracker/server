# -*- mode: ruby -*-
# vi: set ft=ruby :

ENV["LC_ALL"] = "en_US.UTF-8"

Vagrant.require_version ">= 1.8.1"

Vagrant.configure(2) do |config|
  config.vm.provider :virtualbox do |virtualbox|
    # allocate 1024 mb RAM
    virtualbox.customize ["modifyvm", :id, "--memory", "2048"] 
    # allocate max 50% CPU
    virtualbox.customize ["modifyvm", :id, "--cpuexecutioncap", "50"]
  end
  config.vm.box = "ubuntu/wily32"
  config.vm.hostname = "ordertracker-dev"

  # SSH config
  config.ssh.insert_key = false

  config.vm.network "forwarded_port", guest: 3000, host: 3000, auto_correct: true
  config.vm.network "forwarded_port", guest: 80, host: 8999, auto_correct: true

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
    sudo apt-get install -y openjdk-7-jdk vim git apache2

    #Config de la base de datos
    sudo apt-get install -y postgresql postgresql-common postgresql-contrib libpq-dev
    echo "CREATE USER vagrant WITH PASSWORD 'vagrant' SUPERUSER CREATEDB CREATEROLE INHERIT LOGIN;" > createVagrantUser.sql
    sudo -u postgres psql < createVagrantUser.sql
    sudo -u postgres createdb ordertracker
    echo "GRANT ALL PRIVILEGES ON DATABASE ordertracker to vagrant;" > grantVagrantUser.sql
    sudo -u postgres psql < grantVagrantUser.sql
    #Installing the extesion package
    echo "CREATE EXTENSION adminpack;" > adminpack_extesion.sql
    sudo -u postgres psql < adminpack_extesion.sql
    sudo locale-gen es_AR.UTF-8

    #Instalar sdk-man
    curl -s http://get.sdkman.io | bash
    source "/home/vagrant/.sdkman/bin/sdkman-init.sh"

    #Instalar grails
    sdk install grails 3.0.4

    #Install the heroku toolbelt
    wget -O- https://toolbelt.heroku.com/install-ubuntu.sh | sh
    set -o vi
  SHELL

end
