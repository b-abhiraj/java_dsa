package MyCollections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

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
	}

}
