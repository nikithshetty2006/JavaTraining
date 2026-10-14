package uyguty;


public class order {
    // Standard capitalized class name for Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        if (value < root.data) {
            return search(root.left, value);
        }
        return search(root.right, value);
    }

    // Left, Root, Right
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Root, Left, Right
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Left, Right, Root
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        // Changed insertion sequence to form a proper branching BST
        Node root = new Node(40);
        root = insert(root, 20);
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 50);
        root = insert(root, 60);

        System.out.println("Inorder (Should be sorted):");
        inorder(root);
        System.out.println("\n");

        System.out.println("Preorder:");
        preorder(root);
        System.out.println("\n");

        System.out.println("Postorder:");
        postorder(root);
        System.out.println();
    }
}

//        root.left=new node(20);
//        root.right=new node(30);
//        root.left.left=new node(40);
//        root.left.right=new node(50);
//
//        root.right.left=new node(60);
//        root.right.right=new node(70);
//
//        System.out.println("Inorder:");
//        inorder(root);
//        System.out.println();
//        System.out.println("Preorder:");
//        preorder(root);
//        System.out.println();
//        System.out.println("Postorder:");
//        postorder(root);
//    }
//}
