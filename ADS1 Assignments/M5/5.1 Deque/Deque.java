/**
 * Class for deque.
 *
 * @param      <E>   { parameter_description }
 */
public class Deque<E> {
    /**
     * Class for node.
     */
    private class Node {
        E data;
        Node next;
        // Node previous;
        Node() {

        }
        Node(E data) {
            this.data = data;
        }
        Node(E data, Node n/*, Node prev*/) {
            this.data = data;
            this.next = n;
            // this.previous = prev;
        }
    }
    /**.
     * Constructs the object.
     */
    Deque() {

    }
    Node head, tail;
    int size;
    /**.
     * Pushes a left.
     *
     * @param      data  The data
     */
    public void pushLeft(E data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, head);
        head = node;
        size++;
    }
    /**
     * Pushes a right.
     *
     * @param      data  The data
     */
    public void pushRight(E data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, null);
        tail.next = node;
        tail = node;
        size++;
    }
    /**.
     * Gets the size.
     *
     * @return     The size.
     */
    public int getSize() {
        return size;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public E popLeft() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
        System.out.println("Deck is empty");
        return null;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public E popRight() {
        if (head != null) {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            E element = temp.next.data;
            temp.next = null;
            tail = temp;
            size--;
            return element;
        } else {
            System.out.println("Deck is empty");
            return null;
        }
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
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (head != null) {
            String s = "[";
            Node thead = head;
            while (thead.next != null) {
                s += (thead.data) + ", ";
                thead = thead.next;
            } s += (thead.data) + "]";
            return s;
        } else {
            return "[]";
        }
    }
}