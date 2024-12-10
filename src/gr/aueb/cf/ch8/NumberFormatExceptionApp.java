package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputString = "";

//        try {
            System.out.println("Please insert int");
            inputString = in.nextLine();

            if (!isInt(inputString)) {
                System.out.println("Error in parsing");
                System.exit(1);
            }

            num = Integer.parseInt(inputString);

            System.out.println(num);
//        } catch (NumberFormatException e) {
//            System.out.println("Input must be an int");
//        }
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
