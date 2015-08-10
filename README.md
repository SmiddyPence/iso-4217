# ISO-4217 Currency Service

Simple service to return the set of ISO standard currencies


### Set up database

```sh
create database iso_4217;
use iso_4217;
source <enter path>\iso-4217\data\ddl.sql;
show tables;
source <enter path>\iso-4217\data\dml.sql;
select * from entity;
```

### Set Enviroment Variables