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
        // String array tokens means rollnumbers of students which are in
        // String array will be split with (,) in the next line.
      String[] tokens = sc.nextLine().split(",");
      //String s consists of names and grades with comma seperated.
      String s = tokens[1] + "," + tokens[2];
      //put method is used to attach or keep all the tokens in one array.
      st.put(Integer.parseInt(tokens[0]), s);
    }
    // a new line consists of int which will be stored in m.
    int m = Integer.parseInt(sc.nextLine());
    // this loop will repeat m times.
    for (int j = 0; j < m; j++) {
        // tokens1 in string array will be split with spaces in next line.
      String[] tokens1 = sc.nextLine().split(" ");
      String s = st.get(Integer.parseInt(tokens1[1]));
      // if string s is null then print "students doesn't exist"
      if (s != null) {
        String[] tokens2 = s.split(",");
        // if tokens == 1 then print name of the student else
        // print the grades of the respective rollnumbers.
        if (Integer.parseInt(tokens1[2]) == 1) {
            //printing names.
          System.out.println(tokens2[0]);
        } else {
            //printing marks.
          System.out.println(Double.parseDouble(tokens2[1]));
        }
      } else {
        System.out.println("Student doesn't exists...");
      }
    }
  }
}
