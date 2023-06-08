# FinalCaseBootcamp 📂
I used PostgreSQL as database in my project and created a DB named "finalcase".After adding the required dependencies in Pom.xml, we must enter the spring boot project and make the necessary changes in the ""application.properties"" file in the resources.

````
 server.port=8080


spring.datasource.url=jdbc:postgresql://localhost:5432/finalcase
spring.datasource.username=postgres
spring.datasource.password=258042
spring.datasource.driver-class-name=org.postgresql.Driver
logging.level.org.springframework = info
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Weather.Api.Key=8f576eddf5e4d5e46761eb12e00e9f62
Weather.Units=metric
#KAFKA CONFIG
spring.kafka.producer.bootstrap-servers=http://localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer 
   
````
## Technologies
➜ Java 17

➜ Maven 

➜ Spring Boot

➜ PostgreSQL

➜ Jwt Service

➜ Docker

➜ Spring Data Jpa

➜ Lombok

➜ FeignClient

➜ Kafka

➜ Security

➜ Mapstruct


## Features 

➔User can Login

➔User can Sign up

➔Username and city must be unique

➔User can display 5 Day / 3 Hour Weather Forecast for Desired City

## AuthenticationController
AuthenticationController is a controller class that handles HTTP requests for user authentication and registration. Relevant endpoints are:

PostMapping /register     : Allows the user to register.

PostMapping /authenticate : Provides user authentication.

## WeatherController

WeatherController, Uses OpenWeatherMap API to get weather forecasts.

GetMapping /getWeather: Returns weather forecasts.



## API Documentation 🖥

![image](https://github.com/oguzhnkurt/FinalCaseBootcamp/assets/73943292/0c45ae34-73ef-47f7-b18e-6ac3eb8aae58)



![image](https://github.com/oguzhnkurt/FinalCaseBootcamp/assets/73943292/75563361-71e8-4bb0-9964-feea30771147)


