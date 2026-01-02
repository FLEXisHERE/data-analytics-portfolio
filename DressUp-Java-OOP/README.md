# DressUp — Java Console App

## Overview
DressUp is a Java console application that simulates a simple clothing shop experience.
Users can create an account, sign in, and place orders. The project focuses on OOP design
using classes, enums, and packages (User, Orders, Item).

## Features
- Create account (Profile + Account)
- Sign in (username + password check)
- Place an order with shipping address + payment info
- Order items with size/color selection (enums)
- Demonstrates editing item details and changing quantities

## Tools Used
- Java
- Maven project structure
- OOP (Classes, Enums, Packages)

## Project Structure
- `src/main/java/main/DressUpApp.java` → main menu and app logic  
- `User/` → Account, Customer, Profile  
- `Orders/` → Order, OrderItem, Address, ShippingAddress, PaymentInfo  
- `Item/` → Cloth, WorkUniform, Review, WishList  
- `Enum/` → Category, Color, Size, Stars, Type

## How to Run
### Option 1 (Easy): Run in an IDE
1. Open the project in NetBeans / IntelliJ / Eclipse
2. Run: `main.DressUpApp`

### Option 2 (Terminal)
Compile and run from the project root:
```bash
javac -d out src/main/java/main/DressUpApp.java
java -cp out main.DressUpApp
