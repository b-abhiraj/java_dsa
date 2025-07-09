package MyCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q);

		// adding elements to the queue
		System.out.println("\nAdding Elements");
		Queue<String> q1 = new LinkedList<String>();
		q1.add("apple");
		q1.add("banana");
		q1.add("cherry");
		System.out.println("Queue: " + q1);

		// remove
		System.out.println("\nRemoving Elements");
		String front = q1.remove();
		System.out.println("Removed element: " + front);
		System.out.println("Queue after removal: " + q1);
		q1.add("date");

		// Peek
		System.out.println("\nPeek Elements");
		String peek = q1.peek();
		System.out.println("Peeked element: " + peek);
		System.out.println("Queue after peek: " + q1);

		System.out.println("\n");
		Queue<Integer> q2 = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			q2.add(i);
		}
		System.out.println("Elements of the queue: " + q2);
		int removed = q2.remove();
		System.out.println("Removed element: " + removed);
		System.out.println(q2);

		int head = q2.peek();
		System.out.println("Head of queue: " + head);
		int size = q2.size();
		System.out.println("Size of the queue: " + size);

		// iterating
		System.out.println("\nIterating Over Queue");
		Queue<String> q3 = new PriorityQueue<>();
		q3.add("Geeks");
		q3.add("For");
		q3.add("Geeks");
		Iterator iterator = q3.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// Priority Queue
		System.out.println("\n\nPriority Queue");
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(15);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());

		// LinkedList
		System.out.println("\nLinkedList Queue");
		Queue<Integer> li1 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(15);
		System.out.println(li1.peek());
		System.out.println(li1.poll());
		System.out.println(li1.peek());

		// PriorityBlockingQueue
		System.out.println("\nPriority-Blocking Queue");
		Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();
		pbq.add(10);
		pbq.add(20);
		pbq.add(15);
		System.out.println(pbq.peek());
		System.out.println(pbq.poll());
		System.out.println(pbq.peek());
	}

}
