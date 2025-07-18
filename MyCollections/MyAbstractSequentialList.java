package MyCollections;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyAbstractSequentialList {

	public static void main(String[] args) {
		AbstractSequentialList<Integer> asl1 = new LinkedList<Integer>();
		asl1.add(1);
		asl1.add(2);
		asl1.add(3);
		System.out.println(asl1);

		// Basic functions
		AbstractSequentialList<String> asl2 = new LinkedList<String>();
		asl2.add("Geeks");
		asl2.add("For");
		asl2.add("Geeks");
		asl2.add("10");
		asl2.add("20");
		System.out.println("Abstract Sequential List: " + asl2);
		asl2.remove(3);
		System.out.println("Final List: " + asl2);

		// addAll Method
		System.out.println("\naddAll Method");
		AbstractSequentialList<String> a1 = new LinkedList<String>();
		a1.add("Welcome");
		a1.add("To");
		a1.add("Geeks");
		a1.add("For");
		a1.add("Geeks");
		Collection<String> c1 = new ArrayList<String>();
		c1.add("A");
		c1.add("Portal");
		c1.add("For");
		c1.add("Computer");
		c1.add("Geeks");
		System.out.println("AbstractSequentialList: " + a1);
		a1.addAll(1, c1);
		System.out.println("The new list is: " + a1);

		// iterator Method
		System.out.println("\niterator Method");
		AbstractSequentialList<Integer> a2 = new LinkedList<Integer>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(2, 8);
		a2.add(2, 7);
		a2.add(1, 9);
		a2.add(4, 10);
		Iterator<Integer> it2 = a2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		// listIterator Method
		System.out.println("\nlistIterator Method");
		AbstractSequentialList<Integer> a3 = new LinkedList<Integer>();
		a3.add(5);
		a3.add(6);
		a3.add(7);
		a3.add(2, 8);
		a3.add(2, 7);
		a3.add(2, 9);
		a3.add(4, 10);
		ListIterator<Integer> li2 = a3.listIterator();
		while (li2.hasNext()) {
			System.out.print(li2.next() + " ");
		}

		// set Method
		System.out.println("\n\nset Method");
		AbstractSequentialList<String> a4 = new LinkedList<String>();
		a4.add("Geeks");
		a4.add("For");
		a4.add("Geeks");
		a4.add("10");
		a4.add("20");
		System.out.println("AbstractSequentialList: " + a4);
		System.out.println("The object that is replaced is: " + a4.set(2, "GFG"));
		System.out.println("The object that is replaced is: " + a4.set(4, "50"));
		System.out.println("The new list is: " + a4);
	}
}