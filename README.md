# ISO-4217 Currency Service

Simple service to return the set of ISO standard currencies


### Database

```sh
pg_ctl -D /usr/local/var/postgres -l /usr/local/var/postgres/server.log start
createdb iso_4217
```

### Set Enviroment Variables

```sh
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/iso_4217?reconnect=true
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=password
```