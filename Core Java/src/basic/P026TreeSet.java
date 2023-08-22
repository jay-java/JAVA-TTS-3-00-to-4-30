package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P026TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();//sorted Set
		set.add(1);
		set.add(-984);
		set.add(-85);
		set.add(3434);
		set.add(0);
		set.add(121);
		System.out.println(set);
		System.out.println(set.size());
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
