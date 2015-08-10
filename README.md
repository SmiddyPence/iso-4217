# ISO-4217 Currency Service

Simple service to return the set of ISO standard currencies


### Create database

```sh
create database iso_4217;
use iso_4217;
source <enter path>\iso-4217\data\ddl.sql;
show tables;
source <enter path>\iso-4217\data\dml.sql;
select * from entity;
```

### Set Enviroment Variables

```sh
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/iso_4217?reconnect=true
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=password
```