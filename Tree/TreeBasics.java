package Tree;

import java.util.LinkedList;
import java.util.Queue;

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

  static class TreeInfo {

    int ht;
    int diam;

    TreeInfo(int ht, int diam) {
      this.ht = ht;
      this.diam = diam;
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

  public static void levelorder(Node root) { // traverse by levels
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node currNode = q.remove();
      if (currNode == null) {
        System.out.println();
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(currNode.data + " ");
        if (currNode.left != null) {
          q.add(currNode.left);
        }
        if (currNode.right != null) {
          q.add(currNode.right);
        }
      }
    }
  }

  public static int countOfNodes(Node root) {
    if (root == null) {
      return 0;
    }

    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
  }

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }

    int leftsum = sumOfNodes(root.left);
    int rightsum = sumOfNodes(root.right);
    return leftsum + rightsum + root.data;
  }

  public static int heightOfTree(Node root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = heightOfTree(root.left);
    int rightHeight = heightOfTree(root.right);
    int myHeight = Math.max(leftHeight, rightHeight) + 1;
    return myHeight;
  }

  // diameter of the tree = maximum distance between two nodes in a tree
  // 3 cases= 1) diamter is in left subtree 2) diamter is in right subtree 3) diamter goes through root node
  public static int diameter(Node root) { // O(n^2)
    if (root == null) {
      return 0;
    }

    int diamLeft = diameter(root.left);
    int diamRight = diameter(root.right);
    int diam = heightOfTree(root.left) + heightOfTree(root.right) + 1;
    return Math.max(diam, Math.max(diamRight, diamLeft));
  }

  // faster way to calculate diamter , need to create a class TreeInfo
  public static TreeInfo diameter2(Node root) { // O(n)
    if (root == null) {
      return new TreeInfo(0, 0);
    }
    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;
    int diamLeft = left.diam;
    int diamRight = right.diam;
    int diam3 = left.ht + right.ht + 1;
    int myDiam = Math.max(Math.max(diamRight, diamLeft), diam3);
    TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
    return myInfo;
  }

  // // check if subtree is part of the tree ***

  // logic is proper , but unable to create another tree , check better algoriths to create binary tree

  public static boolean isIdentical(Node root, Node subRoot) {
    if (root == null && subRoot == null) {
      return true;
    }
    if (root == null || subRoot == null) {
      return true;
    }

    if (root.data == subRoot.data) {
      return (
        isIdentical(root.left, subRoot.left) &&
        isIdentical(root.right, subRoot.right)
      );
    }

    return false;
  }

  public static boolean isSubtree(Node root, Node subRoot) {
    if (subRoot == null) {
      return true;
    }
    if (root == null) {
      return false;
    }

    if (root.data == subRoot.data) {
      if (isIdentical(root, subRoot)) {
        return true;
      }
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    BinaryTree tree = new BinaryTree();

    Node root = tree.buildTree(nodes);
    // System.out.println(root.data);
    //  preorder(root); // O (n) traversal
    // inorder(root);
    // postorder(root);
    // levelorder(root);
    // System.out.println(countOfNodes(root));
    // System.out.println(sumOfNodes(root));
    // System.out.println(heightOfTree(root));
    // System.out.println(diameter(root));
    System.out.println(diameter2(root).diam);
  }
}
