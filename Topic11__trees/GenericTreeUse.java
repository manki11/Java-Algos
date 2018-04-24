package topic11_trees;

import java.util.Scanner;

import topic10_stackandqueues.queues.QueueUnderFlowException;
import topic10_stackandqueues.queues.QueueUsingLinkedList;

public class GenericTreeUse {
	private static Scanner s = new Scanner(System.in);

	public static GenericTreeNode<Integer> constructTreeR() {
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		GenericTreeNode<Integer> root = new GenericTreeNode<>(rootData);
		System.out.println("Number of children of " + rootData);
		int noOfChildren = s.nextInt();
		for (int i = 0; i < noOfChildren; i++) {
			GenericTreeNode<Integer> child = constructTreeR();
			root.children.add(child);
		}
		return root;
	}

	public static void printFormatedGenericTree(GenericTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + " : ";
		for (int i = 0; i < root.children.size(); i++) {
			toBePrinted = toBePrinted + root.children.get(i).data + " , ";
		}
		System.out.println(toBePrinted);
		for (int i = 0; i < root.children.size(); i++) {
			printFormatedGenericTree(root.children.get(i));
		}
	}

	public static void printGenericTree(GenericTreeNode<Integer> root) {
		
		System.out.println(root.data);
		for (int i = 0; i < root.children.size(); i++) {
			printGenericTree(root.children.get(i));
		}
	}

	public static int count(GenericTreeNode<Integer> root) {

		int totalCount = 0;

		for (int i = 0; i < root.children.size(); i++) {
			totalCount = totalCount + count(root.children.get(i));
		}
		return totalCount + 1;
	}

	public static int height(GenericTreeNode<Integer> root) {

		// int maxHeight = Integer.MIN_VALUE;
		int maxHeight = 0;

		for (int i = 0; i < root.children.size(); i++) {
			int currentHeight = height(root.children.get(i));
			if (maxHeight < currentHeight) {
				maxHeight = currentHeight;
			}
		}
		return maxHeight + 1;
	}

	public static int heightUsingQueue(GenericTreeNode<Integer> root) throws QueueUnderFlowException {
		QueueUsingLinkedList<GenericTreeNode<Integer>> queue = new QueueUsingLinkedList<>();
		queue.enqueue(root);

		int level = 0;
		while (!queue.isEmpty()) {
			GenericTreeNode<Integer> currentNode = queue.dequeue();

			System.out.println(currentN);
			for (int i = 0; i < currentNode.children.size(); i++) {
				if (i == 0) {
					level++;
				}
				queue.enqueue(currentNode.children.get(i));
			}
		}
		return level;
	}

	// 1 3 2 2 5 0 6 0 3 0 4 1 20 1 30 1 40 1 50 0

	public static void main(String[] args) throws QueueUnderFlowException {
		GenericTreeNode<Integer> root = constructTreeR();
		// printGenericTree(root);
		// printFormatedGenericTree(root);
		System.out.println(heightUsingQueue(root));
	}

}
