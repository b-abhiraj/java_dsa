package Collections;

import java.util.HashMap;
import java.util.Map;

public class MyMapInterface {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Geek1", 1);
		map.put("Geek2", 2);
		map.put("Geek3", 3);
		System.out.println(map);

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));
		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Shweta", 10);
		m.put("Amiya", 30);
		m.put("Gudly", 20);

		for (Map.Entry<String, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
