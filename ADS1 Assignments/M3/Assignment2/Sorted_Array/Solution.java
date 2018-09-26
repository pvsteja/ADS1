import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[m];
        int[] b = new int[n];
        int k = 0, i = 0, j = 0;
        String temp = "";
        String[] s;
        if (m != 0) {
            s = sc.nextLine().split(",");
            for (String each : s) {
                a[k++] = Integer.parseInt(each);
            }
        } else {
            sc.nextLine();
        }
        k = 0;
        if (n != 0) {
            s = sc.nextLine().split(",");
            // System.out.println("String .." + s);
            for (String each : s) {
                b[k++] = Integer.parseInt(each);
            }
        } else {
            sc.nextLine();
        }
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                temp += Integer.toString(a[i++]) + ",";
            } else if (a[i] > b[j]) {
                temp += Integer.toString(b[j++]) + ",";
            } else {
                temp += Integer.toString(b[j++]) + ",";
                i++;
            }
        }
        while (i < m) {
            temp += Integer.toString(a[i++]) + ",";
        }
        while (j < n) {
            temp += Integer.toString(b[j++]) + ",";
        }
        System.out.println(temp.substring(0, temp.length() - 1));
    }
}
