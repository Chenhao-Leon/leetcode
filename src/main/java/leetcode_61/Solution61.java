package leetcode_61;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/12
 * @Description: 旋转链表 defeat 99.97%
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode p = head;
        ListNode tail = null;
        int len = 0;
        while(p != null){
            len++;
            tail = p;
            p = p.next;
        }
        tail.next = head;
        k = len - k % len - 1;
        p = head;
        while(k != 0){
            p = p.next;
            k--;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}