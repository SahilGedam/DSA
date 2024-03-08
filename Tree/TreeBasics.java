package Tree;

// build tree from preorder
public class TreeBasics {

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

  static class BinaryTree {

    static int index = -1;

    public Node buildTree(int nodes[]) {
      index++;
      if (nodes[index] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[index]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }
  }

  public static void preorder(Node root) { // root first
    if (root == null) {
      System.out.print(-1 + " ");
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void inorder(Node root) { // print left nodes first
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void postorder(Node root) { // print left subtree first , then right , then root
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    // System.out.println(root.data);
    //  preorder(root); // O (n) traversal
    // inorder(root);
    postorder(root);
  }
}
