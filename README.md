# AppManagementMS

## Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial
This is a Sample ‘Application management system’ using Spring Boot, Mysql, Spring Data JPA and Hibernate.
There are three service running concurrently and communicate with each other using REST Template.

## Requirements
1.	Java - 1.8.x
2.	Maven - 3.x.x
3.	Mysql - 5.x.x

## Steps to Setup
1. Clone the application
git clone https://github.com/thiyaguanbu/AppManagementMS.git
2. Create Mysql database
create database applicationmanagement
3. Change mysql username and password as per your installation
> open src/main/resources/application.properties
> change spring.datasource.username and spring.datasource.password as per your mysql installation
4.	Build and run the app using maven
Run three services separately in the following order.
## mvn package
java -jar target/UserActivity-1.0.0.jar
java -jar target/ApplicationManagement-1.0.0.jar
java -jar target/TicketManagement-1.0.0.jar
Alternatively, you can run the app without packaging it using -
mvn spring-boot:run
The app will start running at http://localhost:8080.
## Explore Rest APIs
The app defines following CRUD APIs.
**User API**
POST /user/create

GET /user/registered

GET /user/{id}


**Ticket API**
POST /ticket/create

GET /ticket/list

GET /ticket/{id}

**Application API**
POST /application/create

GET /application/list

GET /application/{id}

You can test them using postman or any other rest client.
