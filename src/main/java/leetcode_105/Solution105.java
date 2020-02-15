package leetcode_105;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/15
 * @Description: 从前序与中序遍历序列构造二叉树
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if(inorder.length != 0)
            root = new TreeNode(0);
        scanArray(root, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }
    private void scanArray(TreeNode node, int[] preorder, int s1, int e1, int[] inorder, int s2, int e2){
        if(s2 <= e2)
            node.val = preorder[s1];
        else return;
        int index = 0;
        for(int i = s2; i <= e2; i++)
            if(inorder[i] == preorder[s1]){
                index = i;
                break;
            }
        int leftLen = index - s2;
        int rightLen = e2 - index;
        if(s2 <= index - 1)
            node.left = new TreeNode(0);
        scanArray(node.left, preorder, s1 + 1, s1 + leftLen, inorder, s2, index - 1);
        if(index + 1 <= e2)
            node.right = new TreeNode(0);
        scanArray(node.right, preorder, s1 + leftLen + 1, e1, inorder, index + 1, e2);
    }
}
