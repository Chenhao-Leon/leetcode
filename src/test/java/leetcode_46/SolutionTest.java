package leetcode_46;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void permute() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new Solution().permute(nums);
        for(List<Integer> tmp : res) {
            for(int a : tmp)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}