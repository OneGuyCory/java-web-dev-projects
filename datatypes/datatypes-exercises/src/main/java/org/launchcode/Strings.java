package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstAlice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        String lowerAlice = firstAlice.toLowerCase();

        System.out.println("What term would you like to search?");
        String searchTerm = input.nextLine().toLowerCase();

        int stringLength = searchTerm.length();
        int index = lowerAlice.indexOf(searchTerm);
        String newAlice = lowerAlice.replace(searchTerm, "");

        System.out.println(lowerAlice.contains(searchTerm));
        System.out.println("Your term appears at the index " + index + " , it is " + stringLength +
                " characters long.");
        System.out.println(newAlice);
    }
}
