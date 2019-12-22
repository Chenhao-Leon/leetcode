package leetcode_33;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void search() {
        assertEquals(0, new Answer().search(new int[]{5, 1, 3}, 5));
        assertEquals(-1, new Answer().search(new int[]{1}, 0));
        assertEquals(4, new Answer().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, new Answer().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

    }
}