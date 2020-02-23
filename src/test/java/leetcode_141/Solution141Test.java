package leetcode_141;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution141Test {

    @Test
    public void hasCycle() {
        ListNode root = new ListNode(4);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(-4);
        root.next.next.next.next = root.next;
        assertTrue(new Solution141().hasCycle(root));
    }
}