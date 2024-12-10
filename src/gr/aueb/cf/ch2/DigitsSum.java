package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει από το χρήστη σαν input
 * ένα διψήφιο ακέραιο και να υπολογίζει
 * το άθροισμα των ψηφίων του.
 */
public class DigitsSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum;
        int num;
        num = in.nextInt();
        System.out.println(" Please insert ");
        int leftDigit = num / 10;
        int rightDigit = num % 10;
        sum = leftDigit + rightDigit;
        System.out.printf("Το άθροισμα είναι: %d", sum);

    }
}
