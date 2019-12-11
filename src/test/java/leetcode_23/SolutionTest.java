package leetcode_23;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mergeKLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] input = new ListNode[]{l1, l2, l3};
        ListNode ans = new Solution().mergeKLists(input);
        while(ans != null){
            System.out.println(ans.val + " ");
            ans = ans.next;
        }
    }
}