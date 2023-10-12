package Test_2;

interface ResultCallback{
	void onResult(String result);
}
class workerThread extends Thread{
	private ResultCallback callback;
public workerThread(ResultCallback callback) {
	this.callback = callback;
}
public void run() {
	try {
		Thread.sleep(200);;
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	String result="Thread result data";
	callback.onResult(result);
 }
}
public class lab2obj4 {

	public static void main(String[] args) 
	{
		ResultCallback callback = result->{
			System.out.println("Received result in the main thread: "+result);
		};
		
		workerThread workerThread = new workerThread(callback);
		workerThread.start();
		
		try {
			workerThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.print("Main thread continues executing.");
	}
}