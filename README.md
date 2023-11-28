# crud-product-jpa-h2-db
CRUD Product API using...
1. Java Spring Boot,
2. H2 Database,
3. JPA,
4. Lombok,
5. ProductDTO,
6. ModelMapper

# Step Create project
Creating a CRUD API project using Java Spring Boot, H2 Database, JPA, Lombok, and organizing code layers as specified can be initiated as follows:

1. Start with a Spring Boot Project
Use Spring Initializr to create a Spring Boot project, 
selecting dependencies for Spring Web, Spring Data JPA, H2 Database, and Lombok.
Create an Entity Class for Product

2. Create the Product class, an Entity in JPA, and use Lombok annotations to reduce code, such as @Entity, @Table, @Id, @GeneratedValue, @Data, @NoArgsConstructor, @AllArgsConstructor, etc.

3. Create a ProductDTO (Data Transfer Object)
Build the ProductDTO class to serve as the model for receiving and sending data via the API.

4. Create a Repository Interface for Product
Generate the ProductRepository interface, which extends JpaRepository to manage the data of the Product entity.

5. Create the Service Layer
5.1 ProductService Interface
Establish the ProductService interface to define various operations for the Product.
5.2 ProductServiceImpl
Implement the ProductServiceImpl class, which implements the ProductService interface to execute the methods defined in the ProductService.

6. Create the Controller Layer
ProductController
Develop the ProductController class to handle requests and invoke the ProductService to process them.

7. Add ModelMapper dependency 
Add the ModelMapper dependency in the pom.xml to use it for data conversion between Entity and DTO.

8. The end.
9. Article: <a href=https://medium.com/@jnuchit/crud-api-product-data-using-springboot-jpa-h2-databases-e83afb7f9c31>CRUD API product data using SpringBoot, JPA, H2 databases, Lombok </a> 
