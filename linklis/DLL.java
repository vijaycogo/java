package linklis;

// import linklis.SLL.Node;

public class DLL {

    private Node head;

    public class Node{
        int val;
        Node next;
        Node previous;

        public  Node(int val){
            this.val=val;
        }
        
        public Node(int val, Node next, Node previous){
            this.next=next;
            this.previous=previous;
            this.val=val;
        }
    }


    private Node addAtFirst(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head=newNode;
            return head;
        }
        newNode.next = head;
        head.previous = newNode;
        newNode.previous = null;
        head = newNode;
        return head;
    }

    private Node addAtLast(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next = newNode;
        newNode.previous=temp;
        return head;
    }
    private Node reverselist() {
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        while(temp.previous!=null){
            System.out.print(temp.val + "->");
            temp=temp.previous;
        }
        System.out.println(temp.val);
        return head;
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("null");
            return;
        }
        while(temp!=null){
            System.out.print(temp.val +"->" );
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        DLL dlinkllist = new DLL();
        dlinkllist.addAtFirst(1);
        dlinkllist.addAtFirst(2);
        dlinkllist.addAtFirst(3);
        dlinkllist.display();
        dlinkllist.addAtLast(4);
        dlinkllist.addAtLast(5);
        dlinkllist.addAtLast(6);
        dlinkllist.display();
        dlinkllist.reverselist();
    }
}
