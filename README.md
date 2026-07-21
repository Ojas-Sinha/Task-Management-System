# Task Management System

## 📌 Overview

The **Task Management System** is a full-stack web application designed to help users efficiently organize, track, and manage their daily tasks. The application provides an intuitive interface for creating, updating, deleting, and monitoring tasks while ensuring secure data storage and efficient backend processing.

The project demonstrates modern software development practices, including RESTful APIs, database integration, containerization, CI/CD, and Kubernetes deployment.

---

## ✨ Features

* Create, update, and delete tasks
* View all tasks in a user-friendly dashboard
* Mark tasks as completed or pending
* RESTful API architecture
* PostgreSQL database integration
* Docker containerization
* Kubernetes deployment support
* Jenkins CI/CD pipeline
* Maven build automation
* Selenium-based automated testing

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* Maven

### Database

* PostgreSQL

### DevOps

* Docker
* Kubernetes
* Jenkins

### Testing

* Selenium
* JUnit

### Version Control

* Git
* GitHub

---

## 📂 Project Structure

```
Task-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── webapp/
│   │
│   └── test/
│
├── Dockerfile
├── pom.xml
├── README.md
└── .gitignore
```

---

## ⚙️ Prerequisites

Before running the project, install:

* Java 17 or later
* Maven
* PostgreSQL
* Docker (optional)
* Kubernetes (optional)
* Jenkins (optional)
* Git

---

## 🚀 Installation

### Clone the repository

```bash
git clone https://github.com/<your-username>/Task-Management-System.git
```

### Navigate to the project

```bash
cd Task-Management-System
```

### Configure the database

Update the PostgreSQL configuration in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=postgres
spring.datasource.password=your_password
```

---

## ▶️ Run the Project

Using Maven:

```bash
mvn spring-boot:run
```

Or build the project:

```bash
mvn clean install
```

---

## 🐳 Docker

Build the Docker image:

```bash
docker build -t task-management-system .
```

Run the container:

```bash
docker run -p 8080:8080 task-management-system
```

---

## ☸️ Kubernetes Deployment

Apply Kubernetes manifests:

```bash
kubectl apply -f k8s/
```

Check running pods:

```bash
kubectl get pods
```

---

## 🔄 CI/CD Pipeline

The project includes a Jenkins pipeline that automates:

* Source code checkout
* Maven build
* Unit testing
* Docker image creation
* Docker image publishing
* Kubernetes deployment

---

## 🔮 Future Enhancements

* User authentication with JWT
* Role-based access control
* Task reminders and notifications
* File attachments
* Search and filtering
* Email notifications
* Dark mode
* Mobile-responsive UI

---


Feel free to connect and contribute to the project!
