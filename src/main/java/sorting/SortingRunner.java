package sorting;

import sorting.interfaces.Sorting;
import sorting.algorithms.quicksort.QuickSort;
import sorting.utils.Utils;

import java.util.Arrays;

public class SortingRunner {
    public static void main(String[] args) {

        int[] array = Utils.generateArray(10, -10, 5);
        System.out.println(Arrays.toString(array));
        Sorting sorting = new QuickSort(array);
        sorting.sort();
        System.out.println(Arrays.toString(array));
    }
}
