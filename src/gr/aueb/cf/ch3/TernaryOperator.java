package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common
 * use care, that is conditional assignment.
 */

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.printf("Please enter num");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        System.out.printf("abs: ", abs);
    }
}
