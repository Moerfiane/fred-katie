package org.launchcode.java.studios.countingCharacters;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> charOccurrence = new HashMap<>();
        char[] arrayOfChars = quote.toCharArray();
        for(char c: arrayOfChars) {
            if (c != ' ') {
                if (charOccurrence.containsKey(c)) {
                    charOccurrence.put(c, charOccurrence.get(c) + 1);
                } else {
                    charOccurrence.put(c, 1);
                }
            }
        }

            for (Map.Entry<Character, Integer> ch : charOccurrence.entrySet()) {
                System.out.println(ch.getKey() + ":" + ch.getValue());
            }

    }
}