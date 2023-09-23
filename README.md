# Spring Boot CRUD Students API

This repository contains a Spring Boot API for managing student data using Docker Compose. The API provides CRUD (Create, Read, Update, Delete) operations for student records.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Cleanup](#cleanup)
- [Conclusion](#conclusion)

## Prerequisites

Before you begin, make sure you have the following software installed on your system:

- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Getting Started

To set up and run the Spring Boot CRUD Students API using Docker Compose, follow these steps:

1. Clone this repository:

   ```bash
   git clone https://github.com/Aissame2019/SpringBoot-Api.git

2. Clone this repository:

    ```bash
    docker compose up --build

This will create Docker containers for the Spring Boot application and a PostgreSQL database.

3. Access the API at http://localhost:8080.

    
## API Endpoints
The following endpoints are available:

    - GET /api/students: Retrieve a list of all students.
    - POST /api/students: Create a new student.
    - PUT /api/students/{id}: Update an existing student by ID.
    - DELETE /api/students/{id}: Delete a student by ID.


## Cleanup
To stop and remove the Docker containers and networks, use:
        
        docker compose down



## Conclusion
You've successfully set up and run the Spring Boot CRUD Students API using Docker Compose.