package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι το όριο το οποίο δίνει ο
 * χρήστης.
 */

public class SumOfEvensApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int i = 2;
        int sum = 0;

        System.out.println("Please insert upper limit");
        inputNumber = scanner.nextInt();

        while ( i <= inputNumber) {
            sum += i;
            i+= 2;
        }
        System.out.println("The sum is: " + sum);
    }
}
