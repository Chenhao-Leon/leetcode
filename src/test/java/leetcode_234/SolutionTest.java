package leetcode_234;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(2);
        test.next.next.next = new ListNode(1);
        assertTrue(new Solution().isPalindrome(test));
    }
}