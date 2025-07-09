package MyCollections;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyAbstractSet {

	public static void main(String[] args) {
		AbstractSet<Integer> as = new TreeSet<Integer>();
		as.add(1);
		as.add(2);
		as.add(3);
		as.add(4);
		as.add(5);
		System.out.println("AbstractSet Before removeAll() operation: " + as);
		Collection<Integer> cl = new ArrayList<Integer>();
		cl.add(1);
		cl.add(2);
		cl.add(3);
		System.out.println("Collection elements to be removed: " + cl);
		as.removeAll(cl);
		System.out.println("AbstractSet after removeAll() operation: " + as);
		Collection<String> c1 = new TreeSet<String>();
		c1.add("Welcome");
		c1.add("To");
		c1.add("Geeks");
		c1.add("4");
		c1.add("Geeks");
		c1.add("TreeSet");

		System.out.println("Collection1: " + c1);
		Collection<String> c2 = new TreeSet<String>();
		System.out.println("Collection2 before addAll(): " + c2);
		c2.addAll(c1);
		System.out.println("Collection2 after addAll(): " + c2);

		Collection<Integer> c3 = new TreeSet<Integer>();
		c3.add(10);
		c3.add(20);
		c3.add(30);
		c3.add(40);
		c3.add(50);
		System.out.println("Collection1: " + c3);
		Collection<Integer> c4 = new TreeSet<Integer>();
		System.out.println("Collection2 before addAll(): " + c4);
		c4.addAll(c3);
		System.out.println("Collection2 after addAll(): " + c4);

		// abstract collection
		System.out.println("\nAbstract Collection");
		AbstractCollection<String> abs = new LinkedList<String>();
		abs.add("Geeks");
		abs.add("For");
		abs.add("Geeks");
		abs.add("10");
		abs.add("20");
		AbstractCollection<String> abs2 = new LinkedList<String>();
		abs2.add("Geeks");
		abs2.add("For");
		abs2.add("Geeks");
		abs2.add("10");
		abs2.add("20");
		System.out.println("Both Collections the same?: " + abs.containsAll(abs2));

	}

}
