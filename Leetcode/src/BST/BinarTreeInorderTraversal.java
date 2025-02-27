package BST;
import java.util.*;
public class BinarTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
ArrayList<Integer>a = new ArrayList<Integer>();
turn(a,root);
return a;
    }
    public static void turn(ArrayList<Integer>a, TreeNode root){
        if(root ==null) return;
        turn(a,root.left);
        a.add(root.val);
        turn(a,root.right);
    }
    public static void main(String[] args) {

    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
