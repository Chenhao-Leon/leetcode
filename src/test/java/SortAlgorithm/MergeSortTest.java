package SortAlgorithm;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void guiBing() {
        int[] test1 = new int[]{3,4,5,6,3,1};
        int[] test2 = new int[]{1,8,44,33,62,2};
        MergeSort gb = new MergeSort();
        gb.mergeSort(test1);
        gb.mergeSort(test2);
        for(int tmp : test1)
            System.out.print(tmp + " ");
        System.out.println();
        for(int tmp : test2)
            System.out.print(tmp + " ");
    }
}