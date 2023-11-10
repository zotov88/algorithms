package sorting.algorithms.bubblesort;

import sorting.interfaces.Sorting;

public class BubbleSort implements Sorting {

    private final int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            boolean isDone = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    swap(j + 1, j);
                    isDone = false;
                }
            }
            if (isDone) {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
