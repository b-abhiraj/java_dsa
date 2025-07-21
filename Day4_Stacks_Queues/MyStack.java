package Day4_Stacks_Queues;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

		// add function
		System.out.println("\nadd function");
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<String>();
		stack1.push("4");
		stack1.push("All");
		stack1.push("Geeks");
		stack2.push("Geeks");
		stack2.push("For");
		stack2.push("Geeks");
		System.out.println(stack1);
		System.out.println(stack2);

		// Accessing the Elements
		System.out.println("\nAccessing the Elements");
		Stack<String> s2 = new Stack<String>();
		s2.push("Welcome");
		s2.push("To");
		s2.push("Geeks");
		s2.push("For");
		s2.push("Geeks");
		System.out.println("Initial Stack: " + s2);
		System.out.println("The element at the top of the stack: " + s2.peek());
		System.out.println("Final Stack: " + s2);

		// Removing elements
		System.out.println("\nRemoving elements");
		Stack<Integer> s3 = new Stack<Integer>();
		s3.push(10);
		s3.push(15);
		s3.push(20);
		s3.push(30);
		s3.push(5);
		System.out.println("Initial stack: " + s3);
		System.out.println("Popped element: " + s3.pop());
		System.out.println("Popped element: " + s3.pop());
		System.out.println("Stack after pop operation: " + s3);
		System.out.println("Is stack empty ?: " + s3.empty());
		s3.pop();
		s3.pop();
		s3.pop();
		System.out.println("Is stack empty ?: " + s3.empty());

		// Search method
		System.out.println("\nSearch method");
		Stack<String> s4 = new Stack<String>();
		s4.push("Geeks");
		s4.push("4");
		s4.push("Geeks");
		s4.push("Welcomes");
		s4.push("You");
		System.out.println("The initial stack: " + s4);
		System.out.println("Does the stack contain element '4'?: " + s4.search("4"));
		System.out.println("Does the stack contain element 'Hello'?: " + s4.search("Hello"));
		System.out.println("Does the stack contain element 'Geeks'?: " + s4.search("Geeks"));
	}
}