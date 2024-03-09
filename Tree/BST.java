package Tree;

public class BST {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      // left subtree
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }

  public static void inorder(Node root) { // print left nodes first
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static boolean search(Node root, int val) {
    if (root == null) {
      return false;
    } else if (root.data == val) { // found
      return true;
    } else if (root.data > val) { // search in left
      return search(root.left, val);
    } else {
      return search(root.right, val); // search in right
    }
  }

  public static void main(String[] args) {
    int values[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    inorder(root);
    System.out.println();

    System.out.println(search(root, 6));
  }
}
