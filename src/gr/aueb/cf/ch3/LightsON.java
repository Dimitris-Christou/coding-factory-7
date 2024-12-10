package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining AND
 * car is running >100 OR is dark.
 */
public class LightsON {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        final int MAX_CAR_SPEED = 100;
        int speed = 0 ;
        boolean lightsOn = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert speed");
        speed = in.nextInt();
        isRunning = speed > MAX_CAR_SPEED;

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        lightsOn = isRaining && (isRunning || isDark);
        // lightsOn = (isRaining && isRunning) || (isRaining && isDark)

        System.out.println("Turn lights on: " + lightsOn);

    }
}
