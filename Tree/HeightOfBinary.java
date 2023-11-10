package Tree;

import java.util.Scanner;

public class HeightOfBinary {
    static Scanner sc = null;

    public static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }



    public static int FindSizeOfBinaryTree(Node root){
        if(root==null){
            return 0;
        }
        return FindSizeOfBinaryTree(root.left) + FindSizeOfBinaryTree(root.right) + 1;

    }
    public static void main(String []args){
        sc = new Scanner(System.in);
        Node root = createTree();

        int heaight = findHeight(root);
        System.out.println("heaight of tree is " + heaight);


        int size = FindSizeOfBinaryTree(root);
        System.out.print("size of binary tree: "+ size);

        int maximumInTree = findMaximumData()

    }


    static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}    
}

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data=data;
    }
}