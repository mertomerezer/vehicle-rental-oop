🚗 Vehicle Rental OOP System
📌 Overview

This project is a simple Java Object-Oriented Programming (OOP) practice project that simulates a vehicle rental system.
It allows customers to rent and return different types of vehicles such as cars, trucks, and motorcycles.

The main purpose of this project is to practice core OOP concepts in Java.

🎯 Features
Rent different types of vehicles
Return rented vehicles
Prevent double renting of the same vehicle
Prevent a customer from renting more than one vehicle
Calculate rental price based on number of days
Simple console-based system
🧠 OOP Concepts Used
Inheritance
Car, Truck, and Motorcycle extend Vehicle
Abstraction
Vehicle is an abstract class
calculateRent(int days) is implemented by each vehicle type
Polymorphism
Each vehicle type has its own rental calculation logic
Encapsulation
Fields are protected/private with getters and setters
🏗️ Project Structure
Vehicle (abstract class)
├── Car
├── Truck
└── Motorcycle

Customer
RentalService
Main
⚙️ How It Works
Vehicles are created
A customer is created
RentalService manages renting and returning vehicles
System checks if:
Vehicle is already rented
Customer already has a vehicle
Rental price is calculated based on days
▶️ Example Flow
Customer rents a vehicle
System calculates total price
Vehicle is marked as rented
Customer returns vehicle
Vehicle becomes available again
🧪 Purpose

This project was created for learning purposes to improve understanding of Java OOP principles, class relationships, and basic system design.

🚀 Future Improvements
Add multiple customers support
Store vehicles in a list instead of single objects
Add database integration
Build a GUI or web version
Add discounts and pricing rules
👨‍💻 Author

Built as a personal Java OOP learning project.
