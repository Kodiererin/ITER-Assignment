package Jan14;

class product{
	String productName;
	int productQuantity;
	double productPrice;
	product(String a , int b , double c){
		this.productName = a;
		this.productQuantity = b;
		this.productPrice = c;
	}
	public String toString() {
		return this.productName+" "+this.productPrice+" "+this.productQuantity;
	}
}

class productId{
	int productYear;
	int productDate;
	int productNo;
	productId(int productYear , int productDate , int productNo){
		this.productDate = productDate;
		this.productNo = productNo;
		this.productYear = productYear;
	}
	public String toString() {
		return this.productDate+" "+this.productNo+" "+this.productYear;
	}
}

public class product_LinkedHashmap {
	public static void main(String[] args) {
		java.util.LinkedHashMap<product, productId> obj = new java.util.LinkedHashMap<product, productId>();
		obj.put(new product("Dabur",1,13.0), new productId(27,1212,2001));
		obj.put(new product("Dabur Red Paste",1,13.0), new productId(27,1212,2001));
		obj.put(new product("Pitanjali",1,13.0), new productId(27,1212,2001));
		obj.put(new product("Pen",1,13.0), new productId(27,1212,2001));
		
		for(java.util.Map.Entry<product,productId> m : obj.entrySet()) {
			System.out.println(m.getKey()+"			"+m.getValue());
		}
		
	}
}
