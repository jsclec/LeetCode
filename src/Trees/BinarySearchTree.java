package Trees;

public class BinarySearchTree {
    public class Node{
        int key;
        Node left;
        Node right;
        public Node(){}
        public Node(int key){this.key = key;}
        public Node(int key, Node left, Node right){
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    public Node root;

    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }
        if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inOrderTraversal(){
        inOrderTraversalRec(root);
    }

    void inOrderTraversalRec(Node root){
        if(root != null){
            inOrderTraversalRec(root.left);
            System.out.println(root.key);
            inOrderTraversalRec(root.right);
        }
    }
}
