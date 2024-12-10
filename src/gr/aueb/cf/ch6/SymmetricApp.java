package gr.aueb.cf.ch6;

public class SymmetricApp {

    public static void main(String[] args) {
        int[] arr2 = {5, 3, 4, 3, 5};
//        int[] arr = {6, 7, 3, 4, 5, 45, 34, 3, 3, 14};
        System.out.println(isSymmetric(arr2));

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }

        }
        return isSymmetric;
    }

    public static boolean isArraySymmetric(int[] arr) {
         boolean isSymmetric = true;
         int n = arr.length - 1;

         for (int i = 0; i < n / 2; i++) {
             if (arr[i] != arr[n - 1]) {
                 isSymmetric = false;
                 break;
             }
         }
         return isSymmetric;
    }
}
