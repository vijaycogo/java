package Tree;

import java.util.Scanner;

public class BuildTree2 {
    
    public BuildTree2(){

    }
    private  Node root;
    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    // insert element
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int val= scanner.nextInt();
        this.root = new Node(val);
        populate(this.root, scanner);
    }
    private void populate(Node root, Scanner scanner) {
        System.out.println("Do you want to enter left of " + root.val);
        boolean leftValue = scanner.nextBoolean();
        if(leftValue){
            System.out.println("Enter the left of " + root.val);
            int value = scanner.nextInt();
            root.left = new Node(value);
            populate(root.left, scanner);
        }

        System.out.println("Do you want to enter right of " + root.val);

        Boolean rightValue = scanner.nextBoolean();
        if(rightValue){
            System.out.println("Enter right of " +root.val );
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(root.right, scanner);
        }
    }

    public void display(){
        displayTree(this.root, " ");
    }

    public void displayTree(Node root, String indent){
        if (root==null){
            return;
        }
        System.out.println(indent + root.val);
        displayTree(root.left, indent + "\t");
        displayTree(root.right, indent + "\t");

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


    public static void main(String[] args) {
        BuildTree2 tree = new BuildTree2();
        // Scanner scanner = new Scanner(System.in);
        // tree.populate(scanner);// this ask for input to insert node
        tree.root = new Node(8);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.right = new Node(11);
        tree.root.right.right = new Node(17);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(19);
        tree.display();
        System.out.println();
        System.out.println();
        tree.traversal();
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






    // tree.display();
//         8
//              5
//                      4
//                      7
//        
//              11
//     
//                          17
//        
//                              14
//                              19


