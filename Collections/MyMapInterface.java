package Collections;

import java.util.ArrayList;
import java.util.Collections;
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

		Map<Integer, String> hm1 = new HashMap<>();
		Map<Integer, String> hm2 = new HashMap<>();

		hm1.put(1, "Geeks");
		hm1.put(2, "For");
		hm1.put(3, "Geeks");

		hm2.put(new Integer(1), "Geeks");
		hm2.put(new Integer(2), "For");
		hm2.put(new Integer(3), "Geeks");

		System.out.println(hm1);
		System.out.println(hm2);

		// changing elements
		System.out.println("\nChanging Elements");
		Map<Integer, String> hm3 = new HashMap<Integer, String>();
		hm3.put(new Integer(1), "Geeks");
		hm3.put(new Integer(2), "Geeks");
		hm3.put(new Integer(3), "Geeks");
		System.out.println("Before update: " + hm3);
		hm3.put(new Integer(2), "For");
		System.out.println("After update: " + hm3);

		// removing elements
		System.out.println("\nRemoving elements");
		Map<Integer, String> hm4 = new HashMap<Integer, String>();
		hm4.put(new Integer(1), "Geeks");
		hm4.put(new Integer(2), "For");
		hm4.put(new Integer(3), "Geeks");
		hm4.put(new Integer(4), "For");
		System.out.println("Before removing: " + hm4);
		hm4.remove(new Integer(4));
		System.out.println("After removing: " + hm4);

		// iterating through the map
		System.out.println("\niterating through the map");
		Map<Integer, String> hm5 = new HashMap<Integer, String>();
		hm5.put(new Integer(1), "Geeks");
		hm5.put(new Integer(2), "For");
		hm5.put(new Integer(3), "Geeks");

		for (Map.Entry<Integer, String> e : hm5.entrySet()) {
			int key = (int) e.getKey();
			String value = (String) e.getValue();

			System.out.println(key + " : " + value);
		}

		// counting occurrences
		System.out.println("\nCounting Occurrences");
		int[] arr = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		HashMap<Integer, Integer> hm6 = new HashMap<Integer, Integer>();
		for (int i = 0; i < al.size(); i++) {
			hm6.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
		}
		System.out.println(hm6);

		// clear
		System.out.println("\nClear function");
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(10, "Geeks");
		map1.put(15, "4");
		map1.put(20, "Geeks");
		map1.put(25, "Welcomes");
		map1.put(30, "You");
		System.out.println("Before clearing: " + map1);
		map1.clear();
		System.out.println("After clearing: " + map1);

		// another clear example
		System.out.println("\nAnother Clear example");
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Geeks", 10);
		map2.put("4", 15);
		map2.put("Geeks", 20);
		map2.put("Welcomes", 25);
		map2.put("You", 30);
		System.out.println("Before clearing: " + map2);
		map2.clear();
		System.out.println("After clearing: " + map2);

		// contains key
		System.out.println("\nContains key");
		Map<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(10, "Geeks");
		map3.put(15, "4");
		map3.put(20, "Geeks");
		map3.put(25, "Welcomes");
		map3.put(30, "You");
		System.out.println("is key '20' present: " + map3.containsKey(20));

		// another contains key example
		System.out.println("\nAnother key example");
		Map<String, Integer> map4 = new HashMap<String, Integer>();
		map4.put("Geeks", 10);
		map4.put("4", 15);
		map4.put("Geeks", 20);
		map4.put("Welcomes", 25);
		map4.put("You", 30);
		System.out.println("is key 'Geeks' present: " + map4.containsKey("Geeks"));

		// contains value
		System.out.println("\nAnother key example");
		Map<String, Integer> map5 = new HashMap<String, Integer>();
		map5.put("Geeks", 10);
		map5.put("4", 15);
		map5.put("Geeks", 20);
		map5.put("Welcomes", 25);
		map5.put("You", 30);
		System.out.println("is value '20' present: " + map5.containsValue(20));

		// another contains value
		System.out.println("\nAnother Contains value");
		Map<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(10, "Geeks");
		map6.put(15, "4");
		map6.put(20, "Geeks");
		map6.put(25, "Welcomes");
		map6.put(30, "You");
		System.out.println("is value 'Geeks' present: " + map6.containsValue("Geeks"));

		// equals to
		System.out.println("\nComparing 2 hashmaps");
		Map<Integer, String> chm1 = new HashMap<Integer, String>();
		chm1.put(1, "Geek1");
		chm1.put(2, "Geek2");
		chm1.put(3, "Geek3");

		Map<Integer, String> chm2 = new HashMap<Integer, String>();
		chm2.put(1, "Geek1");
		chm2.put(2, "Geek2");
		chm2.put(3, "Geek3");

		Map<Integer, String> chm3 = new HashMap<Integer, String>();
		chm3.put(1, "Geek1");
		chm3.put(2, "Geek2");
		chm3.put(4, "Geek4");

		System.out.println("comparing chm1 and chm2: " + chm1.equals(chm2));
		System.out.println("comparing chm1 and chm3: " + chm1.equals(chm3));

		// is Empty
		System.out.println("\nIs Empty");
		Map<Integer, String> hm7 = new HashMap<Integer, String>();
		System.out.println(hm7);
		System.out.println(hm7.isEmpty());

		// keySet()
		System.out.println("\nKey Set Function");
		Map<Integer, String> hm8 = new HashMap<Integer, String>();
		hm8.put(1, "One");
		hm8.put(3, "Three");
		hm8.put(5, "Five");
		hm8.put(7, "Seven");
		hm8.put(9, "Nine");
		System.out.println(hm8.keySet());

		// size method
		System.out.println("\nSize Function");
		Map<String, Integer> hm9 = new HashMap<String, Integer>();

		hm9.put("Java", 10);
		hm9.put("C++", 20);
		hm9.put("Python", 30);
		System.out.println(hm9.size());

		// get or Default function
		System.out.println("\nGet Or Default");
		Map<String, Integer> hm0 = new HashMap<String, Integer>();
		hm0.put("Geek1", 1);
		hm0.put("Geek2", 2);
		int a = hm0.getOrDefault("Geek5", 0);
		System.out.println(a);

		// merger
		System.out.println("\nMerge Function");
		Map<String, Integer> hm11 = new HashMap<String, Integer>();
		hm11.put("A", 10);
		hm11.put("B", 20);

		hm11.merge("C", 30, (oldValue, newValue) -> oldValue + newValue);
		System.out.println(hm11);

		// put if absent
		System.out.println("\nPut If Absent");
		HashMap<Integer, String> hm12 = new HashMap<Integer, String>();
		hm12.put(1, "Geek1");
		hm12.put(2, "Geek2");
		System.out.println("Before put absent: " + hm12);
		hm12.putIfAbsent(3, "Geek3");
		System.out.println("After put absent: " + hm12);
	}

}
