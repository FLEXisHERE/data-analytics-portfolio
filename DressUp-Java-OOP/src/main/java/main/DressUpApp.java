/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import Orders.*;
import User.*;
import Item.*;
import Enum.*;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author ilyass
 */
public class DressUpApp {
    private static Customer customer;
    
    
    public static void main(String[] args) {
        // Prompt the User to Sign-in or Create a New Account
       
        
        try (Scanner scan = new Scanner(System.in )) {
          
            while(true) {
            System.out.println("----------------------------\n### Welcome to DressUp! ###");
            System.out.print("Click :\n\t(1) Sign in\n\t(2) Create a new account\n\t(3) Order an item\n\t(4) Exit\n");
            int choice = scan.nextInt();
            
                switch (choice) {
                    case 1 -> {
                        // User Wants to Log-in with an Existing Account
                        if(customer != null) { 
                            System.out.print("Enter username: ");
                            String username = scan.next();
                            System.out.print("Enter password: ");
                            String password = scan.next();
                            if (customer.getAccount().getUsername().equals(username) && customer.getAccount().getPassword().equals(password)) {
                                System.out.println("Login successful!");
                            } else {
                                System.out.println("Login failed. Please check your username and password.");
                            }
                        }else {
                            System.out.println("No customer is registered. Sign up first.");
                        }
                    }
                    
                    case 2 -> {
                        // User Wants to Create a New Account
                        System.out.print("Enter your first name: ");
                        String firstName = scan.next();
                        System.out.print("Enter your last name: ");
                        String lastName = scan.next();
                        System.out.print("Enter your address: ");
                        String address = scan.next();
                        System.out.print("Enter your email: ");
                        String email = scan.next();
                        System.out.print("Enter your phone number: ");
                        String phone = scan.next();
                        System.out.print("Create a username: ");
                        String username = scan.next();
                        System.out.print("Create a password: ");
                        String password = scan.next();

                        // Create a New Profile and Account for the Customer
                        Profile customerProfile = new Profile(firstName, lastName,address, email, phone);
                        Account customerAccount = new Account(username, password);

                        // Create a New Customer with the Profile and Account
                        customer = new Customer(customerProfile, customerAccount);
                        
                        // Display Customer Information
                        System.out.println("New account created for " + customerProfile.toString());
                        System.out.println("With: " + customerAccount.toString());
                    }
                    
                    case 3 -> {
                        // Checking if the user is registred
                        if(customer == null) {
                            System.out.println("You can not order if you are not registred.");
                        }else {
                            Account customerAccount = customer.getAccount();
                            GregorianCalendar expiration = new GregorianCalendar();
                            GregorianCalendar DATE_PLACED = new GregorianCalendar();
                            
                            
                            // Entering the Address of the User
                            System.out.println("Please enter your address informations: ");
                            System.out.print("Enter your first name: ");
                            String firstName = scan.next();                            
                            System.out.print("Please enter your street address: ");
                            String streetAddress = scan.next();
                            System.out.print("Please enter your city: ");
                            String city = scan.next();
                            System.out.print("Please enter your postal code: ");
                            String postalCode = scan.next();
                            System.out.print("Please enter the holder name: ");
                            String holderName = scan.next(); 
                            System.out.print("Please enter the type of card:\n");
                            for (Type type : Type.values()) {
                                System.out.println("# " + type);
                            }
                            // Convert the user input to uppercase (in case the user enters lowercase)                            
                            String userInput = scan.next().toUpperCase();                            
                            Type type = Type.valueOf(userInput);
                            System.out.print("Enter your phone number: ");
                            String phone = scan.next();
                            System.out.print("Enter your card number: ");
                            int number = scan.nextInt();

                           
                            Address location = new Address(streetAddress, city, postalCode);
                            ShippingAddress shippingAddress = new ShippingAddress(firstName, phone, location);
                            PaymentInfo payment = new PaymentInfo(holderName, expiration, type, number);
                            
                            Size[] availableSizes = {Size.SMALL, Size.MEDIUM, Size.LARGE};
                            Color[] availableColors = {Color.WHITE, Color.BLUE, Color.BLACK};                           
                            // Ordering Item 
                            Cloth cloth1 = new Cloth("T-shirt", "It's 100% cotton t-shirt", 199.99, Category.SWEATERS, availableSizes,availableColors);
                            OrderItem orderItem1 = new OrderItem(cloth1, 2, Size.MEDIUM, Color.BLACK);

                            Cloth cloth2 = new Cloth("Jacket", "Warm jacket", 309.99, Category.DRESSES, availableSizes, availableColors);
                            OrderItem orderItem2 = new OrderItem(cloth2, 1, Size.LARGE, Color.WHITE);

                            //Display 
                            System.out.println("\n" + orderItem1.toString());
                            System.out.println("\n" + orderItem2.toString());
                            System.out.println(cloth1.toString());
                            System.out.println(cloth2.toString());


                            //Editing the cloth
                            cloth1.editDetails();
                            cloth2.editDetails();
                            // Display the items after editing the cloths
                            System.out.println("Updated cloth after editing the items : ");
                            System.out.println(cloth1.toString());
                            System.out.println(cloth2.toString());


                            // Change the quantity of the items
                            orderItem1.changeQty();
                            orderItem2.changeQty();
                            // Display the order of items after changing the quantity
                            System.out.println("Updated OrderItem after changing the quantity: ");
                            System.out.println("\n" + orderItem1.toString());
                            System.out.println("\n" + orderItem2.toString());

                            Order order = new Order(DATE_PLACED, payment, shippingAddress, customerAccount);
                            System.out.println(order.toString() + "\n");                       
                        }
                    }
                    
                    case 4 -> {
                        // Exiting the Program
                        System.out.println("Have a Great Day!");
                        scan.close();
                        System.exit(0);
                    }
                    default ->System.out.println("Invalid choice :( \nPlease enter 1 to sign in or 2 to create a new accountor or 3 to order an item or 4 to exit.");
                }
            } 
        }
    }
}
