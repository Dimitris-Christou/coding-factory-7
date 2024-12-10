package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */

public class PriceWithVat {

    public static void main(String[] args) {

        final double VAT_RATE = 0.24;
        Scanner in = new Scanner(System.in);
        double inputPrice = 0.0;
        double fullPrice = 0.0;
        double vat = 0.0;

        System.out.println("Please insert price");
        inputPrice = in.nextDouble();
        vat = inputPrice * VAT_RATE;
        fullPrice = inputPrice + vat;

        System.out.printf("Price: %2f, Vat: %2f, Full Price: %2f", inputPrice, vat, fullPrice);
    }
}
