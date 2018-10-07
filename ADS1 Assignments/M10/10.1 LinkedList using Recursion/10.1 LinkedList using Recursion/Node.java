/**
 * class for node.
 */
class Node {
    /**
     * description of variable data.
     * The data which is entered is of int type.
     */
    private int data;
    /**
     * description of variable nextlink.
     * nextlink the saves the address of the next node.
     */
    private Node nextlink;
    /**
     * Constructs the object.
     * In Node we have both nextlink and data.
     * @param      val  The data
     */
    Node(final int val) {
        data = val;
        nextlink = null;
    }
    /**
     * Gets the value.
     * getdata means they are storing some value init and returns the data.
     *
     * @return     The value.
     */
    public int getData() {
        return data;
    }
    /**
     * Gets the next.
     * getting the link or address of the next node.
     *
     * @return     The next.
     */
    public Node getNextlink() {
        return nextlink;
    }
    /**
     * Sets the next.
     * It will set the next Node link or address.
     *
     * @param      value  The value
     */
    public void setNextlink(final Node value) {
        this.nextlink = value;
    }
}