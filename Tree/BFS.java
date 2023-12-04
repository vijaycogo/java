package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFS {
    // public void BFS(){};
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    private static Node root;

    public static void displayInorder(Node node){
        if(node==null){
            return;
        }
        displayInorder(node.left);
        System.out.print(node.val + " ");
        displayInorder(node.right);
    }


    public static  List<List<Integer>> printBFSOrder(Node root2) {
        List<List<Integer>> result = new ArrayList<>();

        if(root2 == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        // queue.offer(root2);
        queue.add(root2);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
             // create for pushing element of current element
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            
            for(int i=0;i<levelSize; i++){
                Node frontNode = queue.poll();
                currentLevel.add(frontNode.val);
                if(frontNode.left!=null){
                    queue.add(frontNode.left);
                }
                if(frontNode.right!=null){
                    queue.add(frontNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String [] strings){
        // BFS bfs = new BFS();
        // bfs.root = new Node(8);
        BFS.root = new Node(8);
        BFS.root.left = new Node(5);
        BFS.root.left.left = new Node(4);
        BFS.root.left.right = new Node(7);
        BFS.root.right = new Node(11);
        BFS.root.right.right = new Node(17);
        BFS.root.right.right.left = new Node(14);
        BFS.root.right.right.right = new Node(19);
        displayInorder(root); // 4,5,7,8,11,14,17,19
        System.out.println();

        List<List<Integer>> bfsResult = printBFSOrder(root);
        System.out.println("BFS Traversal:");

        for (List<Integer> level : bfsResult) {
            System.out.println(level);
        }

    }
}

    //                                 8
    //
    //                             5        11
    //
    //                           4     7            17
    //
    //                                         14         19
