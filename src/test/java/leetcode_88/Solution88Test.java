package leetcode_88;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution88Test {

    @Test
    public void merge() {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        new Solution88().merge(a, 3, b, 3);
        for(int tmp : a)
            System.out.println(tmp + " ");
    }
}