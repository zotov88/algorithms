package binarysearch;

public class BinarySearch {

    private final int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(final int val) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > val) {
                end = middle - 1;
            }
            if (array[middle] < val) {
                start = middle + 1;
            }
            if (array[middle] == val) {
                return middle;
            }
        }
        return -1;
    }
}
