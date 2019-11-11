package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class countingCharacters {
    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


        HashMap<Character, Integer> characterCounts = new HashMap<>();

        char[] charactersInString = myString.toCharArray();


        for (char c : charactersInString) {

            if (characterCounts.containsKey(c)) {

                int newCount = characterCounts.get(c) + 1;
                characterCounts.put(c, newCount);

            } else {

                characterCounts.put(c, 1);
            }


        }

        for (char c : characterCounts.keySet()) {
            System.out.println(c + ": " + characterCounts.get(c));
        }


    }
}
