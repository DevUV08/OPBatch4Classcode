class DNode {
    int data;
    DNode prev;
    DNode next;
    DNode(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    } 
}
public class DoublyList {
    static DNode head;
    static DNode tail;
    static void append(int data){
        DNode node= new DNode(data);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
    }
    static void display(){
        DNode temp=head;
        System.out.print("null <-");
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyList dl= new DoublyList();
        dl.append(1);
        dl.append(2);
        dl.append(3);
        dl.append(4);
        dl.display();
    }
}
