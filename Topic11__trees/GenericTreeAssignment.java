package topic11_trees;

public class GenericTreeAssignment {

	public static GenericTreeNode<Integer> findSecondLargest(GenericTreeNode<Integer> root) {
		return findSecondLargestHelper(root).second;
	}

	public static Pair<GenericTreeNode<Integer>> findSecondLargestHelper(GenericTreeNode<Integer> root) {

		if (root == null) {
			return new Pair<>(null, null);
		}

		Pair<GenericTreeNode<Integer>> output = new Pair<GenericTreeNode<Integer>>(root, null);
		for (GenericTreeNode<Integer> child : root.children) {

			Pair<GenericTreeNode<Integer>> childPair = findSecondLargestHelper(child);

			if (output.first.data < childPair.first.data) {

				if (output.first.data > childPair.second.data) {
					output.second = output.first;
					output.first = childPair.first;
				} else {
					output.first = childPair.first;
					output.second = childPair.second;
				}

			} else if (output.second.data < childPair.first.data) {
				output.second = childPair.first;
			}

		}
		return output;
	}

	public static GenericTreeNode<Integer> nextGreaterElement(GenericTreeNode<Integer> root, int data) {

		if (root == null) {
			return root;
		}

		GenericTreeNode<Integer> result = null;
		if (root.data > data) {
			result = root;
		}

		for (GenericTreeNode<Integer> child : root.children) {
			GenericTreeNode<Integer> childClosest = nextGreaterElement(child, data);
			if (childClosest != null) {
				if (result==null || childClosest.data < result.data) {
					result = childClosest;
				}
				
			}

		}
		return result;
	}

	public static GenericTreeNode<Integer> maxSumNode(GenericTreeNode<Integer> root){
		return getMaxSumNode(root).node;
	}
	
	private static MaxSumNode<GenericTreeNode<Integer>> getMaxSumNode(GenericTreeNode<Integer> root){
		
		if(root == null){
			MaxSumNode<GenericTreeNode<Integer>> result = new MaxSumNode<>();
			result.node = null;
			result.sum = Integer.MIN_VALUE;
			return result;
		}
		int sum =root.data;
		for(GenericTreeNode<Integer> child: root.children){
			sum = sum+child.data;
		}
		
		MaxSumNode<GenericTreeNode<Integer>> result = new MaxSumNode<>();
		result.node = root;
		result.sum = sum;
		
		for(GenericTreeNode<Integer> child: root.children){
			MaxSumNode<GenericTreeNode<Integer>> childMaxSumNode = getMaxSumNode(child);
			if(childMaxSumNode.sum>result.sum){
				result = childMaxSumNode;
			}
			
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	static class MaxSumNode<T>{
		T node;
		int sum;
	}
	
	
	
	
	
	
	
	
	
	public static boolean isIdentical(GenericTreeNode<Integer> root1, GenericTreeNode<Integer> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null || root2 == null) {
			return false;
		}

		if (!root1.data.equals(root2.data)) {
			return false;
		}

		if (root1.children.size() != root2.children.size()) {
			return false;
		}
		for (int i = 0; i < root1.children.size(); i++) {
			boolean ans = isIdentical(root1.children.get(i), root2.children.get(i));
			if (!ans) {
				return false;
			}
		}
		return true;
	}
}

class Pair<T> {
	T first;
	T second;

	Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
}
