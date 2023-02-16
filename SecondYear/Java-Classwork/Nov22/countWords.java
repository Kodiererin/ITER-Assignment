package Nov22;

import java.io.InputStreamReader;

public class countWords 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter Input");
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String m = br.readLine();
		System.out.println(m);
		
		int ctr=0;
		for(int i=0 ; i<m.length()-1 ; i++)
		{
			if((int)m.charAt(i)==32 && (int)m.charAt(i+1)!=32)
			{
				ctr++;
			}
		}
		ctr+=1;
		System.out.println("The Number of Words "+ctr);
	}
}
