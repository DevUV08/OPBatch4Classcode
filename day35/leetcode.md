# Question : 1 
https://leetcode.com/problems/invert-binary-tree/ 
## Solution: 
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void swap(TreeNode parent){
        if(parent==null){
            return;
        }
        TreeNode temp=parent.left;
        parent.left=parent.right;
        parent.right=temp;
        swap(parent.left);
        swap(parent.right);

    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
```
# Question : 2
## Solution: 
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean check(TreeNode n1, TreeNode n2 ){
         if(n1==null&&n2==null){
            return true;
         }
         if(n1==null||n2==null){
            return false;
         }
         return n1.val==n2.val&&check(n1.left,n2.right)&&check(n1.right, n2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
}
```