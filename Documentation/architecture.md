# 🚧 Architecture Overview – Scooter App

## 🧱 System Overview

The Scooter App is a scooter-sharing platform developed with:
- **Frontend**: Budibase (no-code/low-code UI)
- **Backend**: Spring Boot REST API (Java)
- **Database**: In-memory or configurable (e.g., H2/PostgreSQL)

---

## 🧩 Backend Architecture

### Key Components:
- `User`, `Station`, `Scooter`, and `Booking` entities
- Repositories using Spring Data JPA
- Services encapsulating business logic
- Controllers exposing RESTful endpoints

### Technologies:
- Java 17+
- Spring Boot
- Spring Data JPA
- Maven

---

## 📦 Main Packages:
