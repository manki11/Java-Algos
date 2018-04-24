package topic10_stackandqueues.stacks;

public class StackUsingArray {
	private int dataArray[];
	private int top;

	StackUsingArray(int size) {
		dataArray = new int[size];
		top = -1;
	}

	StackUsingArray() {
		dataArray = new int[2];
		top = -1;
	}

	private void doubleCapacity() {
		System.out.println("Capacity increases...");
		int temp[] = new int[dataArray.length * 2];

		for (int i = 0; i < dataArray.length; i++) {
			temp[i] = dataArray[i];
		}
		dataArray = temp;
	}

	public void push(int data) throws StackOverFlow {

		if (size() == dataArray.length) {
			// // StackOverFlow e = new StackOverFlow();
			// // throw e;
			// throw new StackOverFlow();
			doubleCapacity();

		}
		top++;
		dataArray[top] = data;
		System.out.println("Push "+data);
	}

	public int pop() throws StackUnderFlow {
		if (size() == 0) {
			throw new StackUnderFlow();
		}

		int temp = dataArray[top];
		top--;
		return temp;
	}

	public int top() throws StackUnderFlow {
		if (size() == 0) {
			throw new StackUnderFlow();
		}
		return dataArray[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	void show() {

	}
}
