package basic;
//same function name but having different functionality

//2 Types
//1.Compile Time->Overloading
//2.Runtime -> Overriding

//Overloading->same function name,different argument,into same class
class Overload {
	public void area(int s) {
		System.out.println("square area : " + (s * s));
	}

	public void area(int l, int b) {
		System.out.println("rect : " + (l * b));
	}

	public void area(double h, double b) {
		System.out.println("triangle area : " + ((h * b) / 2));
	}
}


//Overriding->1.same function name 2.same argument 3.into diff. class
//			->4.parent child
class Parent {
	public void call() {
		System.out.println("call mehhod parent method");
	}
}

class Child extends Parent {
	public void call() {
		super.call();
		System.out.println("call mehhod child method");
	}
}

public class P011_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.area(12);
		o.area(3, 4);
		o.area(23.2, 45.4);
		Child c = new Child();
		c.call();
		c.call();
	}
}
