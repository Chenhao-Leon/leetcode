package leetcode_93;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void restoreIpAddresses() {
        List<String> res1 = new Solution().restoreIpAddresses("1111");
        for(String s : res1)
            System.out.println(s);
        List<String> res = new Solution().restoreIpAddresses("25525511135");
        for(String s : res)
            System.out.println(s);
    }
}