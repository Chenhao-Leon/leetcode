package leetcode_15;

import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

// 由于ArrayList没有重写equals方法，因此若ArrayList里顺序元素顺序不同就会不等。故无法这样测试
public class SolutionAnswerTest {

    @Test
    public void threeSum() {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(-1);
        a1.add(0);
        a1.add(1);
        a2.add(-1);
        a2.add(-1);
        a2.add(2);
        List<List<Integer>> output = new ArrayList<>();
        output.add(a1);
        output.add(a2);
        assertEquals(output, new SolutionAnswer().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}