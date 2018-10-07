/**.
 * Class for QuickSort.
 */
class QuickSort {
    /**.
     * Constructs QuickSort object.
     */
    QuickSort() {
        /**.
         * { empty constructor }.
         */
    }
    /**.
     * { sorts all the elements using insertion array }.
     * Time complexity is O(N^2).
     * @param      a  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     */
    public void insertion(final Comparable[] a, final int low,
     final int high) {
        // int i = low;
        // int j = high;
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low; j--) {
                if (less(a[j], a[j - 1])) {
                    exchange(a, j, j - 1);
                }
            }
        }
    }
    /**.
     * { swaps the elements in the array }
     * time complexity of this is constant.
     * @param      a  The arguments
     * @param      j  The arguments
     * @param      min  The arguments
     */
    public void exchange(final Comparable[] a, final int j, final int min) {
        Comparable swap = a[j];
        a[j] = a[min];
        a[min] = swap;
    }
    /**.
     * Returns a string representation of the object.
     * time complexity is O(N).
     * @param      a   The a
     *
     * @return     String representation of the object.
     */
    public String toString(final Comparable[] a) {
        String str = "[";
        for (int i = 0; i < a.length - 1; i++) {
            str += a[i] + ", ";
        }
        str += a[a.length - 1] + "]";
        return str;
    }
    /**.
     * { sorts the elements in  the array }.
     * time complexity is O(log N)
     * @param      a  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     * @param      cutOff  The arguments
     */
    public void sort(final Comparable[] a, final int low,
     final int high, final int cutOff) {
        if (high <= low + cutOff - 1) {
            insertion(a, low, high);
            System.out.println("insertionSort called");
            return;
        }
        int k = partition(a, low, high);
        System.out.println(toString(a));
        sort(a, low, k - 1, cutOff);
        sort(a, k + 1, high, cutOff);
    }
    /**.
     * { function_description }
     * time complexity is constant.
     * @param      array   The array
     * @param      cutOff  The cut off
     */
    public void sort(final Comparable[] array, final int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
    }
    /**.
     * { divides the array into parts }.
     *  time complexity is O(N)
     * @param      a   The a
     * @param      low   The low
     * @param      high  The high
     *
     * @return  returns index of partition.
     */
    public int partition(final Comparable[] a,
     final int low, final int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(a[++i], a[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(a[low], a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(a, i, j);
        }
        exchange(a, low, j);
        return j;
    }
    /**.
     * { compares two objects }.
     *  time complexity is constant.
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
}
