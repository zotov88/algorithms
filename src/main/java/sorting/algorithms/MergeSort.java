package sorting.algorithms;

public class MergeSort extends AbstractSort {

    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        mergeSort(array);
    }

    private void mergeSort(int[] array) {

        int[] tmp;
        int[] src = array;
        int[] dst = new int[array.length];
        int size = 1;

        while (size < array.length) {
            for (int i = 0; i < array.length; i += size * 2) {
                merge(src, i, src, i + size, dst, i, size);
            }
            tmp = src;
            src = dst;
            dst = tmp;
            size *= 2;
        }
        System.arraycopy(src, 0, array, 0, array.length);
    }

    private void merge(int[] src1, int start1, int[] src2, int start2, int[] dst, int dstStart, int size) {
        int index1 = start1;
        int index2 = start2;

        int end1 = Math.min(start1 + size, src1.length);
        int end2 = Math.min(start2 + size, src2.length);

        if (start1 + size > array.length) {
            System.arraycopy(src1, start1, dst, start1, end1 - start1);
            return;
        }

        int iteratorCount = end1 - start1 + end2 - start2;

        for (int i = dstStart; i < dstStart + iteratorCount; i++) {
            if (index1 < end1 && (index2 >= end2 || src1[index1] < src2[index2])) {
                dst[i] = src1[index1];
                index1++;
            } else {
                dst[i] = src2[index2];
                index2++;
            }
        }
    }
}
