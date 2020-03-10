package leetcode_236;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/10
 * @Description: 二叉树的最近公共祖先
 * 未通过原因：测试用例中最大结点数为1千多万个，当开辟这个数量级的数组就会超出内存空间
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] parentArray = new TreeNode[100000];
        parentArray[0] = null;
        LinkedList<TreeNode> queue = new LinkedList<>();
        HashMap<TreeNode, Integer> map = new HashMap<>();
        queue.add(root);
        map.put(root, 0);
        TreeNode levelLast = root;
        int pLevel = 0;
        int qLevel = 0;
        int level = 1;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == p) pLevel = level;
            if(cur == q) qLevel = level;
            if(cur.left != null){
                queue.add(cur.left);
                int parent = map.get(cur);
                map.put(cur.left, parent * 2 + 1);
                parentArray[parent * 2 + 1] = cur;
            }
            if(cur.right != null){
                queue.add(cur.right);
                int parent = map.get(cur);
                map.put(cur.right, parent * 2 + 2);
                parentArray[parent * 2 + 2] = cur;
            }
            if(cur == levelLast && !queue.isEmpty()) {
                levelLast = queue.getLast();
                level++;
            }
        }
        while(qLevel < pLevel){
            p = parentArray[map.get(p)];
            pLevel--;
        }
        while(qLevel > pLevel){
            q = parentArray[map.get(q)];
            qLevel--;
        }
        while(p != q){
            p = parentArray[map.get(p)];
            q = parentArray[map.get(q)];
        }
        return p;
    }
}
