package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZag {
    private static Node root;

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private static List<List<Integer>> zigZagTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        boolean rightToLeft = false;
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                if (!rightToLeft) {
                    Node frontNode = queue.pollFirst();
                    currentLevel.add(frontNode.val);

                    if (frontNode.left != null) {
                        queue.addLast(frontNode.left);
                    }

                    if (frontNode.right != null) {
                        queue.addLast(frontNode.right);
                    }

                } else {
                    Node lastNode = queue.pollLast();
                    currentLevel.add(lastNode.val);

                    if (lastNode.right != null) {
                        queue.addFirst(lastNode.right);
                    }
                    if (lastNode.left != null) {
                        queue.addFirst(lastNode.left);
                    }
                }
            }
            rightToLeft = !rightToLeft;
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        ZigZag.root = new Node(8);
        ZigZag.root.left = new Node(5);
        ZigZag.root.left.left = new Node(4);
        ZigZag.root.left.right = new Node(7);
        ZigZag.root.right = new Node(11);
        ZigZag.root.right.right = new Node(17);
        ZigZag.root.right.right.left = new Node(14);
        ZigZag.root.right.right.right = new Node(19);
        System.out.println("Zig Zag Traversal:");

        List<List<Integer>> ans = zigZagTraversal(root);

        for (List<Integer> element : ans) {
            System.out.println(element);
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
