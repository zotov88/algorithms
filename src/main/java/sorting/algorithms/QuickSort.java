package sorting.algorithms;

public class QuickSort extends AbstractSort {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int div = partition(array, from, to);
            quickSort(array, from, div - 1);
            quickSort(array, div, to);
        }
    }

    private int partition(int[] array, int from, int to) {
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
                swap(leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

}



