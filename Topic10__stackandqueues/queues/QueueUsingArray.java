package topic10_stackandqueues.queues;

public class QueueUsingArray {

	int elementArray[];
	int front;
	int rear;
	int size;

	QueueUsingArray(int size) {
		elementArray = new int[size];
		front = -1;
		rear = -1;
		size = 0;
	}

	public void enqueue(int data) throws QueueOverFlow{
		if(size()==0){
			front++;
		}
		if(size()==elementArray.length){
			throw new QueueOverFlow();
		}
		rear = (rear+1)%elementArray.length;
		elementArray[rear] = data;
		size++;
		
	}

	public int dequeue() throws QueueUnderFlowException{
		if(size==0){
			throw new QueueUnderFlowException();
		}
		int temp = elementArray[front];
		
		front = (front+1)%elementArray.length;
		size--;
		
		if(size==0){
			front =-1;
			rear =-1;
		}
		return temp;
	}
	
	
	
	

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

//	getFront(){
//		
//	}
//
//	getRear(){
//		
//	}

}
