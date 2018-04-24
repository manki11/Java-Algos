package topic_15Heap;

public class MaxHeap<V> extends Heap<V> {

	@Override
	void shiftUp(int index) {
		int parentIndex = getParentIndex(index);
		if (parentIndex != -1 && getElementAtIndex(parentIndex).priority < getElementAtIndex(index).priority) {
			swap(parentIndex, index);
			shiftUp(parentIndex);
		}
	}

	@Override
	void shiftDown(int index) {
		int leftIndex = getLeftChildIndex(index);
		int rightIndex = getRightChildIndex(index);

		int largerPriorityIndex = -1;
		if (leftIndex != -1 && rightIndex != -1) {
			largerPriorityIndex = getElementAtIndex(leftIndex).priority > getElementAtIndex(rightIndex).priority
					? leftIndex : rightIndex;
		} else if (leftIndex == -1) {
			largerPriorityIndex = rightIndex;
		} else if (rightIndex == -1) {
			largerPriorityIndex = leftIndex;
		}
		if (largerPriorityIndex == -1) {
			return;
		}
		if (getElementAtIndex(largerPriorityIndex).priority > getElementAtIndex(index).priority) {
			swap(largerPriorityIndex, index);
			shiftDown(largerPriorityIndex);
		}
	}
}
