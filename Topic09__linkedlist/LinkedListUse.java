package topic9_linkedlist;

import java.util.Scanner;

public class LinkedListUse {

	public static void printList1(Node<Integer> head) {
		if (head == null) {
			return;
		}
		printList1(head.next);
		System.out.println(head.data);
	}



	public static Node<Integer> revereseList_I(Node<Integer> head) {
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> fwd = null;

		while (curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;

		}
		return prev;
	}

	public static Node<Integer> reverseList_R(Node<Integer> head) {
		if (head.next == null) {
			return head;
		}
		Node<Integer> finalHead = reverseList_R(head.next);
		head.next.next = head;
		head.next = null;

		return finalHead;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {

	}

	public static int searchIndex(Node<Integer> head, int element) {

		if (head == null) {
			return -1;
		}
		if (head.data == element) {
			return 0;
		}
		int smallResult = searchIndex(head.next, element);
		if (smallResult == -1) {
			return -1;
		} else {
			return smallResult + 1;
		}
	}

	public static Node<Integer> prepareLinkedList() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();

		while (data != -1) {
			Node<Integer> nyaNode = new Node<Integer>(data);
			// nyaNode.data = data;

			if (head == null) {
				head = nyaNode;
				tail = nyaNode;
			} else {

				// Node temp = head;
				// while (temp.next != null) {
				// temp = temp.next;
				// }
				// temp.next = nyaNode;
				tail.next = nyaNode;
				tail = tail.next;
			}

			System.out.println("Enter data");
			data = s.nextInt();
		}
		return head;
	}

	public static void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		// temp = head;
		// while(temp!=null){
		// System.out.println(temp.data);
		// temp = temp.next;
		// }
	}

	// public static void insertAtIthR(Node<Integer> head, int pos, int data) {
	// if (pos == 1) {
	// Node<Integer> nyaNode = new Node<Integer>(data);
	// nyaNode.next = head.next;
	// head.next = nyaNode;
	// return;
	// }
	//
	// insertAtIthR(head.next, pos - 1, data);
	// }
	//
	// public static Node<Integer> insertAtIthR2(Node<Integer> head, int pos,
	// int data) {
	// if (pos == 1) {
	// Node<Integer> nyaNode = new Node<Integer>(data);
	// nyaNode.next = head.next;
	// head.next = nyaNode;
	// return head;
	// }
	// head.next = insertAtIthR2(head.next, pos - 1, data);
	// return head;
	// }

	public static Node<Integer> insertAtIthR3(Node<Integer> head, int pos, int data) {
		if (pos == 1) {
			Node<Integer> nyaNode = new Node<Integer>(data);
			nyaNode.next = head;
			return nyaNode;
		}
		head.next = insertAtIthR3(head.next, pos - 1, data);
		return head;
	}

	public static Node<Integer> deleteAtIthR(Node<Integer> head, int pos, int data) {
		if (pos == 1) {
			return head.next;
		}
		head.next = deleteAtIthR(head.next, pos - 1, data);
		return head;
	}

	public static Node<Integer> insertAtIth(Node<Integer> head, int pos, int data) {
		Node<Integer> nyaNode = new Node<>(data);
		if (pos == 1) {

			nyaNode.next = head;
			head = nyaNode;
		} else {
			Node<Integer> temp = head;
			int count = 1;
			while (count < pos - 1) {
				temp = temp.next;
				count++;
			}
			nyaNode.next = temp.next;
			temp.next = nyaNode;
		}
		return head;
	}

	public static void main(String[] args) {
		// Node head1 = prepareLinkedList();
		// printList(head1);

		Node<Integer> head = new Node<>(10);
		head.next = new Node<>(20);
		head.next.next = new Node<>(30);
		head.next.next.next = new Node<>(40);
		head.next.next.next.next = new Node<>(50);
		head.next.next.next.next.next = new Node<>(60);

		printList(head);
		head = reverseList_R(head);

		System.out.println();
		printList(head);

		// System.out.println(head.next.next.next.data);

	}
}
