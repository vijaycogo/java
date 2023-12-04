package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageBFS {
    // public void AverageBFS(){};
    public static Node root;
    public static class Node{
        int val;
        Node left;
        Node right;

       public Node(int val){
        this.val = val;
       }
    }


    public static List<Float> averageOfLevel(Node root){
        List<Float> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int levelSum =0;
            // List<Integer> currentAnswer = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                Node frontNode = queue.poll();
                // currentAnswer.add(frontNode.val);
                levelSum +=frontNode.val;

                if(frontNode.left!=null){
                    queue.add(frontNode.left);
                }
                if(frontNode.right!=null){
                    queue.add(frontNode.right);
                }
            }

            // float averageOfLevel = levelSum/levelSize;
            float averageOfLevel = levelSum / (float) levelSize;
            result.add(averageOfLevel);
        }

        return result;
    }


    public static void main(String[] args) {
        
        AverageBFS.root = new Node(8);
        AverageBFS.root.left = new Node(5);
        AverageBFS.root.left.left = new Node(4);
        AverageBFS.root.left.right = new Node(7);
        AverageBFS.root.right = new Node(11);
        AverageBFS.root.right.right = new Node(17);
        AverageBFS.root.right.right.left = new Node(14);
        AverageBFS.root.right.right.right = new Node(19);
        System.out.println("Average BFS Traversal:");
        List<Float> ans =  averageOfLevel(root);

        System.out.println(ans);
    }

}
