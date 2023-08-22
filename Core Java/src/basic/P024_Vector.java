package basic;

import java.util.Enumeration;
import java.util.Vector;

public class P024_Vector {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add("java");
		vr.add('d');
		vr.add(false);
		vr.add(1);
		System.out.println(vr.size());
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
