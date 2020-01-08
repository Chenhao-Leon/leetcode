package leetcode_59;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution59Test {

    @Test
    public void generateMatrix() {
        int[][] ans = new Solution59().generateMatrix(3);
        for(int[] array : ans){
            for(int item : array)
                System.out.print(item + " ");
            System.out.println();
        }
    }
}