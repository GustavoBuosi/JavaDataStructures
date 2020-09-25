public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        mergeSort(intArray, 0, intArray.length);
        for (int i: intArray){
            System.out.println(i);
        }

    }

    public static void mergeSort(int[] input, int start, int end){
        // For this implementation, we are first going to partition
        // the array and sort them afterwards. Since each partition
        // is already ordered, the implementation of the algorithm
        // itself is relatively simple.
        if (end - start < 2){
            return;
        }

        int middle = (start + end) / 2 ;
        mergeSort(input, start, middle);
        mergeSort(input, middle, end);
        merge(input, start, middle, end);
    }

    public static void merge(int[] input, int start,int mid, int end){
        // Since both partitions of the array are sorted, we can
        // check if any swapping will be necessary within partitions.

        if (input[mid - 1] <= input[mid]) {
            return;
        }
        // Assigning to i and j the first index of each partition:
        int i = start;
        int j = mid;
        // Creating the index pointer for the temporary array:
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // A second improvement on the algorithm: if we already included
        // all the elements from the left-side of the input array. we don't
        // have to do any ordering on the right-side, because, once again,
        // the partitions are sorted.
        // If we have reached the end of the left-partition, mid = i => mid - i = 0.

        System.arraycopy(input, i,input, start + tempIndex, mid - i);
        // Now, if the elements at the end of the array are sorted already,
        // they position should not change, so we won't de doing unnecessary
        // work.
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}
