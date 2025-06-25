package Basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

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

		// Peek Method
		System.out.println("\nPeek Method");
		LinkedList li1 = new LinkedList();
		li1.add("Geeks");
		li1.add(4);
		li1.add("Geeks");
		li1.add("8");
		System.out.println("The original list: " + li1);
		System.out.println("Looking for first element using peek: " + li1.peek());

		// Peek First Method
		System.out.println("\nPeek First Method");
		LinkedList li2 = new LinkedList();
		li2.add("Geeks");
		li2.add(4);
		li2.add("Geeks");
		li2.add("8");
		System.out.println(li2.peekFirst());

		// Peek Last Method
		System.out.println("\nPeek Last Method");
		LinkedList li3 = new LinkedList();
		li3.add("Geeks");
		li3.add(4);
		li3.add("Geeks");
		li3.add("8");
		System.out.println(li3.peekLast());

		// Poll Method
		System.out.println("\nPoll Method");
		LinkedList li4 = new LinkedList();
		li4.add("Geeks");
		li4.add(4);
		li4.add("Geeks");
		li4.add("8");
		System.out.println("Initial List: " + li4);
		System.out.println("First element removal: " + li4.poll());

		// Poll First Method
		System.out.println("\nPoll First Method");
		LinkedList li5 = new LinkedList();
		li5.add("Geeks");
		li5.add(4);
		li5.add("Geeks");
		li5.add("8");
		System.out.println("Inital List: " + li5);
		System.out.println("Popping the head element: " + li5.pollFirst());

		// Poll Last Method
		System.out.println("\nPoll Last Method");
		LinkedList li6 = new LinkedList();
		li6.add("Geeks");
		li6.add(4);
		li6.add("Geeks");
		li6.add("8");
		System.out.println("Initial List: " + li6);
		System.out.println("Popping the last element: " + li6.pollLast());
		System.out.println("List after poll opr: " + li6);

		// Pop Method
		System.out.println("\nPop method");
		LinkedList li7 = new LinkedList();
		li7.add(10);
		li7.add(20);
		li7.add(30);
		li7.add(40);
		System.out.println("Poping the first element: " + li7.pop());
		System.out.println("List after wards: " + li7);

		// Push Method
		System.out.println("\nPush Method");
		LinkedList li8 = new LinkedList();
		li8.add("Geeks");
		li8.add(4);
		li8.add("Geeks");
		System.out.println("Before push opr: " + li8);
		li8.push("Geek");
		System.out.println("After push opr: " + li8);

		// Remove Method
		System.out.println("\nRemove Method");
		LinkedList li9 = new LinkedList();
		li9.add("Geeks");
		li9.add("For");
		li9.add("Geeks");
		li9.add("Geek");
		li9.add(10);
		li9.add(20);
		System.out.println("Remove: " + li9.remove());
		System.out.println("Remove by index: " + li9.remove(2));
		System.out.println("Remove by value: " + li9.remove("20"));
		System.out.println("Final list: " + li9);

		// Remove First Method
		System.out.println("\n Remove First Method");
		LinkedList li10 = new LinkedList();
		li10.add(100);
		li10.add(200);
		li10.add(300);
		li10.add(400);
		System.out.println("Before removing: " + li10);
		li10.removeFirst();
		System.out.println("After removing: " + li10);

		// remove first occurrence
		System.out.println("\nRemove First Occurrence");
		LinkedList li11 = new LinkedList();
		li11.add("A");
		li11.add("B");
		li11.add("C");
		li11.add("D");
		li11.add("B");
		System.out.println("Before Removing: " + li11);
		li11.removeFirstOccurrence("B");
		System.out.println("After Removing: " + li11);

		// remove Last method
		System.out.println("\nRemove Last Method");
		LinkedList li12 = new LinkedList();
		li12.add(100);
		li12.add(200);
		li12.add(300);
		li12.add(400);
		li12.add(500);
		System.out.println("Before Removing: " + li12);
		li12.removeLast();
		System.out.println("After Removing: " + li12);

		// remove last occurrence method
		System.out.println("\nRemove Last Occurrence Method");
		LinkedList li13 = new LinkedList();
		li13.add("A");
		li13.add("B");
		li13.add("C");
		li13.add("B");
		li13.add("D");
		System.out.println("Before Removing: " + li13);
		li13.removeLastOccurrence("B");
		System.out.println("After Removing: " + li13);

		// Set Method
		System.out.println("\nSet Method");
		LinkedList li14 = new LinkedList();
		li14.add("Geeks");
		li14.add("For");
		li14.add("Geeks");
		System.out.println("Before set opr: " + li14);
		li14.set(1, "GFG");
		System.out.println("After set opr: " + li14);

		// Size function
		System.out.println("\nSize Function");
		LinkedList li15 = new LinkedList();
		li15.add(10);
		li15.add(20);
		li15.add(30);
		li15.add(40);
		li15.add(50);
		System.out.println("Size of the linked list: " + li15.size());

		// spliterator method
		System.out.println("\nSpliterator Method");
		LinkedList li16 = new LinkedList();
		li16.add(10);
		li16.add(20);
		li16.add(30);
		li16.add(40);
		li16.add(50);

		Spliterator<Integer> it = li16.spliterator();
		System.out.println("Splitting the list: ");
		it.forEachRemaining(System.out::println);

		// spliterator and print
		LinkedList li17 = new LinkedList();
		li17.add("Delhi 6");
		li17.add("3 Idiots");
		li17.add("Stree");
		li17.add("Airlift");

		Spliterator<String> si1 = li17.spliterator();
		System.out.println("List of Movies");
		si1.forEachRemaining(n -> System.out.println("Movie name: " + n));

		// to Array
		System.out.println("To Array Method");
		LinkedList<Integer> li18 = new LinkedList<Integer>();
		li18.add(10);
		li18.add(20);
		li18.add(30);
		li18.add(40);
		li18.add(50);

		System.out.println("the LinkedList: " + li18);
		Integer[] arr1 = new Integer[li18.size()];
		li18.toArray(arr1);
		System.out.println("After converting to array");
		for (Integer v : arr1) {
			System.out.print(v + " ");
		}

	}

}
