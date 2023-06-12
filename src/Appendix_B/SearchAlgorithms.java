package Appendix_B;

import java.sql.Array;
import java.util.Arrays;

public class SearchAlgorithms {
    public static int[] bubbleSort(int[] arrayToSort){
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                int temp;
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return arrayToSort;
    }

    public static void main(String[] args){
        int[] arr = {9, 1, 3, 6, 2, 4, 8, 5};
        System.out.println(Arrays.toString(SearchAlgorithms.bubbleSort(arr)));
    }
}
