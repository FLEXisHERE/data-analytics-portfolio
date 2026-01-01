/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;
import Enum.Category;
import Enum.Color;
import Enum.Size;

public class WorkUniform extends Cloth{
    private String job;
    private int dirt_level;
    private Review review[];
    
    public WorkUniform(String job, int dirt_level,Review reviews[], String title, String description, double price, Category cat, Size[] sizes, Color[] colors) {
        super(title, description, price, cat, sizes, colors);
        this.job = job;
        this.dirt_level = dirt_level;
    }

    public String getJob() {
        return job;
    }

    public int getDirt_level() {
        return dirt_level;
    }

    public Review[] getReview() {
        return review;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDirt_level(int dirt_level) {
        this.dirt_level = dirt_level;
    }

    public void setReview(Review[] review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return super.toString() + "WorkUniform{" + "job=" + job + ", dirt_level=" + dirt_level + '}';
    }
}
