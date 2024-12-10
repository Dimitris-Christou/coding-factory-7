package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9};
        int[] arr2 = {12, 22, 32, 102};

        System.out.println(Arrays.toString(getEvens(arr)));

        System.out.println(Arrays.toString(mapToDouble(arr)));

        System.out.println(sum(arr));

        System.out.println(average(arr));

        System.out.println(anyEven(arr));

        System.out.println(anyEven(arr));

        System.out.println(moreThanTwoConsecutive(arr));

        System.out.println(moreThanTwoWithSameEnding(arr));

        System.out.println(moreThanTwoWithSameEnding(arr2));

        System.out.println(allAreEven(arr));

        System.out.println(allAreEven(arr2));
    }

    public static int[] getEvens(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    } // Filtering

    public static int[] mapToDouble(int[] arr) {

        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }

        return mapped;
    } // Mapping

    public static int sum(int[] arr) {
        int sum = 0;
        for (int el : arr){
            sum += el;
        }
        return sum;
    }

    public static double average(int[] arr) {
        double avg = 0;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        avg =(double) sum / arr.length;
        return avg;

        // return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {

        boolean isAnyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {

        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++){
            if (arr[i] == arr[i+1] -1 && arr[i] == arr[i+2] - 2){
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];

        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding =true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean allAreEven(int[] arr) {
//        return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }
}
