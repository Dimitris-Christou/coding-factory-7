package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        String line;
        String[] tokens;
        File fd = new File("C:/Windows/Temp/file7.txt");  // C:\tmp\file7.txt

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
