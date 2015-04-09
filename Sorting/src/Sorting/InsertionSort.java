package Sorting;

public class InsertionSort {
    /**
     * insertionSort			sorts an array of integers using insertion sort
     * 
     * @param unsortedArray		an unsorted array of integers
     * @return					the input array, sorted least to greatest
     */
    public static int[] insertionSort(int[] unsortedArray) {
        //TODO: S2 implements insertion sort
        int maxValue
        for (int i = 0; i < unsortedArray.length; i++) {
            int currVal = unsortedArray[i];
            boolean flag = true
                for (int j = i - 1; (i >= 0) && flag; i--) {
                int prevVal = unsortedArray[j];
                if (prevVal > currVal) {
                    unsortedArray[j] = currVal;
                    unsortedArray[j + 1] = prevVal;
                } else {
                    flag = false;
                }
            }
        }
        return null;
    }

    public static int
}
