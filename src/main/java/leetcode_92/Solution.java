package leetcode_92;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/9
 * @Description: 反转链表 II 时间100%
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode realHead = new ListNode(0);
        realHead.next = head;
        ListNode pre = realHead;
        ListNode p = head;
        for(int i = 1; i <= n; i++){
            if(i >= m && i <= n){
                if(i == m) pre.next = null;
                ListNode tmp = p.next;
                p.next = pre.next;
                pre.next = p;
                p = tmp;
            } else{
                p = p.next;
                pre = pre.next;
            }
        }
        ListNode q = realHead;
        while(q.next != null){
            q = q.next;
        }
        q.next = p;
        return realHead.next;
    }
}
