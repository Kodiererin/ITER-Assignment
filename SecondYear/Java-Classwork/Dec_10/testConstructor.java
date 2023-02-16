package Dec_10;
//		Default Constructor is Invoked when You create an Object without constructor/

//	Super Keyword invoked the Default Constructor of the Parent Class if no Default Constructor is Created.
//	Super is useful when you have createed COnstructor in parent and Child Class But you want that the Parameter that is send 
//	must be send to the Parent first then to the Child.

//	So this is the use of Constructor + super + parameterised Constructor.
class A {
	A() {
		System.out.println("This Is Parent Class");
	}
}

class B extends A {
	B() {
//		super();
		System.out.println("THis is Child Class");
	}
}

//	Parameterised Constructor with Super

class C {
	C() {
		System.out.println("This is Class C without any Parameter");
	}

	C(int x) {
		System.out.println("This is Class C with a Parameter.");
	}
}

class D extends C {
	D(int x) {
		super();
//		super(x);					Error! When two Super is used Simultaneously.
		System.out.println("This is Class D");
	}
}

public class testConstructor {
	public static void main(String[] args) {
		B obj = new B();
		D obj2 = new D(10);
	}
}
