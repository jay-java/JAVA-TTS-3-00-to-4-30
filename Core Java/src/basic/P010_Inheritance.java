package basic;
//inheritance-> to access property of one class to another class
//5 types->1.Single 2.Multilevel 3.Multiple 4.Hierarchical 5.Hybrid
// multiple and hybrid not supported by java (ambiguity)
//1.Single
class P{
	P(){
		System.out.println("parent cons");
	}
	public void parentMethd() {
		System.out.println("parent method");
	}
}
class C extends P{
	public void childMethod() {
		System.out.println("child method");
	}
}
//2.Mulitlevel
class GC extends C{
	public void GCMethod() {
		System.out.println("grand child method");
	}
}
class P1{
	
}
class C1 extends P1{
	
}
class C2 extends P1{
	
}
public class P010_Inheritance {
	public static void main(String[] args) {
		C c=  new C();
		c.parentMethd();
		c.childMethod();
		GC g  = new GC();
		g.parentMethd();
		g.childMethod();
		g.GCMethod();
	}
}
