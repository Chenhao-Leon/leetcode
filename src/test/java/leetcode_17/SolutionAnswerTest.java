package leetcode_17;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionAnswerTest {

    @Test
    public void letterCombinations() {
        List<String> re = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(re, new SolutionAnswer().letterCombinations("23"));
    }
}