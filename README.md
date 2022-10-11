# java-cli-maven-jooq-postgres-simple-generate-by-plugin

## Description
Creates a small database table
called `dog` and populates with sql.

Uses jooq `selectFrom` function to select
all records.

Generates pojo with jooq plugin.

## Tech stack
- java
- maven
  - jooq plugin
  - log4j
  - postgres driver

## Docker stack
- maven:3-openjdk-17
- postgres:alpine

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Jooq code setup](https://github.com/eugenp/tutorials/tree/master/persistence-modules/jooq)
- [Jooq functions](https://www.javacodegeeks.com/2015/09/work-with-the-jooq-dsl.html)
