package others;

import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void heapSort() {
        int[] arr = {2,4,7,5,6,1,3};
        HeapSort hs = new HeapSort();
        hs.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}