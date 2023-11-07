package linklist;
public class LL {

    // Define head node globally
    Node head;

    public class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNodeAtFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void removeNodefromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public void removeNodefromFirst(){
        // Node curNode = new Node();
        if(head==null){
            System.out.println("List is empty first");
            return;
        }
        head = head.next;
    }

    public void reverseLinkList(){
        if(head==null || head.next==null){
            return;
        }

        Node newNode;
        Node curr = head;
        Node prev = new Node("null");

        while(curr!=null){
            newNode = curr.next;
            curr.next=prev;
            prev = curr;
            curr =newNode;
        }
        head.next = null;
        head = prev;
    }

    

    public static void main(String[] args) {
        LL list = new LL();

        list.addNodeAtFirst("a");
        list.printList();
        list.removeNodefromFirst();
        list.printList();
        list.addNodeAtFirst("a");
        list.printList();
        list.addNodeAtFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addNodeAtFirst("this");
        list.printList();
        list.removeNodefromEnd();
        list.printList();
        list.removeNodefromFirst();
        list.printList();
        list.addLast("list");
        list.addNodeAtFirst("this");
        list.printList();
        System.out.println("original link list: ");
        list.printList();
        list.reverseLinkList();
        System.out.println("reverse link list: ");
        list.printList();
    }
}
