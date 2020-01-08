package leetcode_57;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution57Test {

    @Test
    public void insert() {
        int[][] ans = new Solution57().insert(new int[][]{{1,5}}, new int[]{2,7});
        for(int[] array : ans)
            for(int item : array)
                System.out.print(item + " ");
        System.out.println();
        ans = new Solution57().insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});
        for(int[] array : ans)
            for(int item : array)
                System.out.print(item + " ");
    }
}