# Simple Spring Boot Microservice

This is a simple Spring Boot microservice designed to demonstrate basic microservice functionality using Spring Boot.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Configuration](#configuration)
- [Build and Deployment](#build-and-deployment)
- [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 17 or higher installed
- Maven 3.8 or higher installed

## Getting Started

1. **Clone the repository:**

    ```sh
    git clone https://github.com/SergioBumer/UserService.git
    cd UserService
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

3. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

## Running the Application

Once the application is running, you can access it at `http://localhost:8080`.

## API Endpoints

The microservice exposes the following endpoints:

### Create User Endpoint

- **URL:** `/user`
- **Method:** `POST`
- **Description:** Returns the information of a successfully created user.

  **Sample Response:**

    ```json
    {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "created": "2023-06-25T14:48:00.000Z",
    "modified": "2024-06-25T14:48:00.000Z",
    "last_login": "2024-06-25T14:48:00.000Z",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c",
    "isactive": true
    }
    ```

## Configuration

Configuration settings can be found in the `application.properties` file located in the `src/main/resources` directory.

## Build and Deployment

To build and deploy the application, follow these steps:

1. **Build the project:**

    ```sh
    mvn clean package
    ```

2. **Run the JAR file:**

    ```sh
    java -jar target/UserService-0.0.1-SNAPSHOT.jar
    ```

## Build and Deployment with Docker

### 1. Build the docker image

```bash
docker build -t user_service .
```

### 2. Run a container based on the image

```bash
docker run -d -p 8080:8080 user_service
```

## License

This project is licensed under the MIT License. See the LICENSE file for details.