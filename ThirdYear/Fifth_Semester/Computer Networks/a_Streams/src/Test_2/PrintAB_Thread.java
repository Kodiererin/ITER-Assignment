package Test_2;

public class PrintAB_Thread {
	public static void main(String[] args) {
		PrintA pa = new PrintA();
		PrintB pb = new PrintB();
		
		pa.start();
		pb.start();
	}
}

class PrintA extends Thread{
	 public void run() {
		    for(int i=0 ; i<5 ; i++) {
		    	System.out.print("A ");
		    }
		  }
}

class PrintB extends Thread{
	 public void run() {
		 for(int i=0 ; i<5 ; i++) {
		    	System.out.print("B ");
		    }
		  }
}
