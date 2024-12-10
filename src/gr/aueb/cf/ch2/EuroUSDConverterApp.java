package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User inserts an amount of Euro
 * and converts it to USD, Cents
 * prints  result in std output.
 */
public class EuroUSDConverterApp {

    public static void main(String[] args) {

        //Αρχικοποίηση και Δήλωση Μεταβλητών
        int inputEuro = 0;
        int inputUsdDolars = 0;
        int inputUsdCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert an amount in Euro");
        inputEuro = in.nextInt();
        inputUsdDolars = inputEuro * PARITY;





    }
}


