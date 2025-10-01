package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LL {
    Node head;
    public static void main(String[] args) {
        // Node head;
        // LL LLst= new LL();
        // Node nd = new Node(10);
        // head = nd;
        // head.next = new Node(20);

        // while(head != null){
        //     System.out.println(head.data);
        //     head = head.next;
        // }
        
        Node head;
        LL listObj = new LL(); // like a container we are going to use it 

        listObj.append(100);
        listObj.append(200);
        listObj.append(300);
        listObj.append(400);
        listObj.DispList();

        // Node obj1 = new Node(50)
        // Node obj2 = new Node(100);
        // obj1.next = obj2;
        // obj2.next = new Node(200);
        // obj2.next.next = new Node(0);
        // System.out.println(obj1.data);
        // System.out.println(obj1.next.next.next.data);
    }

    void append(int val){
        if(head == null){
            head = new Node(val);
        }
        while(head.next != null){
            head = head.next;
        }
        head.next = new Node(val);
    }
    void DispList(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
