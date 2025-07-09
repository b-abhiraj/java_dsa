package MyCollections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MyListInterface {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Java");
		li.add("Python");
		li.add("DSA");
		li.add("C++");
		System.out.print("Elements of list are: ");
		for (String s : li) {
			System.out.print(s + ", ");
		}
		System.out.println("\nElement at index 1: " + li.get(1));
		li.set(1, "JavaScript");
		System.out.println("Updated list: " + li);
		li.remove("C++");
		System.out.println("List after removing elements: " + li);

		// updating elements
		System.out.println("\nUpdating element");
		List<String> li1 = new ArrayList<String>();
		li1.add("Geeks");
		li1.add("Geeks");
		li1.add("Geeks");
		System.out.println("Original List: " + li1);
		li1.set(1, "For");
		System.out.println("Updated List: " + li1);

		// searching element
		System.out.println("\nSearching Element");
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(2);
		int i = al.indexOf(2);
		System.out.println("Index of First Occurrence of 2: " + i);
		i = al.lastIndexOf(2);
		System.out.println("Index of Last Occurrence of 2: " + i);

		List<String> li2 = new ArrayList<String>();
		li2.add("one");
		li2.add("two");
		li2.add("three");
		List<String> li3 = new ArrayList<String>();
		li3.add("one");
		li3.add("two");
		li3.add("five");
		System.out.println("List 1:" + li2);
		System.out.println("List 2:" + li3);
		li3.retainAll(li2);
		System.out.println("List 2 after retainAll: " + li3);

		AbstractCollection<String> a = new PriorityQueue<String>();
		a.add("Java");
		a.add("C");
		a.add("C++");
		a.add("JS");
		System.out.println("\nAbstract collection: " + a);
		Object[] arr = a.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
	}

}
