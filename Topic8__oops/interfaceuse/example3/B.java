package topic8_oops.interfaceuse.example3;

interface B extends A {
	void meth3();
}


abstract class Test1 implements B{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract void meth3() ;
	
}