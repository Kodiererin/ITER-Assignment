
class MyThread3 extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Question3 {
    public static void main(String[] args) {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
    	MyThread3 myThread = new MyThread3();
        myThread.start();
    }
}
