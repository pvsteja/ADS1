import java.util.Scanner;
/**
 * constructs class solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    }
    /**.
     * { main method for quick sort}.
     *
     * @param      args  The arguments
     */
    // time complexity is N
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickSort sort = new QuickSort();
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testcases; i++) {
            int j = Integer.parseInt(sc.nextLine());
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                sort.sort(tokens, j);
                System.out.println(sort.toString(tokens));
            }
        }
    }
}
