package leetcode_127;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution127Test {

    @Test
    public void ladderLength() {
        List<String> list = new LinkedList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        assertEquals(5, new Solution127().ladderLength("hit", "cog", list));
    }
}