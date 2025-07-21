package Day4_Stacks_Queues;

import java.util.ArrayList;

public class MyDynamicArrayStack {

	public static void main(String[] args) {
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		System.out.println("Popped from stack: " + s1.get(s1.size() - 1));
		s1.remove(s1.size() - 1);
		System.out.println("Top element: " + s1.get(s1.size() - 1));
		System.out.println("Elements present in stack");
		while (!s1.isEmpty()) {
			System.out.println(s1.get(s1.size() - 1));
			s1.remove(s1.size() - 1);
		}
	}
}