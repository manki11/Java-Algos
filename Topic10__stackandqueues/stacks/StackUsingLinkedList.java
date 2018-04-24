package topic10_stackandqueues.stacks;

public class StackUsingLinkedList<T> {

	LinkedListNode<T> top;
	private int size;
	StackUsingLinkedList(){
		size = 0;
	}
	
	public void push(T data){
		LinkedListNode<T> nyaNode = new LinkedListNode<>(data);
		nyaNode.next = top;
		top= nyaNode;
	}
	
	public T pop() throws StackUnderFlow{
		if(top==null){
			throw new StackUnderFlow();
		}
		T temp = top.data;
		top = top.next;
		return temp;
	}
	
	public T top() throws StackUnderFlow{
		if(top==null){
			throw new StackUnderFlow();
		}
		return top.data;
	}
	public boolean isEmpty(){
		return size()==0 ? true: false;
	}
	
	public int size(){
		return size;
	}
}
