package leetcode_116;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/16
 * @Description: 填充每个节点的下一个右侧节点指针（时间 8%）
 */
public class Solution116 {
    public Node connect(Node root) {
        if(root == null)
            return null;
        LinkedList<Node> queue = new LinkedList<>();
        Node p = null, before = null, first = root;
        queue.add(root);
        while(!queue.isEmpty()){
            p = queue.pollFirst();
            if(before != null) {
                if(p != first)
                    before.next = p;
                else
                    before.next = null;
            }
            before = p;
            if(p.left != null) {
                queue.add(p.left);
                if(p == first)
                    first = p.left;
            }
            if(p.right != null) {
                if(p == first && p != queue.getLast())
                    first = p.right;
                queue.add(p.right);
            }
        }
        p.next = null;
        return root;
    }
}
