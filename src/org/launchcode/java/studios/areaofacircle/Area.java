package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius: ");
        double radius= input.nextDouble();
        if (radius <= 0 ){
            System.out.println("Must enter positive number !!");
        } else {
            double area= radius * 3.14 * radius;
            System.out.println("area of circle is " + area);
        }
        input.close();

    }
}
