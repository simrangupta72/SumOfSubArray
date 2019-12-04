
import java.util.*;

public class StackUsingQueue {
	static Queue <Integer>q1=new LinkedList<>();
	static Queue <Integer>q2=new LinkedList<>();
	public static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	public static void pop() {
		q1.remove();
	}
	public static void peek() {
		System.out.println(q1.element());
		System.out.println(q1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue qs1=new StackUsingQueue();
		qs1.push(10);
		qs1.push(20);
		qs1.push(30);
		qs1.pop();
		qs1.peek();
	}

}
