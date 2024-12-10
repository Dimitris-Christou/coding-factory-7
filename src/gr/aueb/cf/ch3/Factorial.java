package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calcultes n!
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input number");
        inputNum = in.nextInt();

        // facto =...
        while (i <= inputNum) {
            facto *= i;
            i++;
        }

        System.out.println("Factorial" + facto);
    }
}


