package gr.aueb.cf.ch6;

/**
 * Searches if an array has an element
 * and updates that element to a new one.
 */
public class ReplaceElementApp {

    public static void main(String[] args) {

    }

    public static int getPosition(int[] arr, int value) {

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static void replace(int[] arr, int oldValue, int newValue) {

        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldValue);

        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newValue;
    }
}
