# FinTrack Spring Boot + MySQL Backend

Java 21 + Spring Boot 3.4.7 + MySQL + JPA + Spring Security + JWT.

## Setup

1. Create database:

```sql
CREATE DATABASE fintrack;
```

2. Edit `src/main/resources/application.properties` and replace `YOUR_MYSQL_PASSWORD`.

3. Run:

```bash
mvn spring-boot:run
```

Backend: `http://localhost:8080`

Health: `GET /api/health`

## APIs

Public:
- POST `/api/auth/register`
- POST `/api/auth/login`

Protected with `Authorization: Bearer <JWT>`:
- GET/PUT `/api/profile`
- GET `/api/dashboard`
- GET/POST/DELETE `/api/transactions`
- GET/POST/PUT/DELETE `/api/budgets`
- GET/POST/PUT/DELETE `/api/goals`
- GET `/api/reports/summary`

Register body:
```json
{"name":"Rahul Sharma","email":"rahul@gmail.com","phone":"9876543210","password":"rahul123"}
```

Login body:
```json
{"email":"rahul@gmail.com","password":"rahul123"}
```

The login response contains the JWT and the logged-in user's name/email/id. The React frontend should store this response and use the JWT for protected requests.

Every financial record is associated with `user_id`, so different logged-in users get separate transactions, budgets and goals.
