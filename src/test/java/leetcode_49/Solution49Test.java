package leetcode_49;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution49Test {

    @Test
    public void groupAnagrams() {
        List<List<String>> res1 = new Solution49().groupAnagrams(new String[]{"tea","","eat","","tea",""});
        for(List<String> stringList : res1)
            System.out.println(stringList);
        List<List<String>> res2 = new Solution49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for(List<String> stringList : res2)
            System.out.println(stringList);
    }
}