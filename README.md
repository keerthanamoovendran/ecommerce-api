E-Commerce REST API

A secure backend E-Commerce application developed using Java and Spring Boot. The project provides RESTful APIs for user authentication, product management, shopping cart operations, and order processing.

Features

- User Registration and Login
- JWT Authentication and Authorization
- Product Management (CRUD Operations)
- Shopping Cart Management
- Order Placement and Management
- Role-Based Access Control
- RESTful API Architecture
- MySQL Database Integration
- Exception Handling and Validation

Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- MySQL
- Maven

Project Structure

src/main/java

- config
  
  - JwtAuthFilter
  - SecurityConfig

- controller
  
  - ProductController
  - CartController
  - OrderController
  - TestController

- dto
  
  - RegisterRequest
  - LoginRequest
  - AuthResponse
  - ProductRequest
  - AddToCartRequest

- entity
  
  - User
  - Role
  - Product
  - Cart
  - CartItem
  - Order
  - OrderItem

- repository
  
  - UserRepository
  - RoleRepository
  - ProductRepository
  - CartRepository
  - CartItemRepository
  - OrderRepository

- service
  
  - AuthService
  - ProductService
  - CartService
  - OrderService

API Modules

Authentication

- User Registration
- User Login
- JWT Token Generation

Products

- Create Product
- View Products
- Update Product
- Delete Product

Cart

- Add Product to Cart
- View Cart
- Remove Product from Cart

Orders

- Place Order
- View Orders

How to Run

1. Clone the repository.
2. Configure MySQL database settings in application.properties.
3. Run Maven dependencies.
4. Start the Spring Boot application.
5. Test APIs using Postman.

Learning Outcomes

- Implemented layered architecture using Controller, Service, and Repository patterns.
- Developed secure REST APIs using Spring Security and JWT Authentication.
- Integrated MySQL database using Spring Data JPA and Hibernate.
- Applied Object-Oriented Programming concepts and backend development best practices.

Author

Keerthana M
