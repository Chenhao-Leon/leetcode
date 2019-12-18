package leetcode_30;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OptimizedAnswerTest {

    @Test
    public void findSubstring() {
        List<Integer> ans1 = Arrays.asList(0, 9);
        List<Integer> ans2 = new ArrayList<>();
        assertEquals(ans1, new OptimizedAnswer().findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        assertEquals(ans2, new OptimizedAnswer().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
    }
}