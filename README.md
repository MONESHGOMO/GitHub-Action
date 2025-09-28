# Dev16 CI/CD Project


<br>

<img width="1919" height="1020" alt="image" src="https://github.com/user-attachments/assets/73b9ef07-30b6-4c1d-b951-e6f1d7078b1c" />

## Overview
This project demonstrates a **CI/CD workflow** for a Java Spring Boot application using **GitHub Actions**, **Docker**, and deployment on **Render** free tier. The workflow automates **building, testing, Docker image creation, and deployment** to a cloud service.

---

## Features

- **Continuous Integration (CI)**
  
  - Builds the Spring Boot application.
  - Generates a Docker image for deployment.

- **Continuous Deployment (CD)**
  - Pushes Docker images to **Docker Hub**.
  - Integrates with **Render** for automatic deployment.
  - Supports **auto-deploy** whenever the main branch is updated.

- **Technologies**
  - **Java 17** (Spring Boot)
  - **Maven**
  - **Docker**
  - **GitHub Actions**
  - **Render Free Tier** (Docker Web Service)

---

## GitHub Actions Workflow

The workflow is split into two jobs:

1. **Test**
   - Checks out the code.
   - Sets up Java 17.
   - Runs Maven tests.

2. **Build and Deploy**
   - Builds the Spring Boot app using Maven.
   - Logs in to Docker Hub using GitHub Secrets.
   - Builds a Docker image tagged with the **commit SHA** and `latest`.
   - Pushes the Docker image to Docker Hub.
   - Render pulls the Docker image automatically for deployment (if auto-deploy enabled).

---

## Setup and Deployment

### Configure Docker Hub Secrets in GitHub
- `DOCKERHUB_USERNAME`
- `DOCKERHUB_TOKEN`

### Trigger CI/CD Workflow
1. Push code to the `main` branch.
2. This triggers the CI/CD workflow:
   - Tests run.
   - Docker image is built and pushed.
   - Render automatically deploys the app.

### Live Demo
Check out the deployed application here:  
[https://dev16-ops.onrender.com](https://dev16-ops.onrender.com)
