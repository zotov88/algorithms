package binarysearch;

import org.junit.jupiter.api.Test;

import static binarysearch.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;

    @Test
    public void successSearchArrayLength1() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_ONE);
        assertEquals(binarySearch.search(3), 0);
    }

    @Test
    public void findNumberInStartInArrayLength5() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_FIVE);
        assertEquals(binarySearch.search(-1), 0);
    }

    @Test
    public void findNumberInMiddleInArrayLength5() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_FIVE);
        assertEquals(binarySearch.search(5), 2);
    }

    @Test
    public void findNumberInStartInArrayLength6() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_SIX);
        assertEquals(binarySearch.search(-1), 0);
    }

    @Test
    public void findNumberInMiddleInArrayLength6() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_SIX);
        assertEquals(binarySearch.search(6), 3);
    }

    @Test
    public void findNumberInEndInArrayLength6() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_SIX);
        assertEquals(binarySearch.search(11), 5);
    }

    @Test
    public void searchingNumberInArrayWhereAllNumbersTheSame() {
        binarySearch = new BinarySearch(ARRAY_LENGTH_SIX_ALL_THE_SAME);
        assertEquals(binarySearch.search(5), 2);
    }
}