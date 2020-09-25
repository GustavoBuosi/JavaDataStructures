public class BubbleSort {
/*
Bubble Sort is an stable quadratic algorithm that
constantly swaps consecutive elements, given that arr[j] > arr[j+1]
 */

    public static void main(String[] args) {

        int[] arr = {20,35,-15,7,55,1,-22};
        int sortedIndex = arr.length;
        for (int i = 0; i < arr.length; i++){
            sortedIndex--;
            for (int j = 0; j < sortedIndex; j++){
                if (arr[j] > arr[j+1]) swap(arr,j);
            }
        }

        for (int integer : arr) {
        System.out.println(integer);
        }

    }


    public static int[] swap(int[] originalArray, int index){
        int aux = originalArray[index];
        originalArray[index] = originalArray[index + 1];
        originalArray[index + 1] = aux;
        return originalArray;
    }

    }




