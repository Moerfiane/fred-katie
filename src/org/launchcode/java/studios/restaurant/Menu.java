package org.launchcode.java.studios.restaurant;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args){
        MenuItem m1 = new MenuItem ("Ice-Cream",10,"Special sundae ice-cream","Dessert");
        System.out.println("Menu Item: " + m1.getName() + "\n" + "Category: " + m1.getCategory());
    }

}
