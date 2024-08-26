Random Quote API 

Project Description
The Random Quote API is a simple Spring Boot project that provides a RESTful API for getting and posting random quotes. This project allows users to perform CRUD (Create, Read, Update, Delete) operations on quotes and retrieve a random quote via an HTTP GET request.

Features
Retrieve Random Quote: Fetch a random quote from the collection.
CRUD Operations: Create, Read, Update, and Delete quotes through the API.
Open for Contributions: Contributions are welcome to enhance functionality or fix issues.
Installation
To set up and run this project locally, follow these steps:

Clone the Repository:

bash

git clone <repository-url>
cd random-quote-api
Build the Project: Ensure you have Maven or Gradle installed. Use one of the following commands to build the project:

For Maven:

bash
Copy code
mvn clean install
For Gradle:

bash
Copy code
./gradlew build
Run the Application: You can run the application using the following command:

bash

mvn spring-boot:run
or

bash

./gradlew bootRun
Access the API: Once the application is running, you can access the API at http://localhost:8080/api/quotes.

Usage
Get a Random Quote:

GET /api/quotes/random: Returns a random quote.
Add a New Quote:

POST /api/quotes: Adds a new quote to the collection.
Update a Quote:

PUT /api/quotes/{id}: Updates an existing quote by its ID.
Delete a Quote:

DELETE /api/quotes/{id}: Deletes a quote by its ID.
Contributing
Contributions are welcome! If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

License
This project does not currently have a license. Since this is a personal project, you can choose to license it in the future if you decide to share it publicly. If you're unsure about licensing, you can explore common licenses like MIT, Apache 2.0, or GNU GPL to see which fits your needs.

Contact Information
If you have any questions or issues, feel free to contact me via [your-email@example.com].

Dependencies
Spring Boot: The core framework for the application.
Maven/Gradle: For project build and dependency management.
Version
Current version: 1.0.0

