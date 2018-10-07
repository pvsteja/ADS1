/**
 * Class for node.
 *
 * @param      <E>   { parameter_description }
 */
class Node<E> {
	E data;
	Node next;
	Node (E data){
		// this.data = data;
		// this.next = null;
		Node(data, null);
	}
	/**
	 * Constructs the object.
	 *
	 * @param      data  The data
	 * @param      next  The next
	 */
	Node(E data, Node next) {
		this.data = data;
		this.next = next;
	}
	/**
	 * Gets the data.
	 *
	 * @return     The data.
	 */
	public E getData() {
		return this.data;
	}
	/**
	 * Sets the data.
	 *
	 * @param      newData  The new data
	 */
	public void setData(E newData) {
		this.data = newData;
	}
	/**
	 * Gets the next.
	 *
	 * @return     The next.
	 */
	public Node getNext() {
		return this.next;
	}
	/**
	 * Sets the next.
	 *
	 * @param      newNext  The new next
	 */
	public void setNext(Node newNext) {
		this.next = newNext;
	}
}