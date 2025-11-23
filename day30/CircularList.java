class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularList {
    static CNode head;

    static void append(int data) {
        CNode node = new CNode(data);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    static void display() {
        CNode temp = head;
        if (head == null) {
            System.out.println("null");
            return;
        }
        // System.out.print(head.data + "->");
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->head");
    }

    public static void main(String[] args) {
        CircularList scl = new CircularList();
        scl.append(1);
        scl.append(2);
        scl.append(3);
        scl.append(4);
        scl.display();
    }
}
