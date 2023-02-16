package Jan20;

import java.util.Collections;

//WAP to create a class Product having product id and product name.
//Create an array list of product and sort it in ascending order according to product id.
class Product{
	int id;
	String name;
	Product(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
public class L_lambdaFunction_ArrayList {
	public static void main(String[] args) {
		java.util.ArrayList<Product> p = new java.util.ArrayList<>();
		p.add(new Product(1,"Product 1"));
		p.add(new Product(3,"Product 3"));
		p.add(new Product(6,"Product 6"));
		p.add(new Product(7,"Product 7"));
		p.add(new Product(12,"Product 12"));
		p.add(new Product(8,"Product 8"));
		p.add(new Product(4,"Product 4"));
		
//		Before Sorting
		for(Product op : p) {
			System.out.println(op.id+"		"+op.name);
		}
		
//		After Sorting
		Collections.sort(p, (p1,p2)->{
			if(p1.id>p2.id) {return -1;}
			else if(p1.id<p2.id) {return 1;}
			else {return 0;}
		});
		System.out.println("=================================");
		for(Product op : p) {
			System.out.println(op.id+"		"+op.name);
		}
	}
}	
