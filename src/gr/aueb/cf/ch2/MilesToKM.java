package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 * Converts Miles to Kilometers.
 */

public class MilesToKM {

    public static void main(String[] args) {

        final double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometers = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert miles");
        inputMiles = in.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Kilometers: " + kilometers + ", Miles: " + inputMiles);
    }
}
