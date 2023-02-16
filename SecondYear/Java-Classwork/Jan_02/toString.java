package Jan_02;

class Number{
	int x ; int y;
	Number(int x , int d){
		this.x = x; this.y = d;
	}
	public int show() {
		return this.x + this.y;
	}
}
public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj = new Number(10,20);
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.show());
	}

}
