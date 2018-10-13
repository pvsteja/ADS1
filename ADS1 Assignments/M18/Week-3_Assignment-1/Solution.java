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
    // creating new ArrayList for bestperformers.
    ArrayList<Stock> bestPerformers = new ArrayList<Stock>();
    // creating new ArrayList for worst performers.
    ArrayList<Stock> worstPerformers = new ArrayList<Stock>();

    // hour 1
    //minPQ of companys stockdetails for 1st hour.
    MinPQ<Stock> hour1Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 1st hour.
    MaxPQ<Stock> hour1Max = new MaxPQ<Stock>();


    for (int i = 0; i < stockSize; i++) {
      //
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour1Max.insert(temp);
      //inserting temp int min.
      hour1Min.insert(temp);
    }

    //printing bestperformers for hour1.
    hour1Max.print(bestPerformers);
    //printing worstperformers for hour1.
    hour1Min.print(worstPerformers);


    // hour 2
    //minPQ of companys stockdetails for 2nd hour.
    MinPQ<Stock> hour2Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 2nd hour.
    MaxPQ<Stock> hour2Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour2Max.insert(temp);
      //inserting temp int min.
      hour2Min.insert(temp);
    }
    //printing bestperformers for hour2.
    hour2Max.print(bestPerformers);
    //printing worstperformers for hour2.
    hour2Min.print(worstPerformers);

    // hour 3
    //minPQ of companys stockdetails for 3rd hour.
    MinPQ<Stock> hour3Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 3rd hour.
    MaxPQ<Stock> hour3Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour3Max.insert(temp);
      //inserting temp int min.
      hour3Min.insert(temp);
    }
    //printing bestperformers for hour3.
    hour3Max.print(bestPerformers);
    //printing worstperformers for hour3.
    hour3Min.print(worstPerformers);

    // hour 4
    //minPQ of companys stockdetails for 4th hour.
    MinPQ<Stock> hour4Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 4th hour.
    MaxPQ<Stock> hour4Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour4Max.insert(temp);
      //inserting temp int min.
      hour4Min.insert(temp);
    }
    //printing bestperformers for hour4.
    hour4Max.print(bestPerformers);
    //printing worstperformers for hour4.
    hour4Min.print(worstPerformers);

    // hour 5
    //minPQ of companys stockdetails for 5th hour.
    MinPQ<Stock> hour5Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 5th hour.
    MaxPQ<Stock> hour5Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour5Max.insert(temp);
      //inserting temp int min.
      hour5Min.insert(temp);
    }
    //printing bestperformers for hour5.
    hour5Max.print(bestPerformers);
    //printing worstperformers for hour5.
    hour5Min.print(worstPerformers);

    // hour 6
    //minPQ of companys stockdetails for 6th hour.
    MinPQ<Stock> hour6Min = new MinPQ<Stock>();
    //maxPQ of companys stockdetails for 6th hour.
    MaxPQ<Stock> hour6Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      //Initialing temp and storing the company names and percentages.
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      //inserting temp int max.
      hour6Max.insert(temp);
      //inserting temp int min.
      hour6Min.insert(temp);
    }
    //printing bestperformers for hour6.
    hour6Max.print(bestPerformers);
    //printing worstperformers for hour6.
    hour6Min.print(worstPerformers);
  }
}
