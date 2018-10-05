import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    /**
         * Constructs the object.
         */
        private Solution() {

        }
        /**.
         * { function_description }
         *
         * @param      args  The arguments
         */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int count = 0;
        n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int x = n - 1;
            while (j < x) {
                if (a[i] + a[j] + a[x] == 0) {
                    count++;
                    j++;
                    x--;

                } else if (a[i] + a[j] + a[x] < 0) {
                    j++;

                } else {
                    x--;
                }
            }
        }
        System.out.println(count);
    }
}
