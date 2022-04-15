package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> charTable = new HashMap<>();
//        int count = 0;
        char[] charInString = quote.toCharArray();
        System.out.println(charInString);
        for (int i = 0; i < charInString.length; i++) {
         if (charTable.containsKey(i)){
             charTable.put(charInString[i], charTable.get(charInString[i]) +1);
System.out.println(charTable);
         }


        }
    }
}
