package leetcode_25;

import java.util.List;

public class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode resHead = new ListNode(0);
        ListNode resLast = resHead;
        ListNode pre = head;
        ListNode rear = head;
        boolean reverseFlag = true;
        while(true){
            reverseFlag = true;
            //判断剩余节点是否足够k个
            for(int i = 0; i < k; i++) {
                if(rear == null) {
                    reverseFlag = false;
                    break;
                }
                rear = rear.next;
            }
            //不够k个，与剩余链表直接相连
            if(!reverseFlag) {
                resLast.next = pre;
                break;
            }
            //足够k个，将前k个反转后相连
            ListNode p = pre;
            ListNode tmp = pre;
            while(p != rear){
                pre = pre.next;
                p.next = resLast.next;
                resLast.next = p;
                p = pre;
            }
            resLast = tmp;
        }
        return resHead.next;
    }
}
