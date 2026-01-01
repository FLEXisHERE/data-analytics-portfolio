/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders;
import User.Account;
import java.util.GregorianCalendar; 

/**
 *
 * @author ilyass
 */

public class Order {
    private  static int order_number = 0;
    private final GregorianCalendar DATE_PLACED;
    private PaymentInfo payment;
    private ShippingAddress address;
    private Account customer;

    public Order(GregorianCalendar DATE_PLACED, PaymentInfo payment, ShippingAddress address, Account customer) {
        this.DATE_PLACED = DATE_PLACED;
        this.payment = payment;
        this.address = address;
        this.customer = customer;
        order_number++;
    }

    public static int getOrder_number() {
        return order_number;
    }

    public GregorianCalendar getDATE_PLACED() {
        return DATE_PLACED;
    }

    public PaymentInfo getPayment() {
        return payment;
    }

    public ShippingAddress getAddress() {
        return address;
    }

    public Account getCustomer() {
        return customer;
    }

    public void setPayment(PaymentInfo payment) {
        this.payment = payment;
    }

    public void setAddress(ShippingAddress address) {
        this.address = address;
    }

    public void setCustomer(Account customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" + "DATE_PLACED=" + DATE_PLACED + ", payment=" + payment + ", address=" + address + ", customer=" + customer + '}';
    }

}
