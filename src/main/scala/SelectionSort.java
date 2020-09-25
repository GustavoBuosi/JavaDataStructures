

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int sortedIndex = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sortedIndex--;
            int greatestUnsortedIndex = 0;
            for (int j = sortedIndex; j > 0; j--) {
                if (arr[j] > arr[greatestUnsortedIndex]) greatestUnsortedIndex = j;

            }
            swap(arr, sortedIndex, greatestUnsortedIndex);
        }

        for (int integer : arr) {
            System.out.println(integer);
        }
    }

    public static int[] swap(int[] originalArray, int i, int j) {
        int aux = originalArray[i];
        originalArray[i] = originalArray[j];
        originalArray[j] = aux;
        return originalArray;
    }
}
