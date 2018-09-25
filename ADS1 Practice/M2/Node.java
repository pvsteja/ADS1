class Node {
	private int data;
	private Node link;
	Node(int data) {
		this.data = data;
		this.link = null;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	public int getData() {
		return data;
	}
	public Node getLink() {
		return link;
	}
}