package topic_15Heap;

import java.util.ArrayList;

public abstract class Heap<V> {
	int maxSize = 10000;
	private ArrayList<HeapNode<V>> heap;
	private int count;
	public Heap() {
		heap = new ArrayList<>();
		count=0;
	}
	public void swap(int index1, int index2){
		HeapNode<V> temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}
	public void printHeapArray() {
		for (int i = 0; i < count; i++) {
			System.out.print(heap.get(i).value + ", ");
		}
		System.out.println();
	}
	public int getParentIndex(int index) {
		if (index < 0 || index > count) {
			return -1;
		}
		return (index - 1) / 2;
	}
	public int getLeftChildIndex(int index) {
		int leftChildIndex = 2 * index + 1;
		if (leftChildIndex >= count) {
			return -1;
		}
		return leftChildIndex;
	}
	public int getRightChildIndex(int index) {
		int rightChildIndex = 2 * index + 2;
		if (rightChildIndex >= count) {
			return -1;
		}
		return rightChildIndex;
	}
	public V getHighestPriority() throws HeapEmptyException {
		if (count == 0) {
			throw new HeapEmptyException();
		}
		return heap.get(0).value;
	}
	public void insert(int priority, V value) throws HeapFullException {
		if(count>maxSize){
			throw new HeapFullException();
		}
		HeapNode<V> node = new HeapNode<>(value,priority);
		heap.add(node);
		shiftUp(count);
		count++;
	}
	
	abstract void shiftUp(int index) ;
	abstract void shiftDown(int index);
	
	public V removeHighestPriority() throws HeapEmptyException {
		V min = getHighestPriority();
		heap.set(0, heap.get(count - 1));
		heap.remove(heap.size() - 1);
		count--;
		shiftDown(0);
		return min;	
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public HeapNode<V> getElementAtIndex(int index) {
		return heap.get(index);
	}
}




class HeapFullException extends Exception {
}

class HeapEmptyException extends Exception {
}
