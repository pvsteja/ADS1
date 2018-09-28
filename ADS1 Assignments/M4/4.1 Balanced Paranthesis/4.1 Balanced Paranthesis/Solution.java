import java.util.Scanner;
/**.
 * List of linkeds.
 */
class LinkedList {
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * { var_description }
         */
        private char data;
        /**.
         * { var_description }
         */
        private Node nextaddress;
    }
    /**.
     * { var_description }
     */
    private Node top = null;
    /**.
     * { PUSH FUNCTION }
     *
     * @param      item  The item
     */
    public void push(final char item) {
        Node temp1 = new Node();
        temp1.data = item;
        temp1.nextaddress = top;
        top = temp1;
    }
    /**.
     * { pop }
     *
     * @return     { description_of_the_return_value }
     */
    public char pop() {
        char data = top.data;
        top = top.nextaddress; // to move pointer to next node.
        return  data;
    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return  top == null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public char top() {
        return top.data;
    }

}
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    /**.
     * { item_description }
     */
    /**.
     * { item_description }
     */
     }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < k; i++) {
            String s = scan.next();
            if (theParanthesis(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean theParanthesis(final String s) {
        LinkedList l = new LinkedList();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                l.push(ch);
            } else {
                if (l.isEmpty()) {
                    return false;
                }
                if (ch == '}' && l.top() == '{') {
                    l.pop();
                } else if (ch == ']' && l.top() == '[') {
                    l.pop();
                } else if (ch == ')' && l.top() == '(') {
                    l.pop();
                } else {
                    return false;
                }

            }
        }
        return l.isEmpty();
    }
}
