package leetcode_148;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/24
 * @Description: 排序链表 归并排序（递归） 这种方法虽然不满足空间复杂度要求，但能更好理解链表归并排序，
 * 非递归算法过于繁琐
 */
class Solution {
    public ListNode sortList(ListNode head) {
        //递归结束条件
        if (head == null || head.next == null)
            return head;
        //通过快慢结点得到中点
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //偶数个结点平均分，奇数个几点left多1个
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        //头结点为0结点，最终返回res.next
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        //将剩余链表接上
        p.next = left != null ? left : right;
        return res.next;
    }
}