package Day4_Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDequeueStack {

	public static void main(String[] args) {
		Deque<Integer> d1 = new ArrayDeque<Integer>();
		d1.push(10);
		d1.push(20);
		d1.push(30);
		System.out.println("Popped element: " + d1.pop());
		System.out.println("Top most element: " + d1.peek());
	}
}