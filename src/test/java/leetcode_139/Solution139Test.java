package leetcode_139;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution139Test {

    @Test
    public void wordBreak() {
        List<String> list2 = new ArrayList<>();
        list2.add("cats");
        list2.add("dog");
        list2.add("sand");
        list2.add("cat");
        assertFalse(new Solution139().wordBreak("catsandog", list2));
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        assertTrue(new Solution139().wordBreak("applepenapple", list));
    }
}