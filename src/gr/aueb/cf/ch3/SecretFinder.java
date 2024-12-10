package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένα SECRET που είναι ακέραιος και ο χρήστης
 * με μία μόνο προσπάθεια θα δοκιμάσει να τον
 * βρει.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Please guess an integer");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!!");
        } else  {
            System.out.println("Failure!!!");
        }
    }
}
