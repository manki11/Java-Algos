package topic10_stackandqueues.queues;

public class QueueUsingLinkedList<T> {

	LinkedListNode<T> front;
	LinkedListNode<T> rear;
	int size;

	public QueueUsingLinkedList() {
		size = 0;
	}

	public void enqueue(T data) {
		LinkedListNode<T> nyaNode = new LinkedListNode<>(data);
		if (rear == null) {
			front = nyaNode;
			rear = nyaNode;
		} else {
			rear.next = nyaNode;
			rear = nyaNode;
		}
		size++;
	}

	public T dequeue() throws QueueUnderFlowException {
		if(front==null){
			throw new QueueUnderFlowException();
		}
		LinkedListNode<T> temp = front;
		front = front.next;
		if(front ==null){
			rear = null;
		}
		size--;
		return temp.data;
		
	}

	int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

}
