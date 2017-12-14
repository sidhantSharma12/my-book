//In this question, one is given a BST and has to update the values of each BST.
//Each node in the BST has to be updated such that the value of the node has to be the sum of all
//the nodes with values bigger than itself plus the value of itself.

class Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
