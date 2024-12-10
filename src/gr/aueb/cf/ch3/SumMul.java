package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul
 * of first ten integers.
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int j = 1;
        int mul = 1;

        while ( i <= 10) {
            sum += i;
            // sum = sum + i;
            i++;
        }
        System.out.println("Sum: " + sum);

        while (j <= 10) {
            mul = mul * j;
            j++;
        }
        System.out.println("Mul: " + mul);
    }
}
