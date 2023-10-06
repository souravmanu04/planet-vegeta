# Product Management System

## Overview

The Product Management System is a Maven project that allows you to create, fetch, and manage and delete details of products. This project is designed to keep track of product information efficiently.

## Project Structure

The project directory is organized as follows:

src/: Contains the source code of the application.
com.example: Java classes and packages.
pom.xml: Maven project configuration file, including dependencies for JPA, Lombok, Spring Web, and PostgreSQL.
README.md: This README file.
.gitignore: Specifies files and directories to be ignored by Git.

## Usage
To use the Product Management System, you can make HTTP requests to the provided endpoints. You can find the available endpoints in the ProducttController class.

**API endpoints:**

- To create a new product record: POST /product/add
- To fetch product details by ID: GET /product/get/{id}
- To fetch all product details: GET /product/get
- To update product name by ID: PUT /product/putName/{id}
- To update product category by ID: PUT /product/putCat/{id}
- To update product Brand by ID: PUT /product/putBrand/{id}
- To update product price by ID: PUT /product/putprice/{id}
- To delete product by ID: DELELTE /product/del/{id}

You can use tools like Postman or curl to interact with these endpoints.
