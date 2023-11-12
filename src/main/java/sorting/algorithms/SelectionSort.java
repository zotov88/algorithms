package sorting.algorithms;

public class SelectionSort extends AbstractSort {

    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            swap(i, getIndexMinVal(i));
        }
    }

    private int getIndexMinVal(int start) {
        int min = array[start];
        int index = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
