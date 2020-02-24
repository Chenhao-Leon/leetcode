package leetcode_148;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortList() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head = new Solution().sortList(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}