package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class MyVector {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("Dummy Vector");
		Vector<Integer> v = new Vector<>(3, 2);
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);

		v.insertElementAt(0, 1);
		v.removeElement(2);

		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Implementation and creation
		System.out.println("\nImplementation and creation");
		int n = 5;
		Vector<Integer> v1 = new Vector<Integer>(n);
		for (int i = 0; i < n; i++) {
			v1.add(i);
		}
		System.out.println(v1);
		v1.remove(3);
		System.out.println(v1);
		for (int i : v1) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Adding Elements
		System.out.println("\nAdding Elements");
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add("geeks");
		v2.add("forgeeks");
		v2.add(3);

		System.out.println("Vector v2 is: " + v2);
		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(1);
		v3.add(2);
		v3.add(3);
		System.out.println("Vector v3 is: " + v3);

		// Updating Elements
		System.out.println("\nUpdating Elements");
		Vector<Integer> v4 = new Vector<Integer>();
		v4.add(12);
		v4.add(23);
		v4.add(22);
		v4.add(10);
		v4.add(20);
		System.out.println("Vector: " + v4);
		System.out.println("The object that is replaced is: " + v4.set(0, 21));
		System.out.println("The object that is replaced is: " + v4.set(4, 50));
		System.out.println("The new Vector is: " + v4);

		// Removing Elements
		System.out.println("\nRemoving Elements");
		Vector v5 = new Vector();
		v5.add(1);
		v5.add(2);
		v5.add("Geeks");
		v5.add("ForGeeks");
		v5.add(4);
		System.out.println("Initial vector v5: " + v5);
		v5.remove(1);
		System.out.println("Vector after removal: " + v5);

		// Iterating the Vector
		System.out.println("\nIterating Vector");
		Vector<String> v6 = new Vector<String>();
		v6.add("Geeks");
		v6.add("Geeks");
		v6.add(1, "For");
		for (int i = 0; i < v6.size(); i++) {
			System.out.print(v6.get(i) + " ");
		}
		System.out.println();
		for (String s : v6) {
			System.out.print(s + ", ");
		}
		System.out.println();

		// Adding elements differently
		System.out.println("\nAdd variations");
		Vector<String> v7 = new Vector<String>();
		v7.add("A");
		v7.add("B");
		v7.add("C");
		v7.add("D");
		v7.add("E");
		v7.add("F");
		System.out.println("Initial vector v7: " + v7);

		Vector<String> v8 = new Vector<String>();
		v8.add("A");
		v8.add("B");
		v8.add("C");
		v8.add("E");
		v8.add("F");
		boolean b = v8.add("D");
		if (b == true) {
			System.out.println("\nAdd Successful");
		} else {
			System.out.println("Add was unsuccessful");
		}
		System.out.println("The new vector is: " + v8);

		Vector<Integer> v9 = new Vector<Integer>();
		v9.add(1);
		v9.add(3);
		v9.add(5);
		System.out.println("\nInitial vector v9: " + v9);
		int index = 1;
		v9.add(index, 2);
		index = 3;
		v9.add(index, 4);
		System.out.println("After add: " + v9);

		// Add All variations
		Vector<Integer> v10 = new Vector<Integer>();
		Vector<Integer> a = new Vector<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		v10.addAll(a);
		System.out.println("\nVector using addAll v10: " + v10);

		Vector<String> v11 = new Vector<String>();
		v11.add("Geeks");
		v11.add("For");
		v11.add("Geeks");
		Collection<String> c = new ArrayList<String>();
		c.add("A");
		c.add("Computer");
		c.add("Portal");
		c.add("For");
		c.add("Geeks");
		System.out.println("\nVector v11 before addAll: " + v11);
		v11.addAll(c);
		System.out.println("After Add all: " + v11 + "\n");

		Vector<Integer> v12 = new Vector<Integer>();
		v12.add(1);
		v12.add(4);
		Vector<Integer> v13 = new Vector<Integer>();
		v13.add(2);
		v13.add(3);
		v12.addAll(1, v13);
		System.out.println(v12);

		// Capacity of a vector
		System.out.println("\nVector Capacity");
		Vector<String> v14 = new Vector<String>();
		v14.add("Welcome");
		v14.add("to");
		v14.add("GFG");
		System.out.println("Vector v14: " + v14);
		System.out.println("Vector v14's capactiy: " + v14.capacity());

		// Clear method
		System.out.println("\nClear method");
		System.out.println("Vector v14: " + v14);
		v14.clear();
		System.out.println("Vector v14 after clearing: " + v14);

		// Cloning vector
		System.out.println("\nCloning vector");
		Vector<String> v15 = new Vector<String>();
		v15.add("Geeks");
		v15.add("For");
		v15.add("Geeks");
		System.out.println("Original vector v15: " + v15);
		Vector<String> vc = (Vector<String>) v15.clone();
		System.out.println("Cloned Vector vc: " + vc);

		// Contains method
		System.out.println("\nContains method");
		Vector<String> v16 = new Vector<String>();
		v16.add("Welcome");
		v16.add("To");
		v16.add("Geeks");
		v16.add("4");
		v16.add("Geeks");
		System.out.println("V16 contains '4'?: " + v16.contains("4"));

		// containsAll method
		System.out.println("\nContains all method");
		Vector<String> v17 = new Vector<String>();
		v17.add("Welcome");
		v17.add("To");
		v17.add("Geeks");
		v17.add("4");
		v17.add("Geeks");
		Vector<String> v18 = new Vector<String>();
		v18.add("Geeks");
		v18.add("4");
		v18.add("Geeks");
		System.out.println("Does v17 contain v18: " + v17.containsAll(v18));

		// copyInto
		System.out.println("\ncopyInto method");
		Vector<Integer> v19 = new Vector<Integer>();
		v19.add(1);
		v19.add(2);
		v19.add(3);
		Integer[] arr = new Integer[] { 10, 20, 30 };
		System.out.print("Initial array is: ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		v19.copyInto(arr);
		System.out.print("The final array: ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// elementAt method
		System.out.println("\nElement At method");
		Vector<Integer> v20 = new Vector<Integer>();
		v20.add(10);
		v20.add(20);
		v20.add(30);
		v20.add(40);
		v20.add(50);
		System.out.println("Vector v20: " + v20);
		System.out.println("Element at index 3: " + v20.elementAt(3));

		Vector<String> v21 = new Vector<String>();
		v21.add("Geeks");
		v21.add("For");
		v21.add("Geeks");
		System.out.println("Vector v21: " + v21);
		System.out.println("Element at index 1: " + v21.elementAt(1));

		// elements Method
		System.out.println("\nelements Method");
		Vector<Integer> v22 = new Vector<Integer>();
		v22.add(10);
		v22.add(20);
		v22.add(30);
		v22.add(40);
		v22.add(50);
		System.out.println("Vector v22: " + v22);
		Enumeration e = v22.elements();
		System.out.println("The enumeration values are: ");
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}

		Vector<String> v23 = new Vector<String>();
		v23.add("Geeks");
		v23.add("For");
		v23.add("Geeks");
		System.out.println("\nVector v23: " + v23);
		Enumeration e1 = v23.elements();
		while (e1.hasMoreElements()) {
			System.out.print(e1.nextElement() + " ");
		}

		// vector equals
		System.out.println("\n\nvector equals");
		Vector<String> v24 = new Vector<String>();
		v24.add("Geeks");
		v24.add("4");
		v24.add("Geeks");
		Vector<String> v25 = new Vector<String>();
		v25.add("Geeks");
		v25.add("4");
		v25.add("Geeks");
		System.out.println("Vector v24: " + v24);
		System.out.println("Vector v25: " + v25);
		System.out.println("Does v24 equals v25: " + v24.equals(v25));

		// firstElement method
		System.out.println("\nfirstElement method");
		Vector<String> v26 = new Vector<String>();
		v26.add("Geek1");
		v26.add("Geek2");
		v26.add("Geek3");
		System.out.println("Vector v26: " + v26);
		System.out.println("firstElement: " + v26.firstElement());

		// forEach method
		System.out.println("\nforEach Method");
		Vector<String> v27 = new Vector<String>();
		v27.add("SaltLake");
		v27.add("LakeTown");
		v27.add("Kestopur");
		System.out.println("List of string data: ");
		v27.forEach((o) -> System.out.println(o));

		// hashCode
		System.out.println("\nhashCode Method");
		Vector<String> v28 = new Vector<String>();
		v28.add("Welcome");
		v28.add("To");
		v28.add("Geeks");
		v28.add("4");
		v28.add("Geeks");
		System.out.println("Vector v28: " + v28);
		System.out.println("V28 hashcode: " + v28.hashCode());

		// indexOf method
		System.out.println("\nindexOf Method");
		Vector<String> v29 = new Vector<String>();
		v29.add("Geeks");
		v29.add("For");
		v29.add("Geeks");
		v29.add("10");
		v29.add("20");
		System.out.println("Vector v29: " + v29);
		System.out.println("First occurrence of 'Geeks': " + v29.indexOf("Geeks"));
		System.out.println("First occurrence of '10': " + v29.indexOf("10"));

		// insertElementAt method
		System.out.println("\ninsertElementAt method");
		Vector<String> v30 = new Vector<String>();
		v30.add("Welcome");
		v30.add("To");
		v30.add("Geeks");
		v30.add("To");
		v30.add("Geeks");
		System.out.println("Vector v30: " + v30);
		v30.insertElementAt("Hello", 2);
		v30.insertElementAt("World", 6);
		System.out.println("Vector v30 after inserting elements: " + v30);

		// isEmpty Method
		System.out.println("\nisEmpty Method");
		Vector<String> v31 = new Vector<String>();
		v31.add("Geeks");
		v31.add("4");
		v31.add("Geeks");
		System.out.println("Is vector v31 empty ?: " + v31.isEmpty());

		// iterator method
		System.out.println("\niterator Method");
		Vector<Integer> v32 = new Vector<Integer>();
		v32.add(10);
		v32.add(20);
		v32.add(30);
		v32.add(40);
		v32.add(50);
		System.out.println("Vector v32: " + v32);
		Iterator i1 = v32.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		System.out.println();

		// lastElement Method
		System.out.println("\nlastElement Method");
		Vector<String> v33 = new Vector<String>();
		v33.add("Geek1");
		v33.add("Geek2");
		v33.add("Geek3");
		System.out.println("Vector v33: " + v33);
		System.out.println("Last Index of v33: " + v33.lastElement());

		// lastIndexOf Method
		System.out.println("\nlastIndexOf Method");
		Vector<String> v34 = new Vector<String>();
		v34.add("Geek1");
		v34.add("Geek2");
		v34.add("Geek3");
		System.out.println("Vector v34: " + v34);
		System.out.println("index of Geek3: " + v34.lastIndexOf("Geek3"));

		// ListIterator Method
		System.out.println("\nListIterator Method");
		Vector<String> v35 = new Vector<String>();
		v35.add("Geek1");
		v35.add("Geek2");
		v35.add("Geek3");
		System.out.println("Vector v35: " + v35);
		ListIterator li1 = v35.listIterator();
		System.out.println("Forward Traversal");
		while (li1.hasNext()) {
			System.out.print(li1.next() + " ");
		}
		System.out.println("\nBackward Traversal");
		while (li1.hasPrevious()) {
			System.out.print(li1.previous() + " ");
		}

		// removeIf Method
		System.out.println("\n\nremoveIf Method");
		Vector<Integer> v36 = new Vector<Integer>();
		v36.add(22);
		v36.add(33);
		v36.add(55);
		v36.add(62);

		v36.removeIf(p -> (p % 2 == 0));
		System.out.println("All number not divisble by 2 are: " + v36);

		// set Method
		System.out.println("\nset Method");
		Vector<String> v37 = new Vector<String>();
		v37.add("Geeks");
		v37.add("For");
		v37.add("Geeks");
		v37.add("10");
		v37.add("20");
		System.out.println("Vector v37: " + v37);
		v37.set(2, "GFG");
		v37.set(4, "50");
		System.out.println("Vector after updating elements: " + v37);
		
		
	}
}