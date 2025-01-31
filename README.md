
# Spring Boot CRUD API

This is a simple Spring Boot application that demonstrates basic CRUD operations using a REST API. It is built with Java and uses Spring Boot as the backend framework.

## Prerequisites

Before you begin, ensure that you have the following installed:

- **JDK 11** or higher (Java Development Kit)
- **Maven** or **Gradle** (depending on your project setup)
- **IDE** (such as IntelliJ IDEA, Eclipse, or VS Code) for running the application
- **Postman** or **Curl** (optional, for testing the API endpoints)

## Getting Started

Follow the steps below to set up and run the project locally.

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/spring-boot-crud-api.git
cd spring-boot-crud-api
```

### 2. Build the Project

If you're using **Maven**, run the following command in the project directory to build the project:

```bash
mvn clean install
```

If you're using **Gradle**, run:

```bash
gradle build
```

### 3. Run the Application

To start the Spring Boot application, you can run the following command:

If you're using **Maven**:

```bash
mvn spring-boot:run
```

If you're using **Gradle**:

```bash
gradle bootRun
```

Alternatively, you can run the application directly from your IDE by running the `main` method in `SpringBootCrudApiApplication.java`.

### 4. Access the Application

Once the application is running, open your browser and visit:

```url
http://localhost:8080
```

You should see the home page or test the API using Postman or Curl.

### 5. Testing the API

You can test the available API endpoints by sending HTTP requests (GET, POST, PUT, DELETE) to the following endpoints:

- **GET /api/items** – Retrieve all items.
- **GET /api/items/{id}** – Retrieve a specific item by its ID.
- **POST /api/items** – Create a new item.
- **PUT /api/items/{id}** – Update an existing item.
- **DELETE /api/items/{id}** – Delete an item by its ID.

Example using **Postman** or **Curl**:

```bash
curl -X GET http://localhost:8080/api/items
```

## Project Structure

```
src/
 └── main/
      └── java/
          └── com/
              └── example/
                  └── crudapi/
                      ├── controller/
                      ├── model/
                      ├── repository/
                      └── service/
 └── resources/
      ├── application.properties

## Contributing

If you'd like to contribute to this project, feel free to fork the repository, make changes, and create a pull request.

## License

This project is licensed under the MIT License.

