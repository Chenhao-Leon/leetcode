package leetcode_24;


import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/16
 * @Description: 两两交换链表中的节点
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode p = head;
        ListNode q = head.next;
        ListNode former = null;
        for(int i = 0; p != null && q != null; i++){
            p.next = q.next;
            q.next = p;
            if(i != 0)
                former.next = q;
            if(i == 0)
                head = q;
            former = p;
            p = p.next;
            if(p == null) break;
            q = p;
            q = q.next;
            if(q == null) break;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}