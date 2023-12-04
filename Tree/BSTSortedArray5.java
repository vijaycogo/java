package Tree;

public class BSTSortedArray5 {
    public BSTSortedArray5(){

    }

    private Node root;
    public class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val=val;
        }
    }

    public void insert(int num){
        root = insert(root,num);
    }

    public Node insert(Node node, int value){
        if(node==null){
            Node root = new Node(value);
            return root;
        }

        if(node.val < value){
            node.left = insert(node.left, value);
        }

        if(node.val > value){
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void populateWithoutmid(int[]arr){
        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }
    }

    public void populateWithIndex(int[]arr){
        populateSorted(arr, 0, arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }


    public static void main(String[] args) {
        BSTSortedArray5 bstSortedArray5 = new BSTSortedArray5();
        int[] arr = {1,2,3,4,5,6,7};
        // O(N)
        bstSortedArray5.populateWithoutmid(arr);
        bstSortedArray5.display();

        // to remove limitation h*log(N)
        BSTSortedArray5 bstSortedArray = new BSTSortedArray5();
        int[] arr2 = {1,2,3,4,5,6,7};
        bstSortedArray.populateWithIndex(arr2);
        bstSortedArray.display();
    }


    public void display(){
        display(root, "Root is ");
    }
    public void display(Node node, String message){
        if(node==null){
            return;
        }
        System.out.println(message + node.val);
        display(node.left, "left child of " + node.val + ": ");
        display(node.right, "right child of " + node.val + " : ");
    }
}
