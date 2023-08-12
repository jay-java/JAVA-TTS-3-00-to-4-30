package basic;
//interface -> interface is same as class but not class
//			-> cannot create object of interface
//			-> can only create reference of interface
//			-> provides 100% abstraction
//			-> all properties by default abstract
//			-> to define functions interface should be implemented
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
	public static void interface5() {
		System.out.println("interface 5");
	}
}
interface inter3{
	public void interface3();
	public static void interface6() {
		System.out.println("interface 6");
	}
}
class InterfaceCall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P014_Interface {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interface4();
		inter2.interface5();
		inter3.interface6();
	}
}
