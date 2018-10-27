/**
 * importing Scanner package
 */
import java.util.Scanner;
/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
  	//creating new Scanner from system.
    Scanner sc = new Scanner(System.in);
    // a new line consists of int which will be stored in n.
    int n = Integer.parseInt(sc.nextLine());
    //creating a new LinearprobingHashST with integer and string as objects.
    LinearProbingHashST<Integer, String> st =
     new LinearProbingHashST<Integer, String>();
    for (int i = 0; i < n; i++) {
      String[] tokens = sc.nextLine().split(",");
      String s = tokens[1] + "," + tokens[2];
      st.put(Integer.parseInt(tokens[0]), s);
    }
    int m = Integer.parseInt(sc.nextLine());
    for (int j = 0; j < n; j++) {
      String[] tokens1 = sc.nextLine().split(" ");
      String s = st.get(Integer.parseInt(tokens1[1]));
      if (s != null) {
        String[] tokens2 = s.split(",");
        if (Integer.parseInt(tokens1[2]) == 1) {
          System.out.println(tokens2[0]);
        } else {
          System.out.println(Double.parseDouble(tokens2[1]));
        }
      } else {
        System.out.println("Student doesn't exists...");
      }
    }
  }
}
