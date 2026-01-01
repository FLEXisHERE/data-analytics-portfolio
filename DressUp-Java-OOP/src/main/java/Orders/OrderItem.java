/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders;
import Item.Cloth;
import Enum.Color;
import Enum.Size;
import java.util.Scanner;

public class OrderItem {
    private Cloth cloth;
    private int qty;
    private Size size;
    private Color color;

    public OrderItem(Cloth cloth, int qty, Size size, Color color) {
        this.cloth = cloth;
        this.qty = qty;
        this.size = size;
        this.color = color;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public int getQty() {
        return qty;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "cloth=" + cloth + ", qty=" + qty + ", size=" + size + ", color=" + color + '}';
    }
    
    public void changeQty() {
        Scanner scanner = new Scanner(System.in);

        // Consume the newline character left in the buffer
        scanner.nextLine();

        System.out.print("Enter the new quantity: ");

        // Check if the next input is an integer
        if (scanner.hasNextInt()) {
            int newQty = scanner.nextInt();

            if (newQty >= 0) {
                this.qty = newQty;
            } else {
                System.out.println("Quantity cannot be negative. No changes made.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer. No changes made.");
        }
    }
}
