package Dec14;

interface Vehicle {
	int m = 10;
	public static final int n = 101;

	public void speed();

	public static void gear() {
		System.out.println("Hello Gear");
	}

	public default void color() {
		System.out.println("Color is Red");
	}
}

class bicycle implements Vehicle {

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Max Speed 30km/hr");
	}

}

public class USEinterface {
	public static void main(String[] args) {
		bicycle b = new bicycle();
		Vehicle.gear();
		b.speed();

		System.out.println(b.m);
		System.out.println(Vehicle.n);
	}
}
