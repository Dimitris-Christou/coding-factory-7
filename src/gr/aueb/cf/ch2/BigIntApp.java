package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger Demo
 */
public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and Initializations

        BigInteger bigNum1 = new BigInteger("1546546465161651");
        BigInteger bigNum2 = new BigInteger("321635168516161444");
        BigInteger result;

        // Commands

        result = bigNum1.add(bigNum2);

        // Printing the results

        System.out.printf("%,d", result);

    }

    }

