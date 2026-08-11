package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8 };
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        for (int num : nums) {
            System.out.println(num);
        }

        String[] words = sentence.split(" " );
        System.out.println(Arrays.toString(words));

        String[] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
