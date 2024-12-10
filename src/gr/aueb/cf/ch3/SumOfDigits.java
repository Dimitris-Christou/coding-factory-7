package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of the digits of
 * an integer.
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Please insert a positive integer");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;
        }

        System.out.printf("The sum of the digits of %d is: %d", inputNum, sum);
    }
}
