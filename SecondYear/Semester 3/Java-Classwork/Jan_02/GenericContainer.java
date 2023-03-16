package Jan_02;
// Write a Class having a member variable to store any type of data

class  Data<T>
{
	T data;
	Data(T data)	
	{this.data = data;}
	public void showClass()
	{
		System.out.println(data.getClass());
	}
}
public class GenericContainer {
	public static void main(String[] args) {
		Data<Integer> obj = new Data<Integer>(10);
		obj.showClass();
		Data<String> obj2 = new Data<String>("ujjwal");
		obj2.showClass();
		Data<Double> obj3 = new Data<Double>(1.222322);
		obj3.showClass();
		Data<Float> obj4 = new Data<>(1.2f);			// Highest Data-type is Being Considered.
		obj4.showClass();
		Data<Integer> obj5 = new Data<Integer>(101);
		obj5.showClass();
	}
}
