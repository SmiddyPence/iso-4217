# ISO-4217 Currency Service

Simple service to return the set of ISO standard currencies

![build status](https://github.co/SmiddyPence/iso-4217/actions/workflows/maven-package.yml/badge.svg?branch=master)
![example branch parameter](https://github.com/github/docs/actions/workflows/main.yml/badge.svg?branch=feature-1)
[![Build Status](https://github.com/javaparser/javaparser/actions/workflows/maven_tests.yml/badge.svg?branch=master)](https://github.com/javaparser/javaparser/actions/workflows/maven_tests.yml)

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