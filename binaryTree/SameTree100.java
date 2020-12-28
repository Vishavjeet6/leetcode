package leetcode.binaryTree;

public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {   
        if(p==null || q == null){
            return p==q;
        }
        return checkSymmetric(p,q);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return checkSymmetric(left.left, right.left) && checkSymmetric(left.right, right.right);
    }
}
