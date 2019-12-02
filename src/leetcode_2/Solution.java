package leetcode_2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }

    ListNode() { }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ListNode))
            return false;
        ListNode p = this, q = (ListNode)obj;
        while (p != null && q != null){
            if (p.val != q.val)
                return false;
            p = p.next;
            q = q.next;
        }
        if ((q == null && p != null) || (q != null && p == null))
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        String s = this.val + "";
        ListNode l = this.next;
        while(l != null) {
            s = s + " -> " + l.val;
            l = l.next;
        }
        return s;
    }
}

// 原创解，较复杂
public class Solution{
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
