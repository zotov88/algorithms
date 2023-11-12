package utils;

import sorting.MyThread;
import sorting.interfaces.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {

    private Utils() {
    }

    public static void swap(int[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static int[][] generateTheSameRandomArrays(int length, int min, int max, int countArrays) {
        int[][] arrays = new int[countArrays][length];
        int[] array = generateRandomArray(length, min, max);
        arrays[0] = array;
        for (int i = 1; i < countArrays; i++) {
            int[] newArray = new int[length];
            System.arraycopy(array, 0, newArray, 0, length);
            arrays[i] = newArray;
        }
        return arrays;
    }

    public static void speedTest(Sorting sorting) {
        long time = System.currentTimeMillis();
        sorting.sort();
        System.out.printf("%s: %d\n", sorting.getClass().getSimpleName(), (System.currentTimeMillis() - time));
    }

    public static void printArrays(int[][] arrays) {
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static List<Thread> createStartedThreadList(List<Sorting> sortingList) {
        List<Thread> threadList = new ArrayList<>();
        for (Sorting sorting : sortingList) {
            Thread thread = new Thread(new MyThread(sorting));
            thread.start();
            threadList.add(thread);
        }
        return threadList;
    }
}
