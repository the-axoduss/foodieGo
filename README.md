# 🍽️ FoodieGo

FoodieGo is a **Zomato-like online food ordering and delivery application** built with **React.js**, **Spring Boot**, **MySQL**, **Stripe Payment Gateway**, and **Redux**.  
It allows users to browse restaurants, view menus, add items to their cart, make secure online payments, and receive updates through the **Notification System**.  
Admins can manage the entire platform with a dedicated **Admin Dashboard**.

---

## 🚀 Features

### 👥 User Features
- 🔐 **Authentication & Authorization** (JWT-based)
- 🍴 **Browse Restaurants & Menus**
- 🛒 **Add to Cart & Checkout**
- 💳 **Stripe Payment Integration**
- 📦 **Order Tracking**
- 🔔 **Real-time Notifications** (order updates, offers, payment status)
- 🎨 **Modern UI with React & Tailwind CSS**
- 📱 **Responsive Design (Mobile-friendly)**

### 🛠️ Admin Features
- 📊 **Admin Dashboard** with analytics
- 🏪 **Add / Edit / Delete Restaurants**
- 📋 **Manage Menus & Items**
- 🧾 **View & Manage Orders**
- 👤 **User Management**
- 💰 **Track Payments**
- 🔔 **Send Notifications** to users about order status, offers, or restaurant updates

---

## 🛠️ Tech Stack

### Frontend
- React.js  
- Redux Toolkit  
- Tailwind CSS  

### Backend
- Spring Boot  
- MySQL (Relational Database)  
- Stripe API (Payment Gateway)  
- WebSockets / Push Notifications  

### Tools & Others
- Axios (API calls)  
- Postman (API testing)  
- Git & GitHub  

---

## 📂 Project Structure

FoodieGo/
│── client/ # React.js frontend
│ ├── src/
│ │ ├── components/ # Reusable UI components
│ │ ├── pages/ # User-facing pages
│ │ ├── admin/ # Admin dashboard pages
│ │ ├── redux/ # Redux store & slices
│ │ └── App.js
│── server/ # Spring Boot backend
│ ├── src/main/java/
│ │ ├── controllers/ # REST API controllers
│ │ ├── models/ # Entity classes
│ │ ├── repositories/ # JPA Repositories
│ │ ├── services/ # Business logic
│ │ └── notifications/# Notification service (WebSockets / Firebase / Push)
│── README.md

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository
```bash
git clone https://github.com/your-username/foodiego.git
cd foodiego
2️⃣ Backend Setup (Spring Boot)
Import the project into IntelliJ/Eclipse.

Configure MySQL database in application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/foodiego
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the Spring Boot application.

3️⃣ Frontend Setup (React.js)
bash
Copy code
cd client
npm install
npm start
4️⃣ Stripe Setup
Create a Stripe account: https://stripe.com

Add your Stripe Secret & Publishable keys in backend config.

5️⃣ Notifications Setup
Option 1: WebSockets (Spring Boot STOMP + React client) for real-time updates

Option 2: Firebase Cloud Messaging (FCM) for push notifications

🔮 Future Enhancements
✅ Delivery Partner App

✅ Reviews & Ratings System

✅ AI-powered Recommendations

✅ Push Notifications for Marketing Campaigns

👨‍💻 Author
Arjun Pandey
Full Stack Developer | Java | Spring Boot | React | MySQL
LinkedIn | GitHub
