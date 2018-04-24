package topic_15Heap;

public class HeapUse {

	public static void main(String[] args) throws HeapFullException, HeapEmptyException {
		MaxHeap<Integer> ds = new MaxHeap<>();
		
		ds.insert(2, 2);
		ds.insert(5, 5);
		ds.insert(20, 20);
		ds.insert(0, 0);
		ds.insert(200, 200);
		ds.insert(56, 56);
		ds.printHeapArray();
		
		System.out.println(ds.getHighestPriority());
		
		ds.removeHighestPriority();
		ds.printHeapArray();
		System.out.println(ds.getHighestPriority());
		
		
		
		
		
//		MinHeap<Integer>  ds1 = new MinHeap<>();
//		ds1.insert(3, 3);
		
	}
}
