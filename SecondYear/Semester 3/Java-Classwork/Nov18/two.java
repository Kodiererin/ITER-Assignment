package Nov18;
//Write a program a array class having member an integer array and method to access the array.



class MyArray
{
	private int a[];
	static private int max;
	public void getA() {
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
	public void setA() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]= sc.nextInt();
		}
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
}
public class two 
{
	public static void main(String[] args) 
	{
		MyArray obj = new MyArray();
		obj.setMax(10);
		obj.setA();
		obj.getA();
	}
}
