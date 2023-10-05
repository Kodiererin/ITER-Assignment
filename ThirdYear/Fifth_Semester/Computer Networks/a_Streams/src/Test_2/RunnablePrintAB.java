package Test_2;

public class RunnablePrintAB {
	public static void main(String[] args) {
		A a = new A();
		Thread aT = new Thread(a);
		aT.start();
		B b = new B();
		Thread bT = new Thread(a);
		bT.start();
		
	}
}

class A implements Runnable{

	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++) {
	    	System.out.print("A ");
	    }
		
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		 for(int i=0 ; i<5 ; i++) {
		    	System.out.print("B ");
		    }		
	}
	
}

