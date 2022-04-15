package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;

public class countTheCharacters {
    public static void main(String[] args) {
        String phrase = "Sample Sentence";
        char[] characters = phrase.toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            char theCharacter = characters[i];
            //System.out.println(theCharacter);
        }
    }
}
