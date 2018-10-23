/**
 * Class for percolation.
 */
class Percolation {
  // create n-by-n grid, with all sites blocked

  /**
   * grid for simulation.
   */
  private boolean[][] grid;
  /**
   * Size of the grid.
   */
  private int n;
  /**
   * number of open sites.
   */
  private int count;
  /**
   * top node.
   */
  private int top;
  /**
   * bottom node.
   */
  private int bottom;
  /**
   * connection array.
   */
  private WeightedUnion percCheck;

  /**
   * Constructs the object.
   *
   * @param      num     Size of the grid.
   */
  Percolation(final int num) {
    grid = new boolean[num][num];
    count = 0;
    top = 0;
    bottom = num * num + 1;
    percCheck = new WeightedUnion(num * num + 2);
    n = num;
  }

  /**
   * Gets the number of the site in the union array.
   *
   * @param      row   The row.
   * @param      col   The column.
   *
   * @return     The number.
   */
  public int getNum(final int row, final int col) {
    return row * n + col + 1;
  }

  // open site (row, col) if it is not open already

  /**
   * Opens a site.
   *
   * @param      row   The row.
   * @param      col   The column.
   */
  public void open(final int row, final int col) {
    if (!(isOpen(row, col))) {
      grid[row][col] = true;
      count += 1;
    }
    if (row == 0) {
      percCheck.union(getNum(row, col), top);
    }
    if (row == n - 1) {
      percCheck.union(getNum(row, col), bottom);
    }
    if (col > 0 && isOpen(row, col - 1)) {
      percCheck.union(getNum(row, col), getNum(row, col - 1));
    }
    if (col < n - 1 && isOpen(row, col + 1)) {
      percCheck.union(getNum(row, col), getNum(row, col + 1));
    }
    if (row > 0 && isOpen(row - 1, col)) {
      percCheck.union(getNum(row, col), getNum(row - 1, col));
    }
    if (row < n - 1 && isOpen(row + 1, col)) {
      percCheck.union(getNum(row, col), getNum(row + 1, col));
    }
    return;
  }

  /**
   * Determines if open.
   *
   * @param      row   The row
   * @param      col   The col
   *
   * @return     True if open, False otherwise.
   */
  public boolean isOpen(final int row, final int col) {
    return grid[row][col];
  }

  // public boolean isFull(int row, int col)  // is site (row, col) full?

  /**
   * Number of open sites.
   *
   * @return     Integer.
   */
  public int numberOfOpenSites() {
    // number of open sites
    return count;
  }
  /**
   * checks whether the system percolates or not.
   *
   * @return     boolean
   */
  public boolean percolates() {
    // does the system percolate?
    return percCheck.connected(top, bottom);
  }
}
