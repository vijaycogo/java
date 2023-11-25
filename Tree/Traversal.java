package Tree;

public class Traversal {
    // constructor 
    // public Traversal(){
    // }

    private Node root;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[]strings){
        Traversal tree = new Traversal();
        tree.root = new Node(8);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.right = new Node(11);
        tree.root.right.right = new Node(17);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(19);
        System.out.println();
        tree.traversal();
    }


    private void traversal() {
        System.out.print("pre_Order is = [ "  );
        preOrder(this.root);
        System.out.println("]");


        System.out.print("in__Order is = [ "  );
        inOrder(this.root);
        System.out.println("]");

        System.out.print("postOrder is = [ "  );
        postOrder(this.root);
        System.out.println("]");
    }

    private void preOrder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    
}

    //                                 8
    //
    //                             5        11
    //
    //                           4     7            17
    //
    //                                         14         19




//       preOrder                   8 5 4 7 11 17 14 19 
//       inOrder                    4 5 7 8 11 14 17 19 
//       postOrder                  4 7 5 14 19 17 11 8

