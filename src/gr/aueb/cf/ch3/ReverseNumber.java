package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρέφει έναν ακέραιο. Για παράδειγμα
 * το 123 γίνεται 321.
 */

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reverse = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Please insert integer");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reverse = reverse * 10 + rightDigit;
            tempNum /= 10;
        }

        System.out.println("The reverse number is: " + reverse);
    }
}
