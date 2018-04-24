package topic_12binarytree;

import java.util.Scanner;

import topic10_stackandqueues.queues.QueueUnderFlowException;
import topic10_stackandqueues.queues.QueueUsingLinkedList;

public class BinaryTreeUse {

	private static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput_R() {
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData != -1) {
			BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
			root.left = takeInput_R();
			root.right = takeInput_R();
			return root;
		}
		return null;
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		printTree(root.left);
		System.out.print(root.data + " ");
		printTree(root.right);

	}

	public static BinaryTreeNode<Integer> takeInput_LevelWise() throws QueueUnderFlowException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		QueueUsingLinkedList<BinaryTreeNode<Integer>> queue = new QueueUsingLinkedList<>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();
			System.out.println("Enter left child: ");
			int leftChildData = s.nextInt();
			if (leftChildData != -1) {
				currentNode.left = new BinaryTreeNode<>(leftChildData);
				queue.enqueue(currentNode.left);
			}

			System.out.println("Enter right child: ");
			int rightChildData = s.nextInt();

			if (rightChildData != -1) {
				currentNode.right = new BinaryTreeNode<>(rightChildData);
				queue.enqueue(currentNode.right);
			}

		}
		return root;
	}

	public static int height(BinaryTreeNode<Integer> root) {
		return root == null ? 0 : Math.max(height(root.left), height(root.right)) + 1;
	}

	public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, Integer data) {
		if (root == null) {
			return null;
		}
		if (root.data.equals(data)) {
			return root;
		}
		BinaryTreeNode<Integer> result = search(root.left, data);
		if (result == null) {
			result = search(root.right, data);
		}
		return result;
	}

	public static void mirror(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}

	
	
	
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		int x = height(root.left) + height(root.right) + 1;

		return Math.max(Math.max(leftDiameter, rightDiameter), x);
	}

	public static int diameter2(BinaryTreeNode<Integer> root) {
		DiameterReturnType ans = diameterBetter(root);
		return ans.diameter;
	}

	private static DiameterReturnType diameterBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new DiameterReturnType();
		}

		DiameterReturnType leftDiameter = diameterBetter(root.left);
		DiameterReturnType rightDiameter = diameterBetter(root.right);

		DiameterReturnType result = new DiameterReturnType();
		result.height = Math.max(leftDiameter.height, rightDiameter.height) + 1;
		result.diameter = Math.max(Math.max(leftDiameter.diameter, rightDiameter.diameter),
				leftDiameter.height + rightDiameter.height + 1);

		return result;

	}

	public static boolean checkBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}

		boolean ansLeft = checkBST(root.left);
		if (!ansLeft) {
			return false;
		}

		boolean ansRight = checkBST(root.right);
		if (!ansRight) {
			return false;
		}

		int maxLeft = maxInBST(root.left);
		int minRight = minInBST(root.right);

		if (maxLeft < root.data && minRight > root.data) {
			return true;
		}
		return false;
	}

	public static BSTCheck checkBSTBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			BSTCheck result = new BSTCheck();
			result.isBST = true;
			result.max = Integer.MIN_VALUE;
			result.min = Integer.MAX_VALUE;
			return result;
		}
		BSTCheck ansLeft = checkBSTBetter(root.left);
		BSTCheck ansRight = checkBSTBetter(root.right);
		BSTCheck result = new BSTCheck();
		if (ansLeft.isBST == true && ansRight.isBST == true && root.data > ansLeft.max && root.data < ansRight.min) {
			result.isBST = true;
			result.max = Math.max(root.data, ansRight.max);
			result.min = Math.min(root.data, ansLeft.min);
		} else {
			result.isBST = false;
			result.max = Math.max(Math.max(ansLeft.max, ansRight.max), root.data);
			result.min = Math.min(Math.min(ansLeft.min, ansRight.min), root.data);
			;
		}
		return result;
	}

	public static BinaryTreeNode<Integer> sortedArrayToBST(int input[]) {
		return sortedArrayToBST(input, 0, input.length - 1);
	}

	private static BinaryTreeNode<Integer> sortedArrayToBST(int input[], int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(input[mid]);
		root.left = sortedArrayToBST(input, start, mid - 1);
		root.right = sortedArrayToBST(input, mid + 1, end);
		return root;
	}

	private static int maxInBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		if (root.right == null) {
			return root.data;
		}
		return maxInBST(root.right);
	}

	private static int minInBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		if (root.left == null) {
			return root.data;
		}
		return minInBST(root.left);
	}

	public static BinaryTreeNode<Integer> constructTreeUsingInOrderPreOrder(int in[], int pre[]) {
		return constructTree(in, pre, 0, in.length - 1);
	}

	static int preOrderIndex = 0;

	private static BinaryTreeNode<Integer> constructTree(int in[], int pre[], int inStart, int inEnd) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preOrderIndex++]);
		if (inStart == inEnd) {
			return root;
		}
		int index = searchIndex(in, inStart, inEnd, root.data);

		root.left = constructTree(in, pre, inStart, index - 1);
		root.right = constructTree(in, pre, index + 1, inEnd);
		return root;
	}

	private static int searchIndex(int[] in, int start, int end, int data) {
		int i;
		for (i = start; i <= end; i++) {
			if (in[i] == data) {
				break;
			}
		}
		return i;
	}

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}
		if (root.data > data) {
			return searchInBST(root.left, data);
		} else {
			return searchInBST(root.right, data);
		}

	}

	// 8 3 1 -1 -1 6 4 -1 -1 7 -1 -1 10 -1 14 13 -1 -1 -1
	public static void main(String[] args) throws QueueUnderFlowException {
		// BinaryTreeNode<Integer> root = takeInput_R();
		// printTree(root);
		//
		// BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(10);
		// root1.left = new BinaryTreeNode<>(20);
		// root1.right = new BinaryTreeNode<>(30);
		// root1.left.left = new BinaryTreeNode<>(40);
		// root1.left.right = new BinaryTreeNode<>(50);
		// root1.right.left = new BinaryTreeNode<>(60);
		// root1.right.right = new BinaryTreeNode<>(70);

		// int in[] = { 4, 2, 5, 1, 6, 3, 7 };
		// int pre[] = { 1, 2, 4, 5, 3, 6, 7 };
		// BinaryTreeNode<Integer> treeRoot =
		// constructTreeUsingInOrderPreOrder(in, pre);
		// printTree(treeRoot);
		// BinaryTreeNode<Integer> root = takeInput_R();
		// // System.out.println(maxInBST(root));
		// boolean result = checkBST(root);
		// System.out.println(result);

		int arr[] = { 1, 3, 4, 6, 7, 8, 10, 13, 14 };
		BinaryTreeNode<Integer> root = sortedArrayToBST(arr);
		printTree(root);

	}

}

class DiameterReturnType {
	int diameter;
	int height;
}

class BSTCheck {
	boolean isBST;
	int min;
	int max;
}
