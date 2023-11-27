# crud-product-jpa-h2-db
CRUD Product API using...
1. Java Spring Boot: Framework for building the API.
2. H2 Database: In-memory database for storing product information.
3. JPA (Java Persistence API): For managing relational data in the database.
4. Lombok: Library to reduce boilerplate code.
5. Layered:
	5.1 ProductController: Handles HTTP requests and responses related to products.
	5.2 ProductService: Contains business logic for product operations.
	5.3 ProductServiceImpl: Implements the ProductService interface and performs CRUD operations on products.
6. ProductDTO (Data Transfer Object): Represents the data sent between the client and server to encapsulate the product information.
7. ModelMapper: Used for mapping entity objects to DTOs and vice versa.

