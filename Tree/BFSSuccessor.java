package Tree;

import java.util.LinkedList;
import java.util.Queue;


public class BFSSuccessor {
    private static Node root;

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }


    public static int successorOfNode(Node root, int target){
        int ans =-1;
        if(root == null){
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            
            Node frontNode = queue.poll();

            if(frontNode.left!=null){
                queue.add(frontNode.left);
            }

            if(frontNode.right!=null){
                queue.add(frontNode.right);
            }

            if(frontNode.val==target){
                Node nextNode = queue.poll();
                ans = nextNode.val;
                return ans;
            }

            // having for loop
            // int levelSize = queue.size();

            // for(int i=0;i<levelSize;i++){
            //     Node frontNode = queue.poll();

            //     if(frontNode.left!=null){
            //         queue.add(frontNode.left);
            //     }
            //     if(frontNode.right!=null){
            //         queue.add(frontNode.right);
            //     }

            //     if(frontNode.val==target){
            //         Node nextNode = queue.poll();
            //         ans = nextNode.val;
            //         return ans;
            //     }
            // }
        }

        return ans;
    }


    public static Node ReturnSuccessorOfNode(Node root, int target){
        if(root == null){
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node frontNode = queue.poll();

            if(frontNode.left!=null){
                queue.add(frontNode.left);
            }

            if(frontNode.right!=null){
                queue.add(frontNode.right);
            }

            if(frontNode.val == target){
                break;
            }
        }

        return queue.peek();
    }



    public static void main(String[] args) {
        BFSSuccessor.root = new Node(8);
        BFSSuccessor.root.left = new Node(5);
        BFSSuccessor.root.left.left = new Node(4);
        BFSSuccessor.root.left.right = new Node(7);
        BFSSuccessor.root.right = new Node(11);
        BFSSuccessor.root.right.right = new Node(17);
        BFSSuccessor.root.right.right.left = new Node(14);
        BFSSuccessor.root.right.right.right = new Node(19);
        System.out.println("Successor BFS Traversal:");
        // int target = 11;
        int target = 7;
        //return value
        int ans =  successorOfNode(root, target);

        //return Node
        Node nextNode =  ReturnSuccessorOfNode(root, target);

        System.out.println(ans);
        System.out.println(nextNode.val);
    }
}
