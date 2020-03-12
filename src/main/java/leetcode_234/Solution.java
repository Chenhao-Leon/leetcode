package leetcode_234;

import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/12
 * @Description: 回文链表 时间99%
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode half1 = null;
        while(p2 != null && p2.next != null){
            ListNode tmp = p1.next;
            p1.next = half1;
            half1 = p1;
            p1 = tmp;
            p2 = p2.next.next;
        }
        ListNode half2 = p1.next;
        if(p2 != null){
            p1.next = half1;
            half1 = p1;
        }
        p1 = half1;
        p2 = half2;
        while(p1 != null && p2 != null){
            if(p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
