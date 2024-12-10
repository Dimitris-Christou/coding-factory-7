package gr.aueb.cf.ch6;

public class ArrayMinMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr, int low , int high) {
        if (low > 0 || high > arr.length) return -1;
        if (arr == null || arr.length < 1) return -1;
        if (low > high) return -1;

        int minPosition = low;
        int minValue = arr[low];

        for (int i = 1; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }

        }
        return minPosition;

    }
}
