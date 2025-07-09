package MyCollections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyAbstractList {

	public static void main(String[] args) {
		AbstractList<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("10");
		list.add("20");

		System.out.println(list);

		// everything is same as other array list or linked list

		AbstractList<String> li1 = new ArrayList<String>();
		li1.add("A");
		li1.add("B");
		li1.add("C");
		li1.add("D");
		li1.add("E");
		System.out.println("Original li1: " + li1);
		List<String> li2 = li1.subList(2, 4);
		System.out.println("Sublist li2: " + li2);

		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(3);
		s2.add(2);
		s2.add(1);

		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(1);
		s3.add(2);
		s3.add(4);

		System.out.println("Set1: " + s1);
		System.out.println("Set2: " + s2);
		System.out.println("Set1 equals Set2 ?: " + s1.equals(s2));
		System.out.println("Set1: " + s1);
		System.out.println("Set3: " + s3);
		System.out.println("Set1 equals Set3 ?:" + s1.equals(s3));

		// HashCode
		System.out.println("\nHashCode");
		Set<Integer> s4 = new HashSet<Integer>();
		s4.add(1);
		s4.add(2);
		s4.add(3);
		System.out.println("Set4: " + s4);
		System.out.println("HashCode of Set4: " + s4.hashCode());
		

	}

}
