package org.launchcode.java.studios.restaurant;
import java.util.ArrayList;

public class MenuItem {
    private Double price;
    private String description;
    private ArrayList<String> category;

    public MenuItem (Double aPrice, String aDescription, ArrayList<String> aCategory){
        price = aPrice;
        description = aDescription;
        category = aCategory;
    }

    public Double getPrice() {
        return price;
    }
    public String getDescription(){
        return description;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }
}
