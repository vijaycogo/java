package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagFromBottom {
    private static Node root;

    public static class Node {
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ZigZagFromBottom.root = new Node(8);
        ZigZagFromBottom.root.left = new Node(5);
        ZigZagFromBottom.root.left.left = new Node(4);
        ZigZagFromBottom.root.left.right = new Node(7);
        ZigZagFromBottom.root.right = new Node(11);
        ZigZagFromBottom.root.right.right = new Node(17);
        ZigZagFromBottom.root.right.right.left = new Node(14);
        ZigZagFromBottom.root.right.right.right = new Node(19);

        System.out.println("Zigzag Traversal from Bottom:");

        List<List<Integer>> result = zigZagTraversalFromBottom(root);

        for (List<Integer> element : result) {
            System.out.println(element);
        }
    }

    private static List<List<Integer>> zigZagTraversalFromBottom(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<Node> deque = new LinkedList<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            boolean rightToLeft = false;

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = rightToLeft ? deque.pollLast() : deque.pollFirst();

                currentLevel.add(currentNode.val);

                if (rightToLeft) {
                    if (currentNode.left != null) {
                        deque.addFirst(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        deque.addFirst(currentNode.right);
                    }
                } else {
                    if (currentNode.right != null) {
                        deque.addLast(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.addLast(currentNode.left);
                    }
                }
            }

            result.add(0, currentLevel);
            rightToLeft = !rightToLeft;
        }

        return result;
    }
}
