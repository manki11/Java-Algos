package topic9_linkedlist;

public class LinkedListAssignment {

	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> fwd = null;

		int count = 0;

		while (curr != null && count < k) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
			count++;
		}
		if (curr != null) {
			head.next = kReverse(curr, k);
		}
		return prev;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> resultHead = null;
		Node<Integer> resultTail = null;
		if (head1.data > head2.data) {
			resultHead = head2;
			resultTail = head2;
			head2 = head2.next;
		} else {
			resultHead = head1;
			resultTail = head1;
			head1 = head1.next;
		}

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {

			} else {

			}
		}

		resultTail.next = head1 == null ? head2 : head1;

		return resultHead;

	}

	public static Node<Integer> mergeSort(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}

		// break this list into 2 list
		Node<Integer> head1 = head;
		Node<Integer> temp = giveMid(head);
		Node<Integer> head2 = temp.next;
		temp.next = null;
		head1 = mergeSort(head1);
		head2 = mergeSort(head2);
		return merge(head1, head2);
	}

}
