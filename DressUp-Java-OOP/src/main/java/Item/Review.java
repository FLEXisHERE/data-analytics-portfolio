/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;
import Enum.Stars;
import User.Account;
import java.util.GregorianCalendar;


public class Review {
    private final String comments;
    private final GregorianCalendar date;
    private final Account user;
    private Stars rating;

    public Review(String comments, GregorianCalendar date, Account user, Stars rating) {
        this.comments = comments;
        this.date = date;
        this.user = user;
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public Account getUser() {
        return user;
    }

    public Stars getRating() {
        return rating;
    }

    public void setRating(Stars rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" + "comments=" + comments + ", date=" + date + ", user=" + user + ", rating=" + rating + '}';
    }
    
}
