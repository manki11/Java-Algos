package topic8_oops;

public class Box {

	int length;
	int height;
	int depth;
	
	Box(){
		length=2;
		height = 3;
		depth = 4;
	}
	
	Box(int length, int depth, int h){
		this.length = length;
		height = h;
		this.depth = depth;
	}
	
	
	
	public static void main(String[] args) {
		Box b = new Box(10,20,30);
		System.out.println(b.depth);
		System.out.println(b.height);
		System.out.println(b.length);
		
				
	}
	
	
	
	
	
	
	Box(int l, int d){
		length = l;
		depth = d;
		//height = 0;
	}
	
	Box(Box b){
		length=b.length;
		height = b.height;
		depth = b.depth;
	}
	
	
	
	
	
	
	
	
	
	
	int volume(){
		return length*height*depth;
	}
	
	void setDimension(int h, int d, int l){
		
	}
	
//	int area(){
//		return 
//	}
}
