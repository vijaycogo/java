package linklis;


public class SLL {
    private Node head;

    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public void display(){
        Node newNode = head;
        while(newNode !=null){
            System.out.print(newNode.val + "->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }

    public Node addAtEnd(int val){
        Node newNode = new Node(val);
        Node temp = head;
        if(head==null){
            head = newNode;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next =newNode;
        return head;
    }

    public void insert(int val, int index) {
        
    }

    public Node deleteFromEnd(int n){
        int count = 0;
        Node current=head;

        while(current!=null){
            count +=1;
            current=current.next;
        }
        current = head;


        for(int i=1;i<count - n ; i++){
            current= current.next;
        }
        System.out.print(current.val);

        if(current.next!=null && current.next.next!=null){
            current.next= current.next.next;
        }
        System.out.print(current.val);
        return head;
    }

    public static void main(String[] args) {
        SLL linkedList = new SLL();
        linkedList.addAtHead(1);
        linkedList.addAtEnd(2);
        // linkedList.addAtHead(3);
        linkedList.display();
        // System.out.println();
        // linkedList.addAtEnd(4);
        // linkedList.display();
        // linkedList.insert(100, 3);
        linkedList.deleteFromEnd(1);
        System.out.println();
        linkedList.display();

    }
}
