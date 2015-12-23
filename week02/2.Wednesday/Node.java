public class Node {

	private int value = 0;
	private Node next = null;
	private Node previous = null;

	Node() {
		value = 0;
		next = null;
		previous = null;
	}

	Node(int val) {
		Node newNode = new Node();
		newNode.setValue(val);
		next = new Node();
		next.setPrev(this);
		previous = null;

	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setValue(int val) {
		value = val;
	}

	public void setNext(Node n) {
		next = n;
	}
	
	public void setPrev (Node n)
	{
		previous = n;
	}

}
