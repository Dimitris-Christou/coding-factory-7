package gr.aueb.cf.ch7;

public class immutableStr {

    public static void main(String[] args) {

        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // s1 remains immutable
        s1 = "Athens";

    }
}
