package Tree;

public class BST {
    //constructor
    public BST(){
    }

    private Node root;
    public class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.val=val;
        }

        public int getValue(){
            return val;
        }
    }

    public void insert(int val){
        root = insert(root, val);
    }

    public Node insert(Node node, int num){
        if(node==null){
            Node x = new Node(num);
            return x;
        }
        if(node.val > num){
            node.left = insert(node.left, num);
        }
        if(node.val < num){
            node.right = insert(node.right, num);
        }

        node.height = Math.max(height(node.left), height(node.right)) +1;
        return node;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        int[]arr={4,5,2,65,3,1,99};
        bst.populate(arr);
        bst.display();
        System.out.println(bst.isBalanced());
        System.out.println(bst.root.height);
    }


    public void populate(int[] arr){
        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }
    }

    public  int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }


    public boolean isBalanced(){
        return checkBalanced(root);
    }

    private boolean checkBalanced(Node node) {
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && checkBalanced(node.left) && checkBalanced(node.right);

        // int difference = height(node.left) - height(node.right);
        // boolean isRootBalenced = Math.abs(difference)<=1;
        // boolean checkNodeLeftBalanced = checkBalanced(node.left);
        // boolean checkNodeRightBalanced = checkBalanced(node.right);
        // return isRootBalenced && checkNodeLeftBalanced && checkNodeRightBalanced;
    }


    public void display(){
        display(root, "Root node");
    }

    public void display(Node node, String message){
        if(node==null){
            return;
        }
        System.out.println(message + node.val);
        display(node.left, "left child of " + node.val + ": " );
        display(node.right, "right child of " + node.val +  " :");
    }
}
