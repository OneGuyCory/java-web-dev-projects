package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        float length = input.nextFloat();

        System.out.println("What is the width of the rectangle?");
        float width = input.nextFloat();

        float area = length * width;
        System.out.println("The area of your rectangle is " + area);

    }
}
