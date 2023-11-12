package sorting;

import sorting.algorithms.*;
import sorting.interfaces.Sorting;
import utils.Utils;

import java.util.ArrayList;
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

        List<Thread> threadList = new ArrayList<>();

        for (Sorting sorting : sortingList) {
            Thread thread = new Thread(new MyThread(sorting));
            thread.start();
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        Utils.printArrays(arrays);
    }
}
