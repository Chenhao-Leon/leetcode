package leetcode_23;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/11
 * @Description: 合并K个排序链表(分治法)
 */
public class SolutionAnswer {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return null;
        }
        // 将n个链表以中间为对称，合并，即合并
        while(len>1) {
            for (int i=0; i<len/2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[len-1-i]);
            }
            len = (len+1)/2;
        }
        return lists[0];
    }

    // 合并两个链表
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) {
            p.next = l1;
        } else if (l2 != null) {
            p.next = l2;
        }
        return head.next;
    }
}
