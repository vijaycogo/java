package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTRightView {
    private static Node root;

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static List<Integer> rightView(Node root){

        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node frontNode = queue.poll();
                currentLevel.add(frontNode.val);

                if(frontNode.left!=null){
                    queue.add(frontNode.left);
                }

                if(frontNode.right!=null){
                    queue.add(frontNode.right);
                }
            }
            int last = currentLevel.getLast();
            result.add(last);
        }

        return result;
    }

    public static List<Integer> rightView2(Node root){

        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i=0;i<levelSize;i++){
                Node frontNode = queue.poll();

                if(i==levelSize-1){
                    result.add(frontNode.val);
                }

                if(frontNode.left!=null){
                    queue.add(frontNode.left);
                }

                if(frontNode.right!=null){
                    queue.add(frontNode.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BSTRightView.root = new Node(8);
        BSTRightView.root.left = new Node(5);
        BSTRightView.root.left.left = new Node(4);
        BSTRightView.root.left.right = new Node(7);
        BSTRightView.root.right = new Node(11);
        BSTRightView.root.right.right = new Node(17);
        BSTRightView.root.right.right.left = new Node(14);
        BSTRightView.root.right.right.right = new Node(19);
       
        System.out.println("right view of tree");
        List<Integer> ans = rightView(root); 
        System.out.println(ans);

        System.out.println("right view of tree");
        List<Integer> ans2 = rightView2(root); 
        System.out.println(ans2);

        
        // for(int element: ans){
        //     System.out.print(element + " ");
        // }
    }

}
