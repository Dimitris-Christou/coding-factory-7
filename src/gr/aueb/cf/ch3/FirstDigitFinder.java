package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο αριστερά ψηφίο
 * ενος ακεραίου.
 */

public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = 0;
        int tempNum = 0;

        System.out.println("Please insert positive integer");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum >= 10) {
            tempNum /= 10;
        }
        System.out.println("The first digit of  " + num + " is " + tempNum);
    }
}
