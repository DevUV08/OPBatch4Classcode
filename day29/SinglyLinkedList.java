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
    static void insertAtPlace(int data, int place){
        Node temp=head;
        Node newNode= new Node(data);
        int count=1;
        if(place<=1){
            newNode.next=head;
            head=newNode;
            return;
        }
        while(temp.next!=null&&count!=place-1){
            temp=temp.next;
            count++;
        }
        if(count==place-1){
            newNode.next=temp.next;
            temp.next=newNode;
            return;
        }else{
            System.out.println("Can't insert becuase place not found");
        }

    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(4);
        sll.insert(5);
        sll.insertAtPlace(3,3);
        sll.insertAtPlace(0,1);
        sll.insertAtPlace(6,7);
        sll.display();
    }
}