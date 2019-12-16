package leetcode_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseKGroup() {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//        l.next.next.next = new ListNode(4);
//        l.next.next.next.next = new ListNode(5);
        ListNode ans = new Solution().reverseKGroup(l, 2);
        while(ans != null) {
            System.out.println(ans.val + " ");
            ans = ans.next;
        }
    }
}