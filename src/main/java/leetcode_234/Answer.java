package leetcode_234;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    public boolean isPalindrome(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }
        int front = 0;
        int back = nodes.size() - 1;
        while (front < back) {
            if (nodes.get(front).val != nodes.get(back).val) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
