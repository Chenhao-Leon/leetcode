package leetcode_198;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void rob() {
        assertEquals(4, new Answer().rob(new int[]{1,2,3,1}));
        assertEquals(4, new Answer().rob(new int[]{2,1,1,2}));
    }
}