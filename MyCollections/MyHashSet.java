package MyCollections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		System.out.println(hs);

		// remove
		System.out.println("\nRemove Function");
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Geeks");
		hs1.add("For");
		hs1.add("Geeks");
		hs1.add("A");
		hs1.add("B");
		hs1.add("Z");
		System.out.println("Before Removal: " + hs1);
		hs1.remove("B");
		System.out.println("After Removal: " + hs1);

		// iterator
		System.out.println("\nIterator Function");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("A");
		hs2.add("B");
		hs2.add("Geeks");
		hs2.add("For");
		hs2.add("Geeks");
		hs2.add("Z");

		Iterator<String> iterator = hs2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}
		System.out.println("\n\nUsing for loop\n");
		for (String s : hs2) {
			System.out.println(s);
		}

		// remove element
		System.out.println("\nRemove Element");
		HashSet<Integer> hs3 = new HashSet<Integer>();
		hs3.add(1);
		hs3.add(2);
		hs3.add(3);
		hs3.add(4);
		hs3.add(5);
		System.out.println("Original HashSet: " + hs3);
		hs3.remove(2);
		System.out.println("After Removal: " + hs3);

		// contains
		System.out.println("\nContains Method");
		HashSet<Integer> hs4 = new HashSet<Integer>();
		hs4.add(1);
		hs4.add(2);
		hs4.add(3);
		System.out.println("HashSet: " + hs4);
		System.out.println("HashSet contains 2: " + hs4.contains(2));
		System.out.println("HashSet contains 10: " + hs4.contains(10));

		// isEmpty
		System.out.println("\nisEmpty ?");
		HashSet<Integer> hs5 = new HashSet<Integer>();
		hs5.add(1);
		hs5.add(2);
		hs5.add(3);
		hs5.add(4);
		hs5.add(5);
		System.out.println("Check if empty: " + hs5.isEmpty());
		hs5.clear();
		System.out.println("Check now if empty: " + hs5.isEmpty());

		// clone
		System.out.println("\nCloning HashSet");
		HashSet<String> hs6 = new HashSet<String>();
		hs6.add("Geek1");
		hs6.add("Geek2");
		hs6.add("Geek3");
		hs6.add("Geek4");
		System.out.println("HashSet: " + hs6);
		HashSet cs = new HashSet();
		cs = (HashSet) hs6.clone();
		System.out.println("Cloned HashSet: " + cs);
	}

}
