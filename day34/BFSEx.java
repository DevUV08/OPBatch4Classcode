import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
public class BFSEx {
    TreeNode root;
    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                q.add(current.left);
            }
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                q.add(current.right);
            }
        }
    }
    // DFS
    public void inOrder(TreeNode parent) {
        if (parent == null) {
            return;
        }
        inOrder(parent.left);
        System.out.println(parent.data);
        inOrder(parent.right);
    }
    // BFS
    public void bfs(TreeNode node){
        if(node==null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode current= q.poll();
            System.out.println(current.data);
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        BFSEx tree = new BFSEx();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.inOrder(tree.root);
        System.out.println("BFS: ");
        tree.bfs(tree.root);
    }
}
