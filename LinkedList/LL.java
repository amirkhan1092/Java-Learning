package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL {
    public static void main(String[] args) {
        Node head;
        LL LLst= new LL();
        Node nd = new Node(10);
        head = nd;
        head.next = new Node(20);

        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
        
        
        
    }
}
