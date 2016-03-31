# OrderTracker Server Side


El Order Tracker Server-Side contiene el servicio con los datos necesarios para poder exponer una API publica a ser consumida.

## Entorno

- Vagrant
- MySQL 5.6
- Java JDK 7
- Groovy 3.0.4
- NVM con Node.js v0.12.7
- Apache2

## Requirements

- Instalar [Vagrant](https://www.vagrantup.com/downloads.html) 1.8.1 (recomendado)

- Una vez instalado:

1. Pararse en la folder del server

  ```bash
  $ cd server
  ```
2. Levantar el servidor

  ```bash
  $ vagrant up
  ```

3. Validar que la instalación haya sido satifactoria.
4. Comunicarse por la virtual

  ```bash
  $ vagrant ssh
  ```

NOTA: Muy probablemente cuando hagan vagrant ssh, se encuentren con ésto:
  ```bash
  *** System restart required ***
  vagrant@ordertracker-dev:~$
  ```
  Recomendado hacer un restart
  ```bash
  $ vagrant halt
  $ vagrant up
  ```
  O bien un:
  ```bash
  $ make vm-reset
  ```

5. Desarrollar en nuestro entorno de trabajo. (ver sync)


## Synchronization

La raiz del proyecto **7547-tdp2-1c/** se encuentra del lado del guest en la folder **/vagrant/**

Abrir un browser y consumir http://localhost:8999/ (frontend)

Pararse dentro del guest en el path /vagrant/

