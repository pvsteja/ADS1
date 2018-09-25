class linkedlist {
	private int size;
	private Node start;
	linkedlist() {
		this.size = 0;
		this.start = null;
	}
	public void pushRight(int data) {
		if (start == null) {
			start = new Node(data);
		}
		else {
			Node temp = start;
			Node a = new Node(data);
			while (temp.getLink() != null) {
				temp = temp.getLink();
			}
			temp.setLink(a);
		}
		size++;
	}
	public void pushLeft(int data) {
		Node newnode = new Node(data);
		newnode.setLink(start);
		start = newnode;
		size++;
	}
	public int size() {
		return size;
	}
	public void removeLeft() {
		if (start != null) {
			start = start.getLink();
			size--;
		} else {
			System.out.println("No nodes to remove");
		}
	}
	public void removeRight() {
		if (start == null) {
			System.out.println("No nodes to remove");
		}else if (size < 2) {
			start = null;
			size--;
		}else {
			Node temp = start;
			while (temp.getLink().getLink() !=null) {
				temp = temp.getLink();
			}
			temp.setLink(null);
			size--;
		}
	}
	public String toString() {
		String s = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp.getLink() != null) {
			s += temp.getData() + ", ";
			temp = temp.getLink();
		}
		s += temp.getData();
		return s;
	}
}