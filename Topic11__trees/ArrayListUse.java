package topic11_trees;

import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		ArrayList<Integer> myArrayList = new ArrayList<>();
		myArrayList.add(3);
		for(int i =0;i<10;i++){
			myArrayList.add(i);
		}
		
		for(int i:myArrayList){
			System.out.println(i);
		}
		
		
	}
}
