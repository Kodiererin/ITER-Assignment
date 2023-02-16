package Dec14;

interface Bank {
	public double interest();

	public double total();
}

class SBI implements Bank {
	double Money;

	SBI() {
		this.Money = 0;
	}

	SBI(double money) {
		this.Money = money;
	}

	@Override
	public double interest() {
		// TODO Auto-generated method stub
		return 10.55;
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return this.Money * interest() + this.Money;
	}

}

class PnB implements Bank {
	double Money;

	PnB(double money) {
		this.Money = money;
	}

	@Override
	public double interest() {
		// TODO Auto-generated method stub
		return 12.44;
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return this.Money * interest() + this.Money;
	}

}

public class DenaBank {
	public static void main(String[] args) {
		SBI obj1 = new SBI(100000);
		System.out.println("SBI Interest " + obj1.interest());
		System.out.println("SBI Money Total " + obj1.total());

		PnB obj2 = new PnB(100000);
		System.out.println("PnB Interest " + obj2.interest());
		System.out.println("PnB Money Total " + obj2.total());
	}
}
