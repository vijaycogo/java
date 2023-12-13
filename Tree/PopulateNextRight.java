package Tree;

public class PopulateNextRight {
    private static Node root;

    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            this.val = _val;
            this.left = _left;
            this.right = _right;
            this.next = _next;
        }
    }

    private static Node populateNextRightPointer(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;

        while (leftMost.left != null) {
            Node currentNode = leftMost;

            while (currentNode != null) {
                currentNode.left.next = currentNode.right;
                if (currentNode.next != null) {
                    currentNode.right.next = currentNode.next.left;
                }
                currentNode = currentNode.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    private static void printNodes(Node root) {
        if (root == null) {
            return;
        }

        Node currentLevel = root;
        while (currentLevel != null) {
            Node current = currentLevel;

            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println(); // Move to the next line for the next level
            currentLevel = currentLevel.left; // Move to the leftmost node of the next level
        }
    }

    public static void main(String[] args) {
        PopulateNextRight.root = new Node(1);
        PopulateNextRight.root.left = new Node(2);
        PopulateNextRight.root.left.left = new Node(4);
        PopulateNextRight.root.left.right = new Node(5);
        PopulateNextRight.root.right = new Node(3);
        PopulateNextRight.root.right.left = new Node(6);
        PopulateNextRight.root.right.right = new Node(7);

        System.out.println("Populate Next Right Pointer of perfect binary tree:");

        Node ans = populateNextRightPointer(root);
        printNodes(ans);
    }
}
