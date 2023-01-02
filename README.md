# Sprint Boot JWT Authentication Quickstart

A simple Java & Spring Boot application with user signup, signin, signup, JWT session management, and authenticated route support.

## Routes

* `POST /api/auth/signup` - Quick username/email/password signup.
* `POST /api/auth/signin` - User signin using username and password that responds with a valid JWT session cookie.
* `POST /api/auth/signout` - Deletes the user's JWT session cookie to clear their session.
* `GET /api/users` - Returns the details (username, email, and ID) of the currently signed in user.
