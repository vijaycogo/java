package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Cousin2 {
    private static Node root;

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public boolean isCousin(Node root, int m, int n) {
        if (root == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isAexist = false;
            boolean isBexist = false;

            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();

                if (cur.val == m) isAexist = true;
                if (cur.val == n) isBexist = true;

                if (cur.left != null && cur.right != null) {
                    if (cur.left.val == m && cur.right.val == n) {
                        return false;
                    }
                    if (cur.left.val == n && cur.right.val == m) {
                        return false;
                    }
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            if (isAexist && isBexist) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cousin2.root = new Node(8);
        Cousin2.root.left = new Node(5);
        Cousin2.root.left.left = new Node(4);
        Cousin2.root.left.right = new Node(7);
        Cousin2.root.right = new Node(11);
        Cousin2.root.right.right = new Node(17);
        Cousin2.root.right.right.left = new Node(14);
        Cousin2.root.right.right.right = new Node(19);

        Cousin2 cousin = new Cousin2();
        // boolean ans = cousin.isCousin(root, 4, 7);
        boolean ans = cousin.isCousins(root, 4, 7);

        if (ans)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////



    Node xParent = null, yParent = null;
    int xDepth = -1, yDepth = -2;
    
    public boolean isCousins(Node root, int x, int y) {
        dfs(root, null, x, y, 0);
        return xDepth == yDepth && xParent != yParent;
    }
    void dfs(Node root, Node parent, int x, int y, int depth) {
        if (root == null) return;
        if (x == root.val) {
            xParent = parent;
            xDepth = depth;
        } else if (y == root.val) {
            yParent = parent;
            yDepth = depth;
        } else {
            // if we found x node or found y node then we don't need to dfs deeper
            //     because x and y must be the same depth
            dfs(root.left, root, x, y, depth + 1);
            dfs(root.right, root, x, y, depth + 1);
        }
    }
}

