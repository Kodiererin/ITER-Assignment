package Test_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WithBufferedReader {
	public static void main(String[] args) {
		 String filepath = "myFile.txt";
		    long startTime = System.nanoTime();
		    try(InputStream inputStrem = new BufferedInputStream(new FileInputStream(filepath)))
		    {
		        int byteRead;
		        byte[] buffer = new byte[1024];
		        while((byteRead=inputStrem.read(buffer))!=-1)
		        {
		        	
		        }
		    }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }

	        long endTime= System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Duration = "+duration);
	}
}
