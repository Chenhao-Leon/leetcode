package exercise16_11;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void divingBoard() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.divingBoard(1, 1, 0)));
    }
}