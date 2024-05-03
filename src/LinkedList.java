
public class LinkedList {

	// Reference to the first node in the list
	private ListNode list;

	public LinkedList() {
		list = null;
	}

	public void add(Integer n) {
		ListNode newNode = new ListNode(n);
		if (list == null) {
			list = newNode;
		} else {
			ListNode current = list;
			while (current.getNext() != null) { // exception thrown
				current = current.getNext();
			}
			// Insert the new node
			current.setNext(newNode);
		}
	}

}
