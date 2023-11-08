package sorting;

import sorting.algorithms.mergesort.MergeSort;
import sorting.algorithms.quicksort.QuickSort;
import sorting.interfaces.Sorting;
import sorting.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingRunner {

    final static int CAPACITY = 10_000_001;
    final static int FROM = -1000;
    final static int TO = 1000;

    public static void main(String[] args) {

        int[] array1 = Utils.generateArray(CAPACITY, FROM, TO);
        int[] array2 = new int[CAPACITY];
        System.arraycopy(array1, 0, array2, 0, CAPACITY);
//        System.out.println(Arrays.toString(array1));

        List<Sorting> sortings = List.of(
                new MergeSort(array1),
                new QuickSort(array2)
        );

        for (Sorting sorting : sortings) {
            Utils.speedTest(sorting);
        }

//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array1));
    }
}
