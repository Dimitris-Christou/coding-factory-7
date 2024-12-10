package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Προπαίδεια ενός ακερα'ιου που δίνει ο χρήστης.
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("Please insert an integer");
        inputNum = scanner.nextInt();

        while (i <= 10) {
             System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            // System.out.printf("%d * %d = %d\n", inputNum, i, inputNum * i);
            i++;
        }
    }
}
