package leetcode_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void reverseKGroup() {
        Solution2 solution = new Solution2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = solution.reverseKGroup(head, 3);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}