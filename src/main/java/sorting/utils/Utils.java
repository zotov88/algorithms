package sorting.utils;

import sorting.interfaces.Sorting;

import java.util.Random;

public class Utils {

    private Utils() {}

    public static void swap(int[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    public static int[] generateArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void speedTest(Sorting sorting) {
        long time = System.currentTimeMillis();
        sorting.sort();
        System.out.printf("%s : %d\n", sorting.getClass().getSimpleName(), (System.currentTimeMillis() - time));
    }

    
}
