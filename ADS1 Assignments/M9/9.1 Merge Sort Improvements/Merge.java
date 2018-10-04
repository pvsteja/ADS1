import java.util.Scanner;
/**
 * Class for merge.
 */
class Merge {
    /**
     * cutoff to insertion sort.
     */
    private final int x = 7;
    /**
     * Constructs the object.
     * Time complexity of this method is O(1).
     */
    Merge() {
        //Unused Constructor.
    }
    /**
     * {Method to merge two arrays}.
     * Time complexity of this method is O(N).
     * @param      a  The a
     * @param      aux    The auxiliary
     * @param      low     The lower value
     * @param      mid    The middle value
     * @param      high     The higher value
     */
    public void merge(final Comparable[] a, final Comparable[] aux,
                      final int low, final int mid, final int high) {
        // assert isSorted(a, low, mid);
        // assert isSorted(a, mid + 1, high);
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                aux[k] = a[j++];
            } else if (j > high) {
                aux[k] = a[i++];
            } else if (less(a[j], a[i])) {
                aux[k] = a[j++];
            } else {
                aux[k] = a[i++];
            }
        }
        // assert isSorted(aux, low, high);
    }
    /**
     * {Method for sorting}.
     * Time complexity of sorting is O(log(N)).
     * @param      a  The a
     * @param      aux    The auxiliary a
     * @param      low     The lower value
     * @param      high     The higher value
     */
    public void sort(final Comparable[] a, final Comparable[] aux,
                     final int low, final int high) {
        if (high <= low + x) {
            insertionSort(aux, low, high);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid = low + (high - low) / 2;
        sort(aux, a, low, mid);
        sort(aux, a, mid + 1, high);
        if (!less(a[mid + 1], a[mid])) {
            for (int i = low; i <= high; i++) {
                aux[i] = a[i];
            }
            System.out.println(
                "Array is already sorted. So, skipped the call to merge...");
            return;
        }
        merge(a, aux, low, mid, high);
    }
    /**
     * Rearranges the a in ascending order, using the natural order.
     * Time complexity of this method is O(N).
     * @param      a     {Comparable a}.
     */
    public void sort(final Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
        // assert isSorted(a);
    }
    /**
     * {Method for insertion sort}.
     * sort from a[low] to a[high].
     * Time complexity of insertion sort is O(N^2/2).
     * @param      a     {Comparable a}.
     * @param      low    The lower value
     * @param      high    The higher value
     */
    public void insertionSort(final Comparable[] a,
                final int low, final int high) {
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low; j--) {
                if (less(a[j], a[j - 1])) {
                    swap(a, j, j - 1);
                }
            }
        }
    }
    /**
     * {Method to exchange two elements in the a}.
     * Time complexity of this method is O(N).
     * @param      a     {a of object}
     * @param      i     {Integer i}
     * @param      j     {Integer j}
     */
    public void swap(final Comparable[] a,
                     final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * {Method to check which one is smaller of the two}.
     * Time complextiy of this method is O(1).
     * @param      a     {Comparable}.
     * @param      b     {Comparable}.
     * The complexity of boolean less is constant.
     * @return     {Boolean value}.
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
    /**
     * Method to determine if the a is sorted (or) not.
     * Time complexity of this method is O(1).
     * @param      a     {Comparable a}
     *
     * @return     True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    /**
     * Method to determine if the a is sorted (or) not.
     * Time complexity of this method is O(N).
     * @param      a     {Comparable a}
     * @param      low    The lower
     * @param      high    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a,
                            final int low, final int high) {
        for (int i = low + 1; i <= high; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}