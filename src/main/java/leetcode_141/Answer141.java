package leetcode_141;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/23
 * @Description: 环形链表
 */
public class Answer141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
