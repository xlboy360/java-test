Scenario
Create a Spring Boot service that manages user data. The service should utilize a database for storage.
Requirements
Implement a RESTful API to perform CRUD operations on user data. The API should support the following
endpoints:
• /api/users: Create a new user by providing user details (name, email, etc.).
• /api/users/{id}: Retrieve user details by providing the user's ID.
• /api/users/{id}: Update user details by providing the user's ID and updated information.
• /api/users/{id}: Delete a user by providing the user's ID.
If possible, implement proper error handling and validation for input data.
Input:
• For creating a user: JSON data containing user details, e.g.,

{
"name": "John Doe",
"email": "<john.doe@bluecoding.com>",
"age": 30
}

• For updating a user: JSON data containing updated user details.
• For retrieving, updating, and deleting a user: User ID provided as a path parameter.
• Expected Output:
• Creating a user: HTTP 201 Created response with the created user's ID.
• Retrieving a user: HTTP 200 OK response with the user details in JSON format.
• Updating a user: HTTP 200 OK response with the updated user details in JSON format.
• Deleting a user: HTTP 204 No Content response
Deliverables
Github repository that should be sent at the END of the programming exercise.
NOTES / HINTS
• Code must be on GitHub.
• Be verbose with your commit messages as this will allow us to understand some of the decisions you
make throughout the process.
• Feel free to use different parameter names, input types, and URLs. Remember to apply validations
and think about edge cases.
• You can use whatever database you are comfortable with. For the purposes of this exercise, we
recommend a relational database (MySQL).
• Don't forget things like validations and demonstrating good clean Object-Oriented Programming.
