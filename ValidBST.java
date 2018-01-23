//check if a binary tree is a valid BST

class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        
        boolean isLBst=true;
        boolean isRBst=true;
        if(root.left!=null){
            if((root.val < root.left.val)){
                isLBst=false;
            }
       }
       if(root.right!=null){
            if((root.val > root.right.val)){
                isRBst=false;
            }
       }
       boolean isBst = isLBst && isRBst;
       boolean isLeft= isValidBST(root.left);
       boolean isRight= isValidBST(root.right);
       return isBst && isLeft && isRight;
    }
}
