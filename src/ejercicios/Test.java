/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

class Node {
    int key;
    int height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}


class AVLTree {
    Node root;

    int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }


    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // actualiza alturas
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1; 

        // Return new root
        return x;
    }


    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        
        // configura la rotación
        y.left = x;
        x.right = T2;
        
        // actualiza alturas
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Node N) {
        if (N == null)
           return 0;

        return height(N.left) - height(N.right);
    }


    Node insert(Node node, int key) {

        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // no permite valores duplicados
            return node;

        node.height = 1 + max(height(node.left), height(node.right)); // ***

        int balance = getBalance(node);

        // desbalanceado izquierda izquierda
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // derecha derecha
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
        // Izquierda derecha|
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Derecha Izquierda
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }


 void preOrder(Node node) {
 if (node != null) {
 System.out.print(node.key + " ");
 preOrder(node.left);
 preOrder(node.right);
 }
 }


 void inOrder(Node node) {
 if (node != null) {
 inOrder(node.left);
 System.out.print(node.key + " ");
 inOrder(node.right);
 }
 }



void postOrder(Node node) {
if (node != null) {
postOrder(node.left);
postOrder(node.right);
System.out.print(node.key + " ");
}
}
}
public class Test {
    public static void main(String[] args) {
        AVLTree avtTree = new AVLTree();
        
        avtTree.root = avtTree.insert(avtTree.root, 10); 
        avtTree.root = avtTree.insert(avtTree.root, 20); 
        avtTree.root = avtTree.insert(avtTree.root, 30); 
        avtTree.root = avtTree.insert(avtTree.root, 40); 
        avtTree.root = avtTree.insert(avtTree.root, 50); 
        avtTree.root = avtTree.insert(avtTree.root, 25); 
        
        System.out.println("preOrder: ");
        avtTree.preOrder(avtTree.root);
        System.out.println("\ninOrder: ");
        avtTree.inOrder(avtTree.root);
        System.out.println("\nPostOrder: ");
        avtTree.postOrder(avtTree.root);

    }

}