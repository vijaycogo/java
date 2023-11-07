package linklist;

public class Addtwonumberaslinklist {
    
}
class MergetwoSortedList {

    public class Node {
        int data;
        Node next;
    }

    // Function to create newNode in a linkedlist
    public Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data+ "->");
            node = node.next;
        }
        System.out.print("null");
    }

    //   recursion
    
    // public Node merge(Node h1, Node h2) {
    //     if (h1 == null)
    //         return h2;
    //     if (h2 == null)
    //         return h1;

    //     if (h1.data < h2.data) {
    //         h1.next = merge(h1.next, h2);
    //         return h1;
    //     } else {
    //         h2.next = merge(h1, h2.next);
    //         return h2;
    //     }
    // }

    public Node MergeByIterative(Node head1, Node head2){

        if(head1==null){
            return head2;
        }

        if(head2==null){
            return head1;
        }

        if(head1.data>head2.data){
            Node temp=head1;
            head1=head2;
            head2=temp;
        }
        Node result = head1;
        while(head1!=null && head2!=null){
            Node  temp = null;
            while(head1!=null && head1.data< head2.data){
                temp=head1;
                head1=head1.next;
            }
            temp.next=head2;

            //  swap the node
            Node newnode  = head1;
            head1 = head2;
            head2 = newnode;
        }
        return result;

    }

    // Driver program
    public static void main(String args[]) {
        MergetwoSortedList merger = new MergetwoSortedList();

        Node head1 = merger.newNode(1);
        head1.next = merger.newNode(3);
        head1.next.next = merger.newNode(5);

        Node head2 = merger.newNode(0);
        head2.next = merger.newNode(2);
        head2.next.next = merger.newNode(4);

        merger.printList(head1);
        System.out.println(" ");
        merger.printList(head2);
        System.out.println(" ");

        // Node mergedhead = merger.merge(head1, head2);
        Node mergedhead = merger.MergeByIterative(head1, head2);

        merger.printList(mergedhead);
    }
}

