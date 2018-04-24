package topic_15Heap;

public class HeapNode<V> {
	int priority;
	V value;
	
	HeapNode(V value, int priority){
		this.value = value;
		this.priority= priority;
	}
}
