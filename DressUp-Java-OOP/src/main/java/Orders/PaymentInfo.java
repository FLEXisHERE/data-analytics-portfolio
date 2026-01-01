/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders;
import Enum.Type;
import java.util.GregorianCalendar;


public class PaymentInfo {
    private String holderName;
    private GregorianCalendar expiration;
    private Type type;
    private int number;

    public PaymentInfo(String holderName, GregorianCalendar expiration, Type type, int number) {
        this.holderName = holderName;
        this.expiration = expiration;
        this.type = type;
        this.number = number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public GregorianCalendar getExpiration() {
        return expiration;
    }

    public void setExpiration(GregorianCalendar expiration) {
        this.expiration = expiration;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" + "holderName=" + holderName + ", expiration=" + expiration + ", type=" + type + ", number=" + number + '}';
    }
    
}