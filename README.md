config-server
=============
## How to run

```
mvn spring-boot:run
Windows:
java -cp config-server-0.0.1-SNAPSHOT.jar;lib/*;. com.micros.ConfigServerApplication
Linux:
java -cp config-server-0.0.1-SNAPSHOT.jar:lib/*:. com.micros.ConfigServerApplication
```

discovery-server
================

## How to run
```
mvn spring-boot:run -Dspring.profiles.active=primary
mvn spring-boot:run -Dspring.profiles.active=secondary
mvn spring-boot:run -Dspring.profiles.active=tertiary
```

discoverable-service
====================

## How to run
```
mvn spring-boot:run -Dspring.profiles.active=subject
mvn spring-boot:run -Dspring.profiles.active=verb
mvn spring-boot:run -Dspring.profiles.active=verb2
mvn spring-boot:run -Dspring.profiles.active=noun
```

discovery-client
================

## How to run
```
mvn spring-boot:run
```

configs
=======
