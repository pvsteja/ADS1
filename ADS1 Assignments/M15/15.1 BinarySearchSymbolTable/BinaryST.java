/**
 * Importing Array package.
 */
import java.util.Arrays;
/**
 * Class for BinaryST which has two parameters key and values.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
public final class BinaryST<Key extends Comparable<Key>, Value> {
    /**
     * Stores the keys.
     */
    private Key[] keys;
    /**
     * Stores the keys.
     */
    private Value[] values;
    /**
     * Size.
     */
    private int size;
    /**
     * Constructs the object.
     */
    public BinaryST() {
        keys = (Key[]) new Comparable[2];
        values = (Value[]) new Object[2];
        size = 0;
    }
    /**
     * Resizes the Keys[] and values[].
     *
     * @param      cap   The capability
     */
    private void resize(int cap) {
        keys = Arrays.copyOf(keys, cap);
        values = Arrays.copyOf(values, cap);
    }
    /**
     * Adds the key and allots to the value.
     * Complexity N
     * @param      k     { parameter_description }
     * @param      v     { parameter_description }
     */
    public void put(Key k, Value v) {
        //if value is null then delete the key.
        if (v==null) {
            delete(k);
            return;
        }
        //getRank means getting the position of the key in the array.
        int i= getRank(k);
        if (i< size && keys[i].compareTo(k) == 0) {
            values[i]= v;
            return;
        }
        for (int j =size; j > i; j--)  {
            keys[j]= keys[j - 1];
            values[j]= values[j - 1];
        }
        keys[i] =k;
        values[i]= v;
        size++;
        if (size == keys.length) {
            resize(2 * size);
        }
    }
    /**
     * Finds the rank of the given key.
     * Complexity log N.
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    public int getRank(final Key key) {
        int lo = 0, hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int comp = key.compareTo(keys[mid]);
            if (comp > 0) {
                lo = mid + 1;
            } else if (comp < 0) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
    /**
     * Gets the value.
     *
     * @param      a     Key.
     *
     * @return     Value.
     */
    public Value get(final Key a) {
        //if the array is empty returns null.
        if (isEmpty()) {
            return null;
        }
        int i = getRank(a);
        //if both the conditions satisfies then it returns the value.
        if (i < size && keys[i].compareTo(a) == 0) {
            return values[i];
        }
        return null;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * Checks whether the key is in the given array.
     *
     * @param      k     key
     *
     * @return     true/false
     */
    public boolean contains(final Key k) {
        return get(k) != null;
    }
    /**
     * Finds the floor of the entered key.
     *
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Key getFloor(final Key k) {
        //if the array is empty returns null.
        if (isEmpty()) {
            return null;
        }
        int i = getRank(k);
        if (i == 0) {
            return null;
        }
        if (i < size && keys[i].compareTo(k) == 0) {
            return keys[i];
        }
        return keys[i - 1];
    }
    /**
     * Deletes a given key.
     * Complexity N
     * @param      delkey  The delkey
     */
    public void delete(final Key delkey) {
        final int four = 4;
        if (isEmpty()) {
            return;
        }
        //getRank means getting the position or index of the array
        // then we can delete that particular key.
        int i = getRank(delkey);
        // if the condition is true then return else
        if (i < size && keys[i].compareTo(delkey) != 0) {
            return;
        }
        for (int j = i; j < size - 1; j++)  {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        size--;
        keys[size] = null;
        values[size] = null;
        if (size > 0 && size == keys.length / four) {
            resize(keys.length / 2);
        }
    }
    /**
     * deleteMin deletes the minimum value or the first value.
     */
    public void deleteMin() {
        if (!(isEmpty())) {
            delete(keys[0]);
        }
    }
    /**
     * Returns a string representation of the object.
     * Complexity N.
     * @return     String representation of the object.
     */
    public String toString() {
        //taking String as empty.
        String s = "";
        //if condition is true then entering keys and values in string.
        //if condition is false then it will return s.
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                //storing each key and value of index 0, 1, 2,- - -(n-1).
                s += keys[i] + " " + values[i] + "\n";
            }
            return s.substring(0, s.length() - 1);
        }
        return s;
    }
    /**
     * getMax function Gets the maximum in the array.
     *
     * @return     The maximum.
     */
    public Key getMax() {
        return keys[size - 1];
    }
}
