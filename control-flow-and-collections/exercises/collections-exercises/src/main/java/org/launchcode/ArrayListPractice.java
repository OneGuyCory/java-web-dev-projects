package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        words.add("Susie");
        words.add("Cory");
        words.add("Robert");
        words.add("Lucas");
        words.add("Quintin");
        words.add("Benjamin");
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        for (int num : nums) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        System.out.println(sum);

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }

    }
}
