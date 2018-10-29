import java.util.Scanner;

/**
 * Class for cube sum.
 */
class CubeSum implements Comparable<CubeSum> {
  /**.
   * { var_description }
   */
  private final int sum;
  /**.
   * { var_description }
   */
  private final int i;
  /**.
   * { var_description }
   */
  private final int j;

  /**
   * Constructs the object cubesum with integer parameters i, j.
   *
   * @param      i     { parameter_description }
   * @param      j     { parameter_description }
   */
  public CubeSum(final int I, final int J) {
    this.sum = I * I * I + J * J * J;
    this.i = I;
    this.j = J;
  }

  /**.
   * { function_description }
   *
   * @param      that  The that
   *
   * @return     { description_of_the_return_value }
   */
  public int compareTo(final CubeSum that) {
    if (this.sum < that.sum) {
      return -1;
    }
    if (this.sum > that.sum) {
      return +1;
    }
    return 0;
  }

  /**
   * Returns a string representation of the object.
   *
   * @return     String representation of the object.
   */
  public String toString() {
    return sum + " = " + i + "^3" + " + " + j + "^3";
  }

  /**.
   * { function_description }
   *
   * @return     { description_of_the_return_value }
   */
  public int sum() {
    return sum;
  }

  /**.
   * { function_description }
   *
   * @return     { description_of_the_return_value }
   */
  public int geti() {
    return i;
  }

  /**.
   * { function_description }
   *
   * @return     { description_of_the_return_value }
   */
  public int getj() {
    return j;
  }

}

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
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int mWays = scan.nextInt();

    MinPQ<CubeSum> pq = new MinPQ<CubeSum>();

    for (int i = 1; i <= 550; i++) {
      pq.insert(new CubeSum(i, i));
    }

        CubeSum prev = new CubeSum(0, 0);
        long sum = 0;
        // for (k < n; k++) {
        int p = 1;
        int k = 0;
      while (!pq.isEmpty()) {
        CubeSum c = pq.delMin();
          if (prev.sum() == c.sum()) {
            p++;
            if (p == mWays)
          {
            sum = c.sum();

            if (++k == num) break;
            }
          }
          else {
            p = 1;
          }
          prev = c;
          if (c.getj() < 550)
              pq.insert(new CubeSum(c.geti(), c.getj() + 1));
          // }
        }
        System.out.println(sum);

  }
}
