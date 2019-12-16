package leetcode_25;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/16
 * @Description: K 个一组翻转链表
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode start = head;
        ListNode end = head;
        //在头结点之前增加空结点，之后处理头结点无需单独处理
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode pre = beforeHead;
        while(start != null){
            int count = k;
            while(count != 0 && end != null) {
                end = end.next;
                count --;
            }
            if(count != 0) break;
            pre.next = reverse(start, end);
            pre = start;
            start = start.next;
            end = start;
        }
        return beforeHead.next;
    }
    //方法完成了head~end-1的翻转，并将翻转后的下一指针指向end
    private ListNode reverse(ListNode head, ListNode end) {
        ListNode cur = head;
        ListNode pre = end;
        while (cur != null && cur != end) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}