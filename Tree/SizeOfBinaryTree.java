package Tree;

import java.util.Scanner;

public class SizeOfBinaryTree {
    static Scanner sc = null;
    public static void main(String []args){
        sc = new Scanner(System.in);
        Node root = createTree();
        FindSizeOfBinaryTree(root);

    }

    public static int FindSizeOfBinaryTree(Node root){
        return 0;
    }

    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        if(data==-1) return null;

        root = new Node(data);
        System.out.println("Enter left of data : " + data);

        root.left = createTree();

        System.out.println("Enter right of data " + data);
        root.right = createTree();
        return root;
    }


    
}

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data=data;
    }
}
