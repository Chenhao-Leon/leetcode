package leetcode_143;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/9
 * @Description: 重排链表 时间100%
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p = slow.next;
        ListNode rearHead = null;
        slow.next = null;
        while(p != null){
            ListNode tmp = p.next;
            p.next = rearHead;
            rearHead = p;
            p = tmp;
        }
        p = head;
        while(rearHead != null){
            ListNode tmp = rearHead.next;
            rearHead.next = p.next;
            p.next = rearHead;
            p = rearHead.next;
            rearHead = tmp;
        }
    }
}
