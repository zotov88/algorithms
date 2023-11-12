package sorting.algorithms;

public class BubbleSort extends AbstractSort {

    public BubbleSort(int[] array) {
        super(array);
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
}
