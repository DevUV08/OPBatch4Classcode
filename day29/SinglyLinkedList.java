class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class SinglyLinkedList{
    static Node head;
    static void insert(int data){
        Node node= new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=node;
    }
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.display();
    }
}