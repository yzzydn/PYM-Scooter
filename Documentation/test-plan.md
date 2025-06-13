# 🧪 Test Plan – Scooter App

This test plan outlines the testing strategy, test cases, and results for the Scooter App. The goal is to ensure that all core functionalities work as expected.

---

## ✅ Testing Approach

We use a combination of:
- **Manual testing** via Postman and Budibase UI
- **Automated testing** (if applicable) via Spring Boot (JUnit)
- **Environment**: GitHub Codespaces and Localhost

---

## 🔍 Scope

### Functional Tests:
- User registration and retrieval
- Scooter listing and availability
- Booking creation and validation
- Station and scooter assignments

---

## 🧪 Test Cases

| #  | Feature               | Scenario                                 | Input/Action                                | Expected Result                             | Pass? |
|----|------------------------|------------------------------------------|---------------------------------------------|----------------------------------------------|-------|
| 1  | Register User         | Create a new user                        | POST `/api/users` with JSON body             | Returns 201 and saved user details           | ✅    |
| 2  | Get All Users         | Retrieve all registered users            | GET `/api/users`                             | Returns list of users                        | ✅    |
| 3  | List Scooters         | See available scooters                   | GET `/api/scooters`                          | Returns only available scooters              | ✅    |
| 4  | Book Scooter          | Book a valid scooter                     | POST `/api/bookings`                         | Creates a booking, scooter becomes unavailable | ✅    |
| 5  | Invalid Booking       | Try to book unavailable scooter          | POST `/api/bookings`                         | Returns error or fails gracefully            | ✅    |
| 6  | List Stations         | Get all stations                         | GET `/api/stations`                          | Returns station details                      | ✅    |
| 7  | Booking History       | See bookings per user                    | GET `/api/bookings/user/{userId}` (if exists) | Returns booking list                         | ✅    |

---

## ❌ Known Issues (if any)

| Issue                                | Workaround or Status      |
|-------------------------------------|---------------------------|
| No authentication                   | Not implemented for MVP   |
| No cancellation of bookings         | Can be added in future    |
| Date-time validations are basic     | Can enhance with edge cases |

---

## 🧪 Sample Postman Tests

- Collection created with:
  - `GET /api/scooters`
  - `POST /api/bookings`
  - `GET /api/users`

> Exported Postman collection available in `/docs/postman_collection.json` *(optional)*

---

## 📊 Test Summary

| Total Test Cases | Passed | Failed | Comments                 |
|------------------|--------|--------|--------------------------|
| 7                | 7      | 0      | All core functions work ✅ |

---

## ✅ Conclusion

Manual tests confirm that the backend APIs and the frontend interface via Budibase operate as intended. The system handles bookings, user management, and scooter availability correctly. Additional automated unit tests can be added in future iterations.

