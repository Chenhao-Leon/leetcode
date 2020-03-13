package leetcode_82;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void deleteDuplicates() {
        ListNode test = new ListNode(1);
        test.next = new ListNode(1);
        test.next.next = new ListNode(3);
//        test.next.next.next = new ListNode(3);
//        test.next.next.next.next = new ListNode(4);
//        test.next.next.next.next.next = new ListNode(4);
        new Solution().deleteDuplicates(test);
    }
}