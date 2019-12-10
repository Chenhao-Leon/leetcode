package leetcode_21;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/10
 * @Description: 合并两个有序链表
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode index = head;
        while(l1 != null && l2 != null){
            ListNode p = null;
            if(l1.val <= l2.val){
                p = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                p = new ListNode(l2.val);
                l2 = l2.next;
            }
            index.next = p;
            index = p;
        }
        while(l1 != null){
            ListNode p = new ListNode(l1.val);
            index.next = p;
            index = p;
            l1 = l1.next;
        }
        while(l2 != null){
            ListNode p = new ListNode(l2.val);
            index.next = p;
            index = p;
            l2 = l2.next;
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
