/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import Orders.Order;
import java.util.List;

public class Customer {
    private Profile profile;
    private Account account;
    private List<Order> orders;

    public Customer(Profile profile, Account account) {
        this.profile = profile;
        this.account = account;
        this.orders = orders;
    }   

    public Profile getProfile() {
        return profile;
    }

    public Account getAccount() {
        return account;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "profile=" + profile + ", account=" + account + ", orders=" + orders + '}';
    }
}
