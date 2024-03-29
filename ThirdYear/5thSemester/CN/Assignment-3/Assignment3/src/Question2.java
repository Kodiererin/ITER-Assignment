
class MyThread2 extends Thread {
    private int result;

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        result = sum;
    }

    public int getResult() {
        return result;
    }
}

public class Question2 {
    public static void main(String[] args) {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
    	MyThread2 t = new MyThread2();
        t.start();

        try {
            t.join(); 
        } catch (Exception e) {
            System.out.println(e);
        }

        int threadResult = t.getResult();
        System.out.println("Thread result: " + threadResult);
    }
}
