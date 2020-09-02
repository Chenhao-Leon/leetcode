package leetcode_25;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/2
 * @Description:
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            len++;
        }
        ListNode result = new ListNode(0);
        ListNode tail = result;
        ListNode start;
        int nowIndex = 0;
        p = head;
        while (nowIndex <= len && len - nowIndex >= k) {
            start = tail;
            for (int i = 0; i < k; i++) {
                ListNode tmp = p.next;
                p.next = start.next;
                start.next = p;
                if (i == 0)
                    tail = p;
                nowIndex++;
                p = tmp;
            }
        }
        if (nowIndex < len)
            tail.next = p;
        return result.next;
    }
}
