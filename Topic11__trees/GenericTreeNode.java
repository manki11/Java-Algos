package topic11_trees;

import java.util.ArrayList;

public class GenericTreeNode<T> {
	T data;
	ArrayList<GenericTreeNode<T>> children;
	
	GenericTreeNode(T data){
		this.data = data;
		children = new ArrayList<>();
	}
	
}
