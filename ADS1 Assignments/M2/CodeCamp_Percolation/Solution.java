// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }


// You can implement the above API to solve the problem
import java.util.Scanner;

// You can implement the above API to solve the problem

/**
 * Class for solution.
 */
public final class Solution {

  /**
   * Constructs the object.
   */
  private Solution() {
    // unused constructor for checkstyle
  }
  /**
   * main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    Percolation perc = new Percolation(num);
    while (scan.hasNext()) {
      int p = scan.nextInt();
      int q = scan.nextInt();
      perc.open(p - 1, q - 1);
    }
    System.out.println(perc.percolates());
  }
}
