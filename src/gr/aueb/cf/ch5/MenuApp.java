package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού στον χρήστη
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice is not valid");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1.Εισαγώγη");
        System.out.println("2.Διαγραφή");
        System.out.println("3.Αναζήτηση");
        System.out.println("4.Ενημέρωση");
        System.out.println("5.¨Εξοδος");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {

            case 1:
                System.out.println("1.Εισαγώγη");
                break;
            case 2:
                System.out.println("2.Διαγραφή");
                break;
            case 3:
                System.out.println("3.Αναζήτηση");
                break;
            case 4:
                System.out.println("4.Ενημέρωση");
                break;
            case 5:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}
