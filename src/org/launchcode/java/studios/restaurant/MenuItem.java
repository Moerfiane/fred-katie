package org.launchcode.java.studios.restaurant;
import java.util.ArrayList;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;

    public MenuItem (String aName,double aPrice, String aDescription, String aCategory){
        name = aName;
        price = aPrice;
        description = aDescription;
        category = aCategory;
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public String getDescription(){
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
