class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyList {
    static Node head;
    static void append(int data){
        Node node= new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }
    static void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.print("null");
    }
    static boolean delete(int data){
        if(head.data==data){
            head=head.next;
            return true;
        }
        Node temp=head;
        while(temp.next!=null&&temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("data not found");
            return false;
        }
        temp.next=temp.next.next;
        return true;
    }
   public static void main(String[] args) {
     SinglyList list= new SinglyList();
     list.append(1);
     list.append(2);
     list.append(3);
     list.append(5);
     list.append(5);
     list.delete(1);
     list.delete(3);
     list.delete(5);
     list.delete(4);
     list.display();
   }
    
}
