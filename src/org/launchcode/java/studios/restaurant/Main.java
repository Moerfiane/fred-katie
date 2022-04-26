package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("in main");
        MenuItem itemOne = new MenuItem(14.99, "hamburger", "Entree");
//        System.out.println(itemOne.getDescription());
//        System.out.println(itemOne.getPrice());
//        System.out.println(itemOne.getCategory());
//        System.out.println(itemOne.isNew());
        MenuItem itemTwo = new MenuItem(5.99, "taco", "Entree");
//        System.out.println(itemTwo.getDescription());
//        System.out.println(itemTwo.getPrice());
//        System.out.println(itemTwo.getCategory());
//        System.out.println(itemTwo.isNew());
        MenuItem itemThree = new MenuItem(6.99, "Cheese Cake", "Dessert");
        MenuItem itemFour = new MenuItem(2.99, "Chicken Nuggets", "Appetizer");


//        Menu restaurantMenuOne = new Menu();
//        System.out.println(restaurantMenuOne);
//        System.out.println(restaurantMenuOne.getLastUpdated());
//        System.out.println(restaurantMenuOne.getMenuItems());


        Menu restaurantMenuTwo = new Menu(new ArrayList<MenuItem>(Arrays.asList(itemOne, itemTwo,itemThree,itemFour)));
        //System.out.println(restaurantMenuTwo);
       // System.out.println(restaurantMenuTwo.getMenuItems());
        System.out.println(itemOne);

        System.out.println(restaurantMenuTwo.getLastUpdated());
        //System.out.println(restaurantMenuTwo.getMenuItems());
        ArrayList<MenuItem> items=restaurantMenuTwo.getMenuItems();
        items.remove(itemTwo);
        System.out.println(items);



        // I didn't test out my setters, but feel free!
    }
}
