package linklist;

// import org.jcp.xml.dsig.internal.SignerOutputStream;

// import apple.laf.JRSUIConstants.Size;

class LLi {
    
    private int size;
    // make constructor
    LLi () {
        size = 0; 
    }
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    public void addNodeAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        newNode.next= head;
        head=newNode;
    }

    public void addAtLast(int data){
        size ++;
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        if(head.next==null){
            head.next=newNode;
            return;
        }

        Node cureerentNode = head;
        while(cureerentNode.next!=null){
            cureerentNode=cureerentNode.next;
        }
        cureerentNode.next=newNode;

    }


    public int searchNumber(int target){
        int index = 0;
        if(head==null){
            System.out.println("list is empty");
            return -1;
        }

        if(head.next==null){
            if(head.data==target){
                System.out.println("target element is head");
                return index;
            }
            System.out.println("target element is not present");
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            index++;
            if(currentNode.next.data==target){
                System.out.println("target element is present at index "+ index + " "+ target);
                return index;
            }
            currentNode = currentNode.next;
        }
        return -1;

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


    public int getSize() {
        return size; 
    }


    public void removeNthNodefromEnd(int n){
        if(head==null){
            return;
        }
        Node curNode =head;
        int count =0;
        while(curNode!=null){
            count++;
            curNode = curNode.next;
        }
        Node temp=head;
        int index =1;
        while(index!=count-n){
            temp=temp.next;
            index++;
        }
        temp.next=temp.next.next;
    }

    public Node getMiddle(){
        Node slow =head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     

    public Node reversesecondhalf(Node secondhalfNode){
        Node prev=null;
        Node current = secondhalfNode;
        Node nextnode;
        while(current!=null){
            nextnode = current.next;
            current.next=prev;
            prev= current;
            current = nextnode;
        }
        return prev;
    }
    

    public void checkPalindore(){
        if(head == null || head.next == null) {
            System.out.println("List is palindome");
            return;
        }
       
        Node firstHalfEnd = getMiddle();
        Node secondHalfStart = reversesecondhalf(firstHalfEnd.next);
        Node firstHalfStart = head;

        // Node slow = firstHalfStart;
        // Node fast = secondHalfStart;

        // System.out.print(" slow is  ");
        // while (slow != null) {
        //     System.out.print(slow.data + " -> ");
        //     slow = slow.next;
        // }
        // System.out.println("null");

        // System.out.print(" fast is  ");
        // while (fast != null) {
        //     System.out.print(fast.data + " -> ");
        //     fast = fast.next;
        // }
        // System.out.println("null");


        while(secondHalfStart != null) {
            if(secondHalfStart.data != firstHalfStart.data) {
                System.out.print("List is not palindrome");
                return;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        System.out.println("List is palindome");

    }


    public static void main(String [] args){
        LLi list = new LLi();

        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(3);
        list.addAtLast(8);
        list.addAtLast(1);
        // list.addNodeAtFirst(0);
        // list.printList();
        // System.out.println("size is: "+ list.getSize());
        // System.out.println("target elemnt present at index : " +list.searchNumber(9));

        // list.removeNthNodefromEnd(2);
        list.printList();
        list.checkPalindore();

    }

}