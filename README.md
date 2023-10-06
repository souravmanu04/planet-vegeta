# Student Information System - Gradle Project

## Overview

The Student Information System is a Gradle project that allows you to create, fetch, and manage academic and personal details of students. It also includes a feature to calculate the percentage of a subject when the student passes the mark. This project is designed to help educational institutions or individuals keep track of student information efficiently.

## Features

1. **Student Management**:
   - Create new student records with personal and academic details.
   - Update existing student records.
   - Delete student records.
   - Fetch a specific student's details using id
   - Fetch all student's details

2. **Academic Details**:
   - Add subject scores.
   - Calculate the percentage for each subject.
   
## Project Structure
The project directory is organized as follows:

src/: Contains the source code of the application.

com.example: Java classes and packages.

pom.xml: Gradle project configuration file, including dependencies for JPA, Lombok, Spring Web, and PostgreSQL.

README.md: This README file.

.gitignore: Specifies files and directories to be ignored by Git.

## Usage
To use the Student Information Management System, you can make HTTP requests to the provided endpoints. You can find the list of available endpoints in the StudentController class.

**Example API endpoints:**

- To create a new student record: POST /student/add
- To fetch student details by ID: GET /student/get/{id}
- To fetch all students details: GET /student/get
- To delete student details by ID: PUT /student/del/{id}
- To enter mark details by ID: POST /student/addmark/{id}
- To fetch the percentage of a student's scores and their result: GET /student/getmark/{id}

You can use tools like Postman or curl to interact with these endpoints.
