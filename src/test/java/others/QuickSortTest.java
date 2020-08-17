package others;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] arr = {2,4,7,5,6,1,3};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}