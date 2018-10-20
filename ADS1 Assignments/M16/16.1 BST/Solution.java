import java.util.Scanner;
/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    final int three = 3;
    final int four = 4;
    BST<String, String> bst = new BST<String, String>();
    while (scan.hasNext()) {
      String[] inputs = scan.nextLine().split(",");
      String key = inputs[1] + inputs[2] + inputs[three];
      switch (inputs[0]) {
      case "put":
        bst.put(key, inputs[four]);
        break;
      case "get":
        String out = bst.get(key);
        System.out.println(out);
        break;
      default:
        break;
      }
    }
  }
}
