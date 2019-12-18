package leetcode_30;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionAnswerTest {

    @Test
    public void findSubstring() {
        List<Integer> ans1 = Arrays.asList(0, 9);
        List<Integer> ans2 = new ArrayList<>();
        assertEquals(ans1, new SolutionAnswer().findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        assertEquals(ans2, new SolutionAnswer().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
    }
}