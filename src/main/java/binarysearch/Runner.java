package binarysearch;

public class Runner {
    public static void main(String[] args) {

        int[] array = new int[] {5, 5, 5};
        BinarySearch binarySearch = new BinarySearch(array);
        System.out.println(binarySearch.search(5));
    }
}
