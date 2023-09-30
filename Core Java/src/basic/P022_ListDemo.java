package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection framework-> is framework that provides an architecture 
//						 to manipulate group of objects 
//all class and interface belongs to util package
//List,Set,Map
//<generics>
public class P022_ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(1244);
		list.add(false);
		list.add('g');
		list.add(454.4);
		list.add(1);
		System.out.println(list);
		list.add(343);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(7);
		list.add("name");
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
