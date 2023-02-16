package Dec14;
//	Write a program to create a shape class having  member functions to defined area and find perimeters.
//	Create an other classes Rectangle , Circle and Having required member over-write the member function of shape class to find area and perimeter 
//	of respective classes.
//	Create the object of Rectangle and Circle  class annd find its area and perimeter.

abstract class Shape
{
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shape
{
	int x; int y;
	Rectangle(int x , int y)
	{this.x = x ; this.y = y;;}
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("The Area of Rectangle "+(x*y));
	}

	@Override
	void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("The Perimeter of the Rectangle "+(2*x + 2*y));
	}
	
}
class Square extends Shape
{
	int x;
	Square(int x)
	{this.x = x;}
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("The Area of The Square "+(x*x));
	}
	@Override
	void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("The Perimeter of the Square "+(4*x));
	}
	
}
class circle extends Shape
{
	int radius;
	circle(int radius)
	{this.radius = radius;}
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("The Area of Circle "+(2*3.14*this.radius*this.radius));
	}
	void perimeter()
	{System.out.println("The Perimeter of Circle "+(2*3.14*this.radius));}
	
}
public class findArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10,20);
		obj.area();
		obj.perimeter();
		
		Square obj2 = new Square(10);
		obj2.perimeter();
		obj2.area();
		
		circle obj3 = new circle(20);
		obj3.area();
		obj3.perimeter();
	}

}
