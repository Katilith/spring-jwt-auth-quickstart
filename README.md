# Sprint Boot JWT Authentication Quickstart

A simple Java & Spring Boot application with user signup, signin, signup, JWT session management, and authenticated route support. MySQL, Hibernate, and Spring Data JPA are included for basic user database creation and management.

## Routes

* `POST /api/auth/signup` - Quick username/email/password signup.
* `POST /api/auth/signin` - User signin using username and password that responds with a valid JWT session cookie.
* `POST /api/auth/signout` - Deletes the user's JWT session cookie to clear their session.
* `GET /api/users` - Returns the details (username, email, and ID) of the currently signed in user.

## Packages

* `net.kikorono.backend`
    * `controllers` - Contains all application route controllers.
    * `db` - Database entities and repositories.
    * `dto` - Data Transfer Objects, objects that will be sent to and from the client.
    * `security` - Here there be dragons. Contains the code for the application's security and JSON Web Tokens functionality. In the words of Todd Howard - "It just works." (except it actually does).
