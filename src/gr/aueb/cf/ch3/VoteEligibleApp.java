package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Asks the age of a person and checks
 * if they have the right to vote.
 * Voting age >= 18
 */

public class VoteEligibleApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int age;
        boolean isEligible = false;

        System.out.println("Enter your age");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible to vote: " + isEligible);
    }
}
