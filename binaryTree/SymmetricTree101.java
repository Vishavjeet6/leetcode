package leetcode.binaryTree;

public class SymmetricTree101 {

//	recursive
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymmetric(root.left, root.right);
    }
    
    private boolean checkSymmetric(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }
 
//    iterative
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode n1 = stack.pop(), n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }
    
    
}
