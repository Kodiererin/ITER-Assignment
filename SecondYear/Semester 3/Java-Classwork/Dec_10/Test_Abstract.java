package Dec_10;

abstract class Animal {
	abstract void sound();

	void foo() {
		System.out.println("This is Foo");
	}
}

class Dog extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Woow Woow I am Ananya");
	}

}

public class Test_Abstract {
	public static void main(String[] args) {
//		Animal ani = new Animal();		// Object of the abstract class is not possible.
		Animal obj = new Dog();			// this is Called Polymorphism.
//		Dog obj = new Dog();
		obj.foo();
		obj.sound();
	}
}
