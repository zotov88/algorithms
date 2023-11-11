package sorting.algorithms.quicksort;

import sorting.interfaces.Sorting;
import utils.Utils;

public class QuickSort implements Sorting {

    private final int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int div = partition(array, from, to);
            quickSort(array, from, div - 1);
            quickSort(array, div, to);
        }
    }

    private static int partition(int[] array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = array[(from + to) / 2];

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                Utils.swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

}



