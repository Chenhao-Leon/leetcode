package leetcode_29;

import leetcode_28.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void divide() {
        assertEquals(10, new Answer().divide(31, 3));
//        assertEquals(3, new Answer().divide(10, 3));
//        assertEquals(-2, new Answer().divide(7, -3));
        assertEquals(2147483647, new Answer().divide(-2147483648, -1));
    }
}