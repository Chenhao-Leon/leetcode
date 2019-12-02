package leetcode_2;


import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] a1 = {2, 4, 3};
        int[] a2 = {5, 6, 4};
        ListNode h1 = ListNode.array2Node(a1);
        ListNode h2 = ListNode.array2Node(a2);
//		ListNode h1 = new ListNode(2);
//		h1.next = new ListNode(4);
//		h1.next.next = new ListNode(3);
//		ListNode h2 = new ListNode(5);
//		h2.next = new ListNode(6);
//		h2.next.next = new ListNode(4);
        Solution_Answer s = new Solution_Answer();
        ListNode r = s.addTwoNumbers(h1, h2);
        r.printList();
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public static ListNode array2Node(int[] a) {
        ListNode s = null, l;
        if(a.length == 0)
            return s;
        else {
            l = new ListNode(a[0]);
            s = l;
        }
        for(int i = 1;i < a.length;i++) {
            l.next = new ListNode(a[i]);
            l = l.next;
        }
        return s;
    }
    void printList(){
        System.out.print(this.val);
        ListNode l = this.next;
        while(l != null) {
            System.out.print(" -> " + l.val);
            l = l.next;
        }
    }
}

// 原创解，较复杂
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0, temp = l1.val + l2.val;
        if(temp >= 10){
            c = temp / 10;
            temp = temp % 10;
        }
        ListNode l = new ListNode(temp);
        ListNode s = l;
        while(l1.next != null && l2.next != null){
            temp = l1.next.val + l2.next.val + c;
            if(temp >= 10)
            {
                c = temp / 10;
                temp = temp % 10;
            }
            else
                c = 0;
            l.next = new ListNode(temp);
            l = l.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2.next != null)
            l1 = l2;
        else if(l1.next == null) {
            if (c != 0)
                l.next = new ListNode(c);
            return s;
        }
        while(l1.next != null){
            temp = l1.next.val + c;
            if(temp >= 10)
            {
                c = temp / 10;
                temp = temp % 10;
            }
            else
                c = 0;
            l.next = new ListNode(temp);
            l = l.next;
            l1 = l1.next;
        }
        if( c != 0){
            l.next = new ListNode(c);
        }
        return s;
    }
}
