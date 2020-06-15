package SinglyLinkedList;

public  class LinkedList {
	
	public LinkedList() {
		length = 0;
	}
	ListNode head;
	int length = 0;
	
	public synchronized ListNode getHead() {
		return head;
	}
	
	public synchronized void insertAtBegin(ListNode node) {
		node.next = head;
		head = node;
		length++;
	}
	
	public synchronized void insertAtEnd(ListNode node) {
		if(head == null)
			head = node;
		else {
			ListNode p,q;
			for(p = head;(q=p.next) != null;p = q);
				
			p.next = node;
			
			length++;
		}
	}
	
	public void insert(int data, int position) {
		if(position < 0) {
			position = 0;
		}
		if(position > length)
			position = length;
		if(head == null) {
			head = new ListNode(data);
		} else if(position == 0) {
			ListNode temp = new ListNode(data);
			temp.next = head;
			head = temp;
		}
		else {
			ListNode temp = head;
			for(int i=1;i<position;i++) {
				temp = temp.next;
			}
			ListNode newNode = new ListNode(data);
			newNode.next = temp.next;
			temp.next = newNode;
		}
		length += 1;
	}
	
	public synchronized ListNode removeAtBegin() {
		ListNode node = head;
		if(head != null) {
			head = node.next;
			node.next = null;
			length -=1;
		}
		return node;
	}
	
	public synchronized ListNode removeFromEnd() {
		if(head == null)
			return null;
		
		ListNode p = head, q = null, next = head.next;
		
		if(next == null)
		{	head = null;
			return p;
		}
		while((next = p.next) != null) {
			q = p;
			p = next;
		}
		q.next = null;
		length -=1;
		return p;
	}
	
	public synchronized void removeMatched(ListNode node) {
		if(head == null)
			return;
		
		if(node.equals(head))
		{	head = head.next;
			return;
		}
		
		ListNode p = head, q = null;
		
		while((q = p.next) != null) {
			if(node.equals(q)) {
				p.next = q.next;
				return;
			}
			p = q;
		}
		length -= 1;
	}
	
	public void remove(int position) {
		if(position < 0)
			position = 0;
		if(position >= length)
			position = length - 1;
		
		if(head == null)
			return;
		
		if(position == 0)
			head = head.next;
		else {
			ListNode temp = head;
			for(int i=1;i<position-1;i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		length -=1;
	}

	@Override
	public String toString() {
		String result = "[";
		if(head == null)
			return result + "]";
		result += head.data;
		ListNode temp = head.next;
		
		while(temp!= null) {
			result +=  "," + temp.data;
			temp = temp.next;
		}
		
		return result + "]";
	}
	
	public int length() {
		return length;
	}
	
	public int getPosition(int data) {
		ListNode temp = head;
		int pos = 0;
		
		while(temp != null) {
			if(temp.data == data) {
				return pos;
			}
			pos += 1;
			temp = temp.next;
		}
		
			return Integer.MIN_VALUE;
	}
	
	public void clearList() {
		head = null;
		length = 0;
	}

}
