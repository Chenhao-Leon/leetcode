package leetcode_66;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution66Test {

    @Test
    public void plusOne() {
        for(int a : new Solution66().plusOne(new int[]{1, 2, 3}))
            System.out.print(a + " ");
        System.out.println();
        for(int a : new Solution66().plusOne(new int[]{4, 3, 2, 1}))
            System.out.print(a + " ");
    }
}