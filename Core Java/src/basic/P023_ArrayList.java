package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P023_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
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
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
