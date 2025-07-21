package Day4_Stacks_Queues;

public class MyArrayStack {

	public int top, cap;
	int[] a;

	public MyArrayStack(int cap) {
		this.cap = cap;
		top = -1;
		a = new int[cap];
	}

	public boolean push(int x) {
		if (top >= cap - 1) {
			System.out.println("Stack overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Empty");
			return 0;
		}
		return a[top--];
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack Empty");
			return 0;
		}
		return a[top];
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public static void main(String[] args) {
		MyArrayStack s1 = new MyArrayStack(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println("Popped from stack: " + s1.pop());
		System.out.println("Top element: " + s1.peek());
		while (!s1.isEmpty()) {
			System.out.print(s1.peek() + " ");
			s1.pop();
		}
	}
}