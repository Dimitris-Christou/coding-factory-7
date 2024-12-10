package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the positives count.
 */

public class Sentinel {

    public static void main(String[] args) {
        int positiveCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a number");
        inputNum = in.nextInt();

        while (inputNum >= 0) {
            positiveCount++;
            System.out.println("Please insert a number");
            inputNum = in.nextInt();
        }

        System.out.println("Positives count" + positiveCount);
    }
}