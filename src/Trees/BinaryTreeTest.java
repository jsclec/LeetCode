package Trees;

import java.util.Random;

public class BinaryTreeTest {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        Random r = new Random();
        bst.insert(r.nextInt(100));
        bst.insert(r.nextInt(50));
        bst.insert(r.nextInt(101));
        bst.insert(r.nextInt(72));
        bst.insert(r.nextInt(33));
        bst.insert(r.nextInt(135));
        bst.insert(r.nextInt(4));
        bst.insert(r.nextInt(109));

        bst.inOrderTraversal();
    }
}
