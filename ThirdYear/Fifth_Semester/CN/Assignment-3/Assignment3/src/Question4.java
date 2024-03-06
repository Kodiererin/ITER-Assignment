class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Question4 {
    public static void main(String[] args) {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}
