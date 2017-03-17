package com.company;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node _4 = new Node();
        _4.data = 4;

        Node _2 = new Node();
        _2.data = 2;

        Node _6 = new Node();
        _6.data = 6;

        Node _1 = new Node();
        _1.data = 1;

        Node _3 = new Node();
        _3.data = 3;

        _2.left = _1;
        _2.right = _3;

        Node _5 = new Node();
        _5.data = 5;
        _6.left = _5;

        Node _7 = new Node();
        _7.data = 7;
        _6.right = _7;


        _4.left = _2;
        _4.right = _6;


        System.out.println(checkBST(_2));

    }

    static boolean checkBST(Node root) {
        return isBST(root, null, null);
    }

    private static boolean isBST(Node x, Integer min, Integer max) {
        if (x == null)
            return true;
        if (min != null && x.data <= min)
            return false;
        if (max != null && x.data >= max)
            return false;
        return isBST(x.left, min, x.data) && isBST(x.right, x.data, max);
    }
}

class Node {
    int data;
    Node left;
    Node right;
}
