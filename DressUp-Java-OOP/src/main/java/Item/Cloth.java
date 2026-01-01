/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;
import Enum.*;
import java.util.Arrays;
import java.util.Scanner;


public class Cloth  {
    private String title;
    private String description;
    private double price;
    private Category cat;
    private Size sizes[];
    private Color colors[];

    public Cloth(String title, String description, double price, Category cat, Size[] sizes, Color[] colors) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.cat = cat;
        this.sizes = sizes;
        this.colors = colors;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Category getCat() {
        return cat;
    }

    public Size[] getSizes() {
        return sizes;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public void setSizes(Size[] sizes) {
        this.sizes = sizes;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Cloth{" + "title=" + title + ", description=" + description + ", price=" + price + ", cat=" + cat + ", sizes=" + Arrays.toString(sizes) + ", colors=" + Arrays.toString(colors) + '}';
    }  
    
    public void editDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect the detail to edit:");
        System.out.println("1. Title");
        System.out.println("2. Description");
        System.out.println("3. Price");
        System.out.println("4. Category");
        System.out.println("5. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {          
            case 1 -> {
                System.out.print("Enter new title: ");
                setTitle(scanner.nextLine());
            }

            case 2 -> {
                System.out.print("Enter new description: ");
                setDescription(scanner.nextLine());
            }

            case 3 -> {
                System.out.print("Enter new price: ");
                setPrice(scanner.nextDouble());
            }

            case 4 -> {
                System.out.println("Choose a new category: ");
                for (Category category : Category.values()) {
                    System.out.println(category);
                }
                System.out.print("Enter new category: ");
                setCat(Category.valueOf(scanner.next().toUpperCase()));
            }
            case 5 -> {
                // Exiting the menu
                System.out.println("Exiting the edit details menu.");
                break;
            }
            default -> System.out.println("Invalid choice. No changes made.");
        }
    }    
}
