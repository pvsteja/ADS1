import java.util.Scanner;
/**
 * Class for binary search tree.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
class BST<Key extends Comparable<Key>, Value> {
  /**
   * Class for node.
   */
  private class Node {
    /**
     * Key variable.
     */
    private Key key;
    /**
     * Value variable.
     */
    private Value value;
    /**
     * Left node address.
     */
    private Node left;
    /**
     * Right node address.
     */
    private Node right;
    /**
     * Constructs the object.
     *
     * @param      key1    The key
     * @param      value1  The value
     */
    Node(final Key key1, final Value value1) {
      this.key = key1;
      this.value = value1;
    }
  }
  /**
   * Root node class variable.
   */
  private Node root;
  /**
   * Puts a value in the tree.
   *
   * @param      key    The key
   * @param      value  The value
   */
  public void put(final Key key, final Value value) {
    root = put(root, key, value);
  }
  /**
   * Puts a value in the tree.
   *
   * @param      root1   The root
   * @param      key    The key
   * @param      value  The value
   *
   * @return     Root node.
   */
  private Node put(final Node root1, final Key key, final Value value) {
    if (root1 == null) {
      return new Node(key, value);
    }
    int comp = key.compareTo(root1.key);
    if (comp < 0) {
      root1.left = put(root1.left, key, value);
    } else if (comp > 0) {
      root1.right = put(root1.right, key, value);
    } else {
      root1.value = value;
    }
    return root1;
  }
  /**
   * Get the value of a key in the tree.
   *
   * @param      key   The key
   *
   * @return     Value.
   */
  public Value get(final Key key) {
    return get(root, key);
  }

  /**
   * Gets the value of a key in the tree.
   *
   * @param      root1  The root
   * @param      key   The key
   *
   * @return     Value.
   */
  public Value get(final Node root1, final Key key) {
    if (root1 == null) {
      return null;
    }
    int comp = key.compareTo(root1.key);
    if (comp < 0) {
      return get(root1.left, key);
    } else if (comp > 0) {
      return get(root1.right, key);
    } else {
      return root1.value;
    }
  }
}