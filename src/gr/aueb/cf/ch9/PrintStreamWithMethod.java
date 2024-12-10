package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

       try (PrintStream ps = new PrintStream("C:/Windows/Temp/file7.txt", StandardCharsets.UTF_8)) {
           printMessage(ps, "Hello Coding Factory");
           printMessage(System.out, "Hello CF!");

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    /**
     * Generic PrintStream method
     * @param ps  the input PrintStream
     * @param message the input message
     */

    public static void printMessage (PrintStream ps, String message) {
        ps.println(message);
    }
}
