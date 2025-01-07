# Todo App

A simple Spring Boot-based Todo application with user authentication and role-based authorization. This application allows users to manage their tasks (Todo items) with different functionalities based on their roles (ADMIN or USER).

## Features

- **User Authentication**: Basic authentication with two users:
    - **saddab** (Role: USER)
    - **admin** (Role: ADMIN)

- **Todo Management**:
    - Create a new Todo
    - View a specific Todo
    - View all Todos
    - Update a Todo
    - Delete a Todo
    - Mark a Todo as completed or incomplete

## Technologies Used

- **Backend**:
    - Java 17
    - Spring Boot
    - Spring Security (for role-based authorization)
    - Spring Data JPA (for database interactions)
    - ModelMapper (for DTO to entity conversion)
    - MySQL (as the database)


