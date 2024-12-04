package org.launchcode;

import java.util.Scanner;

public class MIlesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        float miles = input.nextFloat();

        System.out.println("How many gallons of gas have you used?");
        float gallons = input.nextFloat();

        float milesPerGallon = miles / gallons;

        System.out.println("Your current miles per gallon is " + milesPerGallon);
    }
}
