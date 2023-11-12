package sorting;

import sorting.interfaces.Sorting;
import utils.Utils;

public class MyThread implements Runnable {

    private Sorting sorting;

    public MyThread(Sorting sorting) {
        this.sorting = sorting;
    }

    @Override
    public void run() {
        Utils.speedTest(sorting);
    }
}
