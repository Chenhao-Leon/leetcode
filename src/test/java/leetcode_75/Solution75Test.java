package leetcode_75;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution75Test {

    @Test
    public void sortColors() {
        int[] test = new int[]{2,0,2,1,1,0};
        new Solution75().sortColors(test);
        for(int a : test)
            System.out.println(a + " ");
        int[] test1 = new int[]{2,0,1};
        new Solution75().sortColors(test1);
        for(int a : test1)
            System.out.println(a + " ");
        int[] test2 = new int[]{1,2,0};
        new Solution75().sortColors(test2);
        for(int a : test2)
            System.out.println(a + " ");
    }
}