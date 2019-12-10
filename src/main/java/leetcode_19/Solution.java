package leetcode_19;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/10
 * @Description: 删除链表的倒数第N个节点
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        while(n != 0){
            q = q.next;
            n--;
        }
        if(q == null) return p.next;
        while(q.next != null){
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}

class ListNode {
    private int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
