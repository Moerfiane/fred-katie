package org.launchcode.java.studios.studio7;

public class Main {

    public static void main(String[] args){

    CD myCD = new CD((int) 1e6);
    DVD myDVD = new DVD((int) 4.7e9);
    // TODO: Call each CD and DVD method to verify that they work as expected.
    myCD.spinDisc();
    myDVD.spinDisc();
    }
}