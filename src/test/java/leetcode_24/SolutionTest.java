package leetcode_24;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void swapPairs() {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ListNode ans = new Solution().swapPairs(l);
        while(ans != null) {
            System.out.println(ans.val + " ");
            ans = ans.next;
        }
    }
}