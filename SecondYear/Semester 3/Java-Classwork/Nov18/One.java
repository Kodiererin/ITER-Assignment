package Nov18;
//	Write a program to create a number object having member to store a integer number and method to access that members.

class Number
{
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
public class One 
{
	public static void main(String[] args) 
	{
		Number obj = new Number();
		obj.setX(10);
		System.out.println(obj.getX());
	}
}

