package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class arrayLists {

	static class Person {

		String n;

		Person(String n) {
			this.n = n;
		}

		public String toString() {
			return n;
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		// Add method or append
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		System.out.println(a);

		ArrayList<String> al = new ArrayList<String>();

		al.add("Geeks");
		al.add("Geeks");

		System.out.println("List before any update: " + al);

		// Add element using index
		al.add(1, "For");

		System.out.println("List after update at index 1: " + al);

		// remove element on the specific index
		al.remove(0);

		System.out.println("List after removing the very first element: " + al);

		// remove the first matching element from the list
		al.remove("Geeks");

		System.out.println("After removing 'Geeks': " + al);

		// remove the element from a particular index
		al.set(0, "GFG");

		System.out.println("After setting 'GFG': " + al);

		// add all
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Java");
		l1.add("C++");
		System.out.println(l1);

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("C");

		l1.addAll(l2);

		System.out.println(l2);
		System.out.println("addAll method used: " + l1);

		// clear method
		l1.clear();
		System.out.println("l1 after using clear(): " + l1);

		// object add
		ArrayList<Person> p = new ArrayList<>();
		p.add(new Person("Ram"));
		p.add(new Person("Shyam"));

		System.out.println(p);

		// contains()

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Bananas");

		System.out.println(fruits.contains("Apple"));

		// ensure capacity
		ArrayList<Integer> capacity = new ArrayList<Integer>();
		capacity.ensureCapacity(5);
		for (int i = 1; i <= 5; i++) {
			capacity.add(i);
		}
		System.out.println(capacity);

		// forEach
		ArrayList<String> s = new ArrayList<String>();
		s.add("Apple");
		s.add("Banana");
		s.add("Grapes");

		s.forEach(System.out::println);

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(4);

		nums.forEach(n -> System.out.println(n * n));

		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(23);
		age.add(20);
		age.add(12);

		age.forEach(a1 -> {
			if (a1 >= 18) {
				System.out.println("eligible age: " + a1);
			}
		});

		// index of
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);

		for (Integer v : arr) {
			System.out.println(v);
		}

		int q = arr.indexOf(3);
		System.out.println("index of 3 in arr is: " + q);

		// is empty
		System.out.println("is Empty for the above arr: " + arr.isEmpty());

		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(21);
		nums1.add(22);
		nums1.add(23);

		// last index of
		System.out.println(nums1.lastIndexOf(22));

		// list iterator
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");

		ListIterator<String> li = s1.listIterator();

		System.out.println("Printing the list");
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// remove all
		System.out.println("clearing s1: " + s1.removeAll(s1));

		// remove if
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(23);
		num1.add(32);
		num1.add(45);
		num1.add(63);

		System.out.println("Before removal: " + num1);
		num1.removeIf(n -> (n % 3 == 0));
		System.out.println("After removal: " + num1);

		ArrayList<String> names = new ArrayList<String>();

		names.add("Shweta");
		names.add("Gudly");
		names.add("Soham");
		names.add("Mohan");
		names.add("Amiya");

		System.out.println("name list before: " + names);
		names.removeIf(name -> (name.startsWith("S")));
		System.out.println("After removal: " + names);

		// spliterator
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Apple");
		al2.add("Banana");
		al2.add("Mango");
		al2.add("Grapes");

		Spliterator<String> si = al2.spliterator();

		si.forEachRemaining(System.out::println);

		// sub list
		ArrayList<String> l = new ArrayList<String>();
		l.add("Rose");
		l.add("Lotus");
		l.add("Lavender");
		l.add("Lilly");
		l.add("Sunflower");

		List<String> s3 = l.subList(1, 3);
		System.out.println(s3);

		// arrayList to array
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);

		Object[] object = ls.toArray();

		for (Object f : object) {
			System.out.println(f);
		}
	}

}
