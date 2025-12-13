import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class TreeOps{
    public TreeNode root;
    public void insert(int val){
        TreeNode node= new TreeNode(val);
        if(root==null){
            root=node;
            return;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if(current.left==null){
                current.left=node;
                return;
            }else{
                q.add(current.left);
            }
            if(current.right==null){
                current.right=node;
                return;
            }else{
                q.add(current.right);
            }
        }
    }
    public void inorder(TreeNode parent){
        if(parent==null){
            return;
        }
        inorder(parent.left);
        System.out.println(parent.val);
        inorder(parent.right);
    }
    public int height(TreeNode parent){
        if(parent==null){
            return -1; // for vertexes return 0;
        }
        int left=height(parent.left);
        int right= height(parent.right);
        return 1+Math.max(left, right);
    }
    static int diameter = 0;
    public int checkDiameter(TreeNode root){
        diameter=0;
        treeDiameter(root);
        return diameter;
    }
    public int treeDiameter(TreeNode parent){
        if(parent==null){
            return -1;
        }
        int left=treeDiameter(parent.left);
        int right=treeDiameter(parent.right);
        diameter = Math.max(diameter, 2 + left + right);
        return 1+Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeOps tree= new TreeOps();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.inorder(tree.root);
        System.out.println("Height: ");
        System.out.println(tree.height(tree.root));
        System.out.println(tree.checkDiameter(tree.root));

    }
}