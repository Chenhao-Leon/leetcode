package leetcode_45;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void jump() {
        assertEquals(2, new Answer().jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(1, new Answer().jump(new int[]{2,1}));
        assertEquals(2, new Answer().jump(new int[]{2,3,0,1,4}));
    }
}