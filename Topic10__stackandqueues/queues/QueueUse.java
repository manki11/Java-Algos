package topic10_stackandqueues.queues;

public class QueueUse {
	public static void main(String[] args) throws QueueOverFlow, QueueUnderFlowException {
		QueueUsingArray queue = new QueueUsingArray(10);
		
		for(int i =0;i<10;i++){
			queue.enqueue(i);
		}
		
		for(int i =0;i<10;i++){
			System.out.println(queue.dequeue());
		}
	}
}
