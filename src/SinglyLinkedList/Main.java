package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		ListNode l10 = new ListNode(10);
		
		LinkedList newLL = new LinkedList();
		newLL.insertAtBegin(l1);
		newLL.insertAtEnd(l2);
		newLL.insert(4, 2);
		
		System.out.println(newLL);

	}

}
