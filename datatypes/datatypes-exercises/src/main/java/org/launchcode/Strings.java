package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String example = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was reading, but it had" +
                " no pictures or conversations in it, ‘and what is the use of a" +
                " book,’ thought Alice ‘without pictures or conversation?’";

        String sentence = example.toLowerCase();

        System.out.println("What word would you like to search for?");
        String searchTerm = input.nextLine().toLowerCase();
        int index = sentence.indexOf(searchTerm);
        int searchLength = searchTerm.length();
        String newSentence = sentence.replace(searchTerm, "");

        System.out.println(sentence.contains(searchTerm));

        System.out.println("Your term occurs at index " + index + " it has a length of " + searchLength);
        System.out.println(newSentence);
    }
}
