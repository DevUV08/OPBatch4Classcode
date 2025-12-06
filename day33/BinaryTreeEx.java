import java.util.LinkedList;
import java.util.Queue;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTreeEx {
    Node root;
    public void insert(int val){
        Node node = new Node(val);
        if(root==null){
            root= node;
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current= q.poll();
            if(current.left==null){
                current.left=node;
                return;
            }else{
                q.add(current.left);
            }
            if(current.right==null){
                current.right=node;
                return ;
            }else{
                q.add(current.right);
            }
        }

    }
    public void preOrder(Node parent){
        if(parent==null){
            return;
        }
        System.out.println(parent.data);
        preOrder(parent.left);
        preOrder(parent.right);
    }
    public void postOrder(Node parent){
        if(parent==null){
            return;
        }
        postOrder(parent.left);
        postOrder(parent.right);
        System.out.println(parent.data);
    }
    public void inOrder(Node parent){
        if(parent==null){
            return;
        }
        inOrder(parent.left);
        System.out.println(parent.data);
        inOrder(parent.right);
    }
   public static void main(String[] args) {
     BinaryTreeEx tree= new BinaryTreeEx();
     tree.insert(1);
     tree.insert(2);
     tree.insert(3);
     tree.insert(4);
     tree.insert(5);
     tree.insert(6);
     tree.insert(7);
    //  tree.inOrder(tree.root);
    // tree.preOrder(tree.root);
    tree.postOrder(tree.root);
   }
    
}
