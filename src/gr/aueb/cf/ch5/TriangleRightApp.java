package gr.aueb.cf.ch5;

import java.util.Scanner;

public class TriangleRightApp {

    public static void main(String[] args) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        Scanner scanner =new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.println("Please enter b, b, a");
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        a = scanner.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }
    }
}
