package a_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class b_ShowTime_IO_Buffer {
	public static void main(String[] args)throws Exception  {
		float start = System.nanoTime();
		FileReader bfr = new FileReader("myFile.txt");
		ArrayList<Character> list = new ArrayList<Character>();
		int i=bfr.read();
		while((i=bfr.read())!=-1)    
		{
			System.out.print((char)i);    
		}
         i=bfr.read();
          int j=0;
          boolean m = true;
          while((i=bfr.read())!=-1) {
        	  if((char)i!=list .get(j)) {
        		  System.out.println(false);
        		  m = false;
        		  break;
        	  }
          }   
	    bfr.close(); 
	    float end = System.nanoTime();
	    System.out.println("\nCurrent Time difference "+(end-start));
	}
}
