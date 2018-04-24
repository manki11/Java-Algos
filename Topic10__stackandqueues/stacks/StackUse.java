package topic10_stackandqueues.stacks;

public class StackUse {
	
	public static boolean isBalanced(String input){
		
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			
			if(ch=='{' || ch =='['|| ch == '('){
				
			}
			if(ch==')'){
				
			}
			if(ch==']'){
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws StackOverFlow, StackUnderFlow {
		StackUsingArray st = new StackUsingArray();
		for (int i = 0; i < 20; i++) {
			st.push(i);
		}

	//	st.dataArray[1] = 10;
		//st.top = 0;
//		for (int i = 0; i < 20; i++) {
//			System.out.println(st.pop());
//		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
	}
}
