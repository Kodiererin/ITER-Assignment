//WAP to create a class named it as product having members name of the product and price of the product.
//Create a Hashset of Products Inseret some elements into it and search a Particular elemenr into the Hashset.


package Jan11;

class Product {
	String product;
	int price;
	Product(String product , int price){
		this.price = price;
		this.product = product;
	}
	public boolean equals(Object obj) {
		Product p = (Product)obj;
		if(this == obj) {
			return true;
		}
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		return (p.product.equals(this.product) && p.price == this.price);
	}
	public int hashCode() {
		return this.price;
	}
	public String toString() {
		return this.product+" "+this.price;
	}
}
public class hashset_Product {
	public static void main(String[] args) {
		java.util.HashSet<Product> obj = new java.util.HashSet<>();
		obj.add(new Product("Banana",20));
		obj.add(new Product("Banana",20));
		obj.add(new Product("Banana",20));
		obj.add(new Product("Apple",21));
		obj.add(new Product("Guava",23));
		
		System.out.println(obj.contains(new Product("Apple",21)));
		
//		System.out.println(obj.hashCode());
		
		
		for(Product p : obj) {
			System.out.println(p);
		}
	}
}//	Write a Program to create a class Named it as Fruit having name of the fruit and color of the fruit.
//Create a Linked hashset and insert some fruit Object into it and search a particular fruit object acc. to name using Binary search
