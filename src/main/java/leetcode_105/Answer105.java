package leetcode_105;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/15
 * @Description: 从前序与中序遍历序列构造二叉树（时间46%）
 * 还可以根据答案，将inorder改为Map结构，提高查询效率
 */
public class Answer105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return scanArray(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode scanArray(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2){
        if(s1 > e1 || s2 > e2)
            return null;
        TreeNode node = new TreeNode(preorder[s1]);
        int index = 0;
        for(int i = s2; i <= e2; i++)
            if(inorder[i] == preorder[s1]){
                index = i;
                break;
            }
        int leftLen = index - s2;
        node.left = scanArray(preorder, s1 + 1, s1 + leftLen, inorder, s2, index - 1);
        node.right = scanArray(preorder, s1 + leftLen + 1, e1, inorder, index + 1, e2);
        return node;
    }
}
