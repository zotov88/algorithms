package sorting.algorithms;

import sorting.interfaces.Sorting;

public abstract class AbstractSort implements Sorting {

    protected int[] array;

    public AbstractSort(int[] array) {
        this.array = array;
    }

    protected void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
