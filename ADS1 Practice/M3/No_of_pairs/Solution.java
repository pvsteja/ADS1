import java.util.*;
/**.
 * Class for solution.
 */
class Solution {
/**.
 * { function_description }
 *
 * @param      args  The arguments
 */
public static void main(final String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Input no of elements you want to give as input:");
  int n = s.nextInt();
  int a[] = new int[n];
  int i, j, check = 1, count = 0;
  System.out.println("enter numbers: ");
  for (i = 0; i < n ; i++) {
    a[i] = s.nextInt();
  }
  Arrays.sort(a);
  for (i = 0; i < a.length - 1; i++) {
    if(a[i] == a[i + 1]) {
      check += 1;
    } else {
    count += (check*(check - 1)) / 2;
    check = 1;
    }
  } count += (check*(check - 1)) / 2;
  System.out.println("count:"+count);
}
}