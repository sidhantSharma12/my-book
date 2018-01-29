//find max depth of a binary tree

class Solution {
    int maxLength=0;
    public int maxDepth(TreeNode root) {
        traverse(root, 0);
        return maxLength;
    }
    public void traverse(TreeNode node, int sum){
        if(node == null){
            if(sum > maxLength){
                maxLength=sum;
            }
            return;
        }
        sum++;
        traverse(node.left, sum);
        traverse(node.right, sum);
    }
}
