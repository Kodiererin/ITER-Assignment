package Nov22;
//	Write a program that reads a integer number from users. Find its frequency of each digit.

public class Frequency_01 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Integer x = sc.nextInt();
		String m = x.toString();
		char[] obj = new char[m.length()];
		for(int i=0 ; i<obj.length ; i++)
		{
			obj[i] = m.charAt(i);
		}
		
		java.util.Arrays.sort(obj);
		
//		while((int)arr3.charAt(i)!=47)
		
		int i=0;
		while(i<obj.length)
		{
			int ctr=0;
			int j=i;
			while(j<obj.length)
			{
				if(obj[i]==obj[j])
				{
					ctr++;
					j++;
				}
				else
				{
					System.out.println(obj[i]+"-->"+ctr);
					ctr=0;					
				}				
			}
			i++;
		}
		
	}
}
