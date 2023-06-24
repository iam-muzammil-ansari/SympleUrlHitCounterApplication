# Simple URL Hit Counter Application

This is a simple URL hit counter application that tracks the number of hits for a specific URL and also provides the hit count for each user.

## Technologies Used

- Java
- Spring Boot
- Maven

## Getting Started

Follow the instructions below to get the application up and running on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed
- Maven installed

### Dependency
   - [Spring web](https://mvnrepository.com/artifact/org.springframework/spring-web)

### Installation

1. Clone the repository:

   - git clone https://github.com/ayaan097/SympleUrlHitCounterApplication.git


2. Navigate to the project directory:

   - cd simple-url-hit-counter

3. Build the application using Maven:

   - mvn clean install


4. Run the application:

   - mvn spring-boot:run


The application should now be running on `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- `GET /api/v1/visitor-count-app/count`: Retrieves the total hit count for the URL.
- `GET /api/v1/visitor-count-app/username/{username}/count`: Retrieves the hit count for a specific user.

## Code Structure

The application follows a basic structure where the main components are:

- `UrlHitController`: This class defines the REST API endpoints and interacts with the `UrlHitService` to retrieve the hit count data.
- `UrlHitService`: This class handles the business logic of tracking hit counts. It maintains a map of hit counts for each user and provides methods to retrieve the counts.

## Contributing

Contributions to the project are welcome. If you find any issues or would like to add new features, please feel free to submit a pull request.

## License

This project is not licensed.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot): Java framework used for building the application.
- [Maven](https://maven.apache.org/): Dependency management and build tool.


