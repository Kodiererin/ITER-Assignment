package Jan_07;

import java.util.Collections;
import java.util.Comparator;

class Car{
	String name;
	String modelNo;
	Car(String name , String modelNo){
		this.modelNo = modelNo;
		this.name = name;
	}
}

class SortMyCar implements Comparator<Car>
{
	public int compare(Car c1 , Car c2)
	{
		return c1.modelNo.compareTo(c2.modelNo);
	}
}
public class comparator_Car_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Car> obj = new java.util.ArrayList<>();
		obj.add(new Car("Alto","J121"));
		obj.add(new Car("Bolero" ,"M121"));
		obj.add(new Car("WagonR" , "W121"));
		obj.add(new Car("BMW " , "B12123"));		
//		obj.sort(new SortMyCar());
		System.out.println(Collections.binarySearch(obj, new Car("WagonR" , "W121"), new SortMyCar()));
		
		
//		Display the Content in the Descending Order
		Collections.sort(obj,Collections.reverseOrder(new SortMyCar()));
		for(Car s : obj) {
			System.out.println(s.name+"------> "+s.modelNo);
		}
	}

}
