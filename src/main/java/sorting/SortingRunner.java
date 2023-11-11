package sorting;

import sorting.algorithms.bubblesort.BubbleSort;
import sorting.algorithms.mergesort.MergeSort;
import sorting.algorithms.quicksort.QuickSort;
import sorting.interfaces.Sorting;
import utils.Utils;

import java.util.List;

public class SortingRunner {

    final static int CAPACITY = 1_000_000;
    final static int FROM = -1000;
    final static int TO = 1000;

    public static void main(String[] args) {

        int[] array1 = Utils.generateRandomArray(CAPACITY, FROM, TO);
        int[] array2 = new int[CAPACITY];
        int[] array3 = new int[CAPACITY];
        System.arraycopy(array1, 0, array2, 0, CAPACITY);
        System.arraycopy(array1, 0, array3, 0, CAPACITY);
//        System.out.println(Arrays.toString(array1));

        List<Sorting> sortings = List.of(
                new MergeSort(array1),
                new QuickSort(array2),
                new BubbleSort(array3)
        );

        for (Sorting sorting : sortings) {
            Utils.speedTest(sorting);
        }

//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
    }
}
