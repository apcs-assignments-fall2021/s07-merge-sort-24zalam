import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testSubArray() {
        int[] arr1 = {1, 3, 4, 6};

        assertEquals("[1, 3, 4, 6]", Arrays.toString(MyMain.subArray(arr1, 0, 4)), "The subArray [1, 3, 4, 6] from 0 to 4 should be: [1, 3, 4, 6]");
        assertEquals("[1, 3]", Arrays.toString(MyMain.subArray(arr1, 0, 2)), "The subArray [1, 3, 4, 6] from 0 to 2 should be: [1, 3]");
        assertEquals("[4, 6]", Arrays.toString(MyMain.subArray(arr1, 2, 4)), "The subArray [1, 3, 4, 6] from 2 to 4 should be: [4, 6]");
        assertEquals("[3]", Arrays.toString(MyMain.subArray(arr1, 1, 2)), "The subArray [1, 3, 4, 6] from 1 to 2 should be: [3]");
        assertEquals("[]", Arrays.toString(MyMain.subArray(arr1, 2, 2)), "The subArray [1, 3, 4, 6] from 2 to 2 should be: []");
    }

    @Test
    public void testMergeSort() {
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(MyMain.mergeSort(new int[]{5, 3, 4, 1, 7, 8, 6, 2})), "The result of sorting [5, 3, 4, 1, 7, 8, 6, 2] should be: [1, 2, 3, 4, 5, 6, 7, 8]");
        assertEquals("[-5, -4, -1, 2, 3, 5, 7, 8]", Arrays.toString(MyMain.mergeSort(new int[]{8, 7, 5, 3, 2, -1, -4, -5})), "The result of sorting [8, 7, 5, 3, 2, -1, -4, -5] should be: [-5, -4, -1, 2, 3, 5, 7, 8]");
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]", Arrays.toString(MyMain.mergeSort(new int[]{20, 3, 1, 15, 2, 5, 21, 16, 10, 4, 8, 9, 6, 11, 7, 13})), "The result of sorting [20, 3, 1, 15, 2, 5, 21, 16, 10, 4, 8, 9, 6, 11, 7, 13] should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]");
    }

    @Test
    public void testInsert() {
        // insert([1, 2, 4, 5], 3) => [1, 2, 3, 4, 5]
        // insert([1, 2, 4, 5], 0) => [0, 1, 2, 4, 5]
        // insert([1, 2, 4, 5, 7, 8], 10) => [1, 2, 4, 5, 7, 8, 10]
        assertEquals("[1, 2, 3, 4, 5]", ""+MyMain.insert(new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5)),3), "The result of inserting 3 into [1, 2, 4, 5] should be: [1, 2, 3, 4, 5]");
        assertEquals("[0, 1, 2, 4, 5]", ""+MyMain.insert(new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5)),0), "The result of inserting 0 into [1, 2, 4, 5] should be: [0, 1, 2, 4, 5]");
        assertEquals("[1, 2, 4, 5, 7, 8, 10]", ""+MyMain.insert(new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 7, 8)),10), "The result of inserting 10 into [1, 2, 4, 5, 7, 8] should be: [1, 2, 4, 5, 7, 8, 10]");
    }

    @Test
    public void testInsertionSort() {
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", ""+MyMain.insertionSort(new ArrayList<Integer>(Arrays.asList(5, 3, 4, 1, 7, 8, 6, 2))), "The result of sorting [5, 3, 4, 1, 7, 8, 6, 2] should be: [1, 2, 3, 4, 5, 6, 7, 8]");
        assertEquals("[-5, -4, -1, 2, 3, 5, 7, 8]", ""+MyMain.insertionSort(new ArrayList<Integer> (Arrays.asList(8, 7, 5, 3, 2, -1, -4, -5))), "The result of sorting [8, 7, 5, 3, 2, -1, -4, -5] should be: [-5, -4, -1, 2, 3, 5, 7, 8]");
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]", ""+MyMain.insertionSort(new ArrayList<Integer> (Arrays.asList(20, 3, 1, 15, 2, 5, 21, 16, 10, 4, 8, 9, 6, 11, 7, 13))), "The result of sorting [20, 3, 1, 15, 2, 5, 21, 16, 10, 4, 8, 9, 6, 11, 7, 13] should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]");
    }
}
