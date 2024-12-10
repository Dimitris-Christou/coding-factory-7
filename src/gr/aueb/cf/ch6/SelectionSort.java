package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 4, 5, 45, 34, 3, 3, 14};
        int[] sorted = selectionSort(arr);

        for (int el : sorted) {
            System.out.print(el + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // Find Min
            int minPosition = i;
            int minValue = arr[minPosition];

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
                // Swap( minPosition,i)
                swap(arr, minPosition, i);
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}