/**.
 * Importing the Scanner package.
 */
import java.util.Scanner;
/**
 * Importing ArrayList package.
 */
import java.util.ArrayList;

/**
 * Class for stock which implements comparable stock.
 */
class Stock implements Comparable<Stock> {
  /**
   * Class variable for company name.
   */
  private String company;
  /**
   * Class variable for change in stock by hour.
   */
  private double change;

  /**
   * Constructs the object.
   *
   * @param      cmp   The company
   * @param      chg   The change
   */
  Stock(final String cmp, final double chg) {
    this.company = cmp;
    this.change = chg;
  }

  /**
   * Gets the company of type String.
   * returns company
   *
   * @return     The company.
   */
  public String getComp() {
    return company;
  }

  /**
   * Gets the change.
   *
   * @return     The change.
   */
  public double getChange() {
    return change;
  }

  /**
   * Returns a string representation of the object.
   *
   * @return     String representation of the object.
   */
  public String toString() {
    return company + " " + change;
  }

  /**
   * Compares two stocks.
   * Using compareTo method
   * it will compare to objects and returns the value.
   * @param      that  The that
   *
   * @return     Integer value to compare.
   */
  public int compareTo(final Stock that) {
    if (this.change > that.getChange()) {
      return 1;
    }
    if (this.change < that.getChange()) {
      return -1;
    }
    if (this.company.compareTo(that.getComp()) > 0) {
      return 1;
    }
    if (this.company.compareTo(that.getComp()) < 0) {
      return -1;
    } else {
      return 0;
    }
  }
}

/**
 * Class for solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused
  }

  /**
   * Main method - Takes Inputs, prints out Outputs.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);

    int stockSize = Integer.parseInt(scan.nextLine());
    ArrayList<Stock> bestPerformers = new ArrayList<Stock>();
    ArrayList<Stock> worstPerformers = new ArrayList<Stock>();

    // hour 1
    MinPQ<Stock> hour1Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour1Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour1Max.insert(temp);
      hour1Min.insert(temp);
    }

    hour1Max.print(bestPerformers);
    hour1Min.print(worstPerformers);


    // hour 2
    MinPQ<Stock> hour2Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour2Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour2Max.insert(temp);
      hour2Min.insert(temp);
    }

    hour2Max.print(bestPerformers);
    hour2Min.print(worstPerformers);

    // hour 3
    MinPQ<Stock> hour3Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour3Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour3Max.insert(temp);
      hour3Min.insert(temp);
    }

    hour3Max.print(bestPerformers);
    hour3Min.print(worstPerformers);

    // hour 4
    MinPQ<Stock> hour4Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour4Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour4Max.insert(temp);
      hour4Min.insert(temp);
    }

    hour4Max.print(bestPerformers);
    hour4Min.print(worstPerformers);

    // hour 5
    MinPQ<Stock> hour5Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour5Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour5Max.insert(temp);
      hour5Min.insert(temp);
    }

    hour5Max.print(bestPerformers);
    hour5Min.print(worstPerformers);

    // hour 6
    MinPQ<Stock> hour6Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour6Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour6Max.insert(temp);
      hour6Min.insert(temp);
    }

    hour6Max.print(bestPerformers);
    hour6Min.print(worstPerformers);
  }
}
