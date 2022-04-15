package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countTheCharacters {
  public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a string");

    String phrase = input.nextLine();
    char[] characters = phrase.toCharArray();
    HashMap<Character, Integer> charCounts = new HashMap<>();

    for (int i = 0; i < characters.length; i++) {
      if (charCounts.containsKey(characters[i])) {
        charCounts.put(characters[i], charCounts.get(characters[i]) + 1);
      } else {
        charCounts.put(characters[i], 1);
      }
    }

    for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {
      System.out.println(charCount.getKey() + ": " + charCount.getValue());
    }
  }
}
