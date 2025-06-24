package Basics;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		System.out.println(l);

		// add method
		System.out.println("\nAdd Method");
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Geeks");
		l1.add("Geeks");
		l1.add(1, "For");
		System.out.println("Add method used: " + l1);

		// add All method
		System.out.println("\nAdd All Method");
		LinkedList<String> l9 = new LinkedList<String>();
		l9.add("Geeks");
		l9.add("For");
		l9.add("Geeks");
		LinkedList<String> l10 = new LinkedList<String>();
		l10.add("10");
		l10.add("20");
		System.out.println("Before add all");
		System.out.println(l9);
		System.out.println(l10);
		System.out.println("After add all");
		l9.addAll(l10);
		System.out.println(l9);

		// add First Method
		System.out.println("\nAdd First Method");
		LinkedList<String> l11 = new LinkedList<String>();
		l11.add("Geeks");
		l11.add("For");
		l11.add("Geeks");
		System.out.println("Before First add: " + l11);
		l11.addFirst("Platform");
		l11.addFirst("Learning");
		System.out.println("After First add: " + l11);

		// Add Last
		System.out.println("\nAdd Last Method");
		LinkedList<String> l12 = new LinkedList<String>();
		l12.add("Geeks");
		l12.add("For");
		l12.add("Geeks");
		System.out.println("Before Add last: " + l12);
		l12.addLast("Is good");
		System.out.println("After add Last: " + l12);

		// set method
		System.out.println("\nSet Method");
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Geeks");
		l2.add("Geeks");
		l2.add(1, "Geeks");
		System.out.println("Initial LinkedList: " + l2);
		l2.set(1, "For");
		System.out.println("Updated LinkedList: " + l2);

		// remove method
		System.out.println("\nRemove Method");
		LinkedList<String> l3 = new LinkedList<String>();
		l3.add("Geeks");
		l3.add("Geeks");
		l3.add("Geeks");
		System.out.println("Intial List: " + l3);
		l3.remove(1);
		System.out.println("After index based removal: " + l3);
		l3.remove("Geeks");
		System.out.println("After object based removal: " + l3);

		// get method
		System.out.println("\nGet Method");
		LinkedList<String> l4 = new LinkedList<String>();
		l4.add("Geeks");
		l4.add("For");
		l4.add("Geeks");
		for (int i = 0; i < l4.size(); i++) {
			System.out.println(l4.get(i));
		}
		System.out.println("\nUsing for each loop");
		for (String s : l4) {
			System.out.println(s);
		}

		// to Array
		System.out.println("\nTo Array Method");
		LinkedList<Integer> l5 = new LinkedList<Integer>();
		l5.add(123);
		l5.add(12);
		l5.add(11);
		l5.add(1134);
		System.out.println("Linked List: " + l5);
		Object[] object = l5.toArray();
		System.out.println("After converting to array");
		for (Object element : object) {
			System.out.print(element + " ");
		}

		// Size method
		System.out.println("\n\nSize Method");
		LinkedList<String> l6 = new LinkedList<String>();
		l6.add("Geeks for Geeks");
		l6.add("is best");
		System.out.println("Linked List contents: " + l6);
		System.out.println("size of List: " + l6.size());

		// Remove First
		System.out.println("\nRemove First Method");
		LinkedList<Integer> l7 = new LinkedList<Integer>();
		l7.add(10);
		l7.add(20);
		l7.add(30);
		System.out.println("Inital LinkedList: " + l7);
		l7.removeFirst();
		System.out.println("After First Removal: " + l7);

		// Remove last
		System.out.println("\nRemove Last Method");
		LinkedList<Integer> l8 = new LinkedList<Integer>();
		l8.add(10);
		l8.add(20);
		l8.add(30);
		System.out.println("Inital LinkedList: " + l8);
		l8.removeLast();
		System.out.println("After Last Removal: " + l8);

		// clear Method
		System.out.println("\nClear Method");
		LinkedList<Integer> l13 = new LinkedList<Integer>();
		l13.add(10);
		l13.add(20);
		l13.add(30);
		l13.add(40);
		System.out.println("Before clearing everything: " + l13);
		l13.clear();
		System.out.println("After clearing everthing: " + l13);

		// clone Method
		System.out.println("\nClone Method");
		LinkedList<String> l14 = new LinkedList<String>();
		l14.add("Geeks");
		l14.add("For");
		l14.add("Geeks");
		System.out.println("Original Linked list: " + l14);
		LinkedList l15 = new LinkedList();
		l15 = (LinkedList) l14.clone();
		System.out.println("Clone Linked list: " + l15);

		// contains Method
		System.out.println("\nContains Method");
		LinkedList<Integer> l16 = new LinkedList<Integer>();
		l16.add(10);
		l16.add(20);
		l16.add(30);
		l16.add(40);
		l16.add(50);
		System.out.println("Orignal Linked List: " + l16);
		System.out.println(l16.contains(20));

		// descending iterator
		System.out.println("\nDescending Iterator Method");
		LinkedList<Integer> l17 = new LinkedList<Integer>();
		l17.add(100);
		l17.add(200);
		l17.add(300);
		l17.add(400);
		l17.add(500);
		System.out.println("\nOriginal Linked List: " + l17);
		Iterator<Integer> e = l17.descendingIterator();
		System.out.println("Reversed List: ");
		while (e.hasNext()) {
			System.out.print(e.next() + " ");
		}

		// Index of
		System.out.println("\nIndex of Method");
		LinkedList<Integer> l18 = new LinkedList<Integer>();
		l18.add(10);
		l18.add(20);
		l18.add(30);
		l18.add(40);
		l18.add(50);
		System.out.println("The Linked List is: " + l18);
		System.out.println("Index of 20 is: " + l18.indexOf(20));

		// last index of
		System.out.println("\nLast Index of Method");
		LinkedList<Integer> l19 = new LinkedList<Integer>();
		l19.add(10);
		l19.add(20);
		l19.add(30);
		l19.add(40);
		l19.add(50);
		System.out.println("The Linked List is: " + l19);
		System.out.println("Index of 20 is: " + l19.lastIndexOf(20));

		// List iterator
		System.out.println("\nList Iterator Method");
		LinkedList<Integer> l20 = new LinkedList<Integer>();
		l20.add(10);
		l20.add(20);
		l20.add(30);
		l20.add(40);
		l20.add(50);
		System.out.println("Original List: " + l20);
		Iterator<Integer> i1 = l20.iterator();
		System.out.println("Using Iterator");
		while (i1.hasNext()) {
			i1.next();
		}

		// Offer Method
		System.out.println("\nOffer Method");
		LinkedList<Integer> l21 = new LinkedList<Integer>();
		l21.add(3);
		l21.add(5);
		l21.offer(7);
		System.out.println(l21);

		// offer first Method
		System.out.println("\nOffer First Method");
		LinkedList l22 = new LinkedList();
		l22.add("Geeks");
		l22.add(4);
		l22.add("Geeks");
		l22.add(8);

		l22.offerFirst("Geek1");
		System.out.println(l22);

		// offer Last Method
		System.out.println("\nOffer First Method");
		LinkedList l23 = new LinkedList();
		l23.add("Geeks");
		l23.add(4);
		l23.add("Geeks");
		l23.add(8);

		l23.offerLast("Geek1");
		System.out.println(l23);

	}

}
