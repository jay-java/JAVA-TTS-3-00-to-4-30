package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P027Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");		//entry
		map.put("java", "c++");
		map.put(2, "python");
		map.put('s', "kotlin");
		map.put(1, "dart");
		map.put(null, "fgag");
		map.put(4,null);
		map.put(5,null);
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
//			System.out.println(itr.next());
		}
	}
}
