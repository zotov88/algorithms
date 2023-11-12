package sorting;

import sorting.algorithms.BubbleSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.interfaces.Sorting;
import utils.Utils;

import java.util.List;

public class SortingRunner {

    final static int CAPACITY = 10_000;
    final static int FROM = -100;
    final static int TO = 100;
    final static int COUNT_ARRAYS = 4;

    public static void main(String[] args) throws InterruptedException {

        int[][] arrays = Utils.generateTheSameRandomArrays(CAPACITY, FROM, TO, COUNT_ARRAYS);

         List<Sorting> sortingList = List.of(
                new BubbleSort(arrays[0]),
                new SelectionSort(arrays[1]),
                new MergeSort(arrays[2]),
                new QuickSort(arrays[3])
        );

        for (Sorting sorting : sortingList) {
            Thread t = new Thread(() -> Utils.speedTest(sorting));
            t.start();
            t.join();
        }

        Utils.printArrays(arrays);
    }
}
