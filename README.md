# 🛴 PYM Scooter – Pharmacy Delivery Scooter App

**PYM Scooter** is a specialized web application designed to support **pharmacies in Basel** with efficient medical deliveries using electric scooters. Each pharmacy has a designated courier who can book, ride, and park scooters at strategic locations across the city to facilitate **timely medicine delivery** between pharmacies.

---

## 📌 Contents

- [Overview](#overview)
- [Features](#features)
- [User Stories](#user-stories)
- [System Design](#system-design)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
- [Deployment](#deployment)
- [Project Roles & Timeline](#project-roles--timeline)
- [License](#license)

---

## 🔍 Overview

The PYM Scooter app helps pharmacy couriers:
- Reserve a nearby scooter
- Deliver medications between locations
- Park scooters at the most convenient stations near their destination

### 🚉 Scooter Stations
There are five operational stations in Basel:
1. Basel SBB  
2. Bankveria  
3. Claraplatz  
4. St. Johann  
5. Basel Badischer Bahnhof

### 🛵 Scooter Types
- **Long Distance Scooter** – higher battery range for farther deliveries
- **Short Distance Scooter** – optimized for local routes and quick access

---

## ✨ Features

- View station availability with scooter inventory
- Reserve a scooter for courier use
- Return scooters at the destination station
- Admin panel to manage stations, scooters, and availability
- Special rules and pricing logic based on station or scooter type
- API integration for real-time updates

---

## 👥 User Stories

### Courier (User)
1. View list of stations and available scooters
2. Book a scooter for delivery
3. Select appropriate scooter type based on distance
4. End booking and return scooter at nearest station to delivery destination

### Admin
1. Add or update scooter data (type, availability, etc.)
2. Manage station inventory
3. Monitor scooter bookings and returns
4. Adjust pricing and operational logic

---

## 🧩 System Design

### Domain Model
- **User (Courier)**: Login credentials and delivery records
- **Admin**: Manages the operational backend
- **Station**: Location with scooters and capacity
- **Scooter**: Vehicle details (ID, type, battery, status)
- **Booking**: Trip details (duration, start/end station, scooter, user)

### Business Logic
- Long-distance scooters are assigned for deliveries over certain distance thresholds
- Station-specific rules (e.g., Basel Badischer Bahnhof offers delivery discounts)
- Bookings track origin and destination with time stamps

---

## 💻 Technology Stack

### Backend
- Java with **Spring Boot**
- **Spring Data JPA** (H2 DB for testing, PostgreSQL for production)
- RESTful API with **Spring Web**
- **JWT** authentication
- **Swagger/OpenAPI** for documentation

### Frontend (Pluggable)
- Designed for integration with **React.js** or **Vue.js**
- Optional map integration with **Google Maps API** or **OpenStreetMap**
- Styled using **Tailwind CSS** or **Bootstrap**

---

## 🚀 Getting Started

### Local Setup

```bash
# Clone the repo
git https://github.com/yzzydn/PYM-Scooter
cd pym-scooter

# Run backend
mvn spring-boot:run
```

Visit the API: `http://localhost:8080`  
Swagger UI: `http://localhost:8080/swagger-ui.html`

> Frontend is optional and can be set up separately if needed.

---

## ☁️ Deployment

- **Backend** can be deployed to platforms like Render, Railway, or Heroku
- **Frontend** (if used) can go on Vercel or Netlify
- Update environment variables and API URLs accordingly

---

## 🗂 Project Roles & Timeline

### Roles
- **Backend Developer**: Yilmaz Ozaydin
- **Frontend Developer**: Yilmaz Ozaydin

### Milestones
1. Requirements & Use Case Definition
2. Backend Development
3. Frontend Integration (optional)
4. Testing & QA
5. Deployment

---

## 🧑‍🔧 Maintainer

- Yilmaz Ozaydin
- GitHub: yzzydn
- yilmaz.oezaydin@students.fhnw.ch , yilmazozaydig4@gmail.com

---

## 📜 License

Licensed under the **Apache License 2.0**. See the LICENSE file for details.