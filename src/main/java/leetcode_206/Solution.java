package leetcode_206;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/3
 * @Description: 反转链表
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode reverse = null;
        while(p != null){
            ListNode tmp = p.next;
            p.next = reverse;
            reverse = p;
            p = tmp;
        }
        return reverse;
    }
}
