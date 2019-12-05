public class QueueUsingStacks {
	Node top;

	static class Node {
		int data;
		Node link;
	}

	QueueUsingStacks() {
		this.top = null;
	}

	public void push(int temp) {
		Node newNode = new Node();
		if (newNode == null) {
			System.out.println("**Stack Overflow**");
			return;
		}
		newNode.data = temp;
		newNode.link = top;
		top = newNode;
		//System.out.println(temp + " has been pushed");
	}

	public void pop() {
		if (top == null) {
			System.out.println("**Stack UnderFlow");
			return;
		}
		//System.out.println(top.data + " has been popped");
		top = top.link;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}
	public static QueueUsingStacks enQueue(int data,QueueUsingStacks s1)
	{
		QueueUsingStacks s2=new QueueUsingStacks();
		Node temp=s1.top;
		while(temp!=null)
		{
			s2.push(temp.data);
			temp=temp.link;
			s1.pop();
		}
		s1.push(data);
		Node temp1=s2.top;
		while(temp1!=null)
		{
			s1.push(temp1.data);
			temp1=temp1.link;
			s2.pop();
		}
		return s1;
	}
	public static QueueUsingStacks dequeue(QueueUsingStacks s1)
	{
		s1.pop();
		return s1;
	}
	void display() {
		if (top == null) {
			System.out.println("**Stack Underflow**");
		} else {
			Node traversal = top;
			System.out.println("The Queue is:");
			while (traversal.link != null) {
				System.out.printf("%d-->", traversal.data);
				traversal = traversal.link;
			}
			System.out.println(traversal.data);
		}
	}

	public static void main(String[] args) {
		QueueUsingStacks s1=new QueueUsingStacks();
		s1.enQueue(1,s1);
		s1.enQueue(2,s1);
    s1.enQueue(3,s1);
		s1.dequeue(s1);
		s1.display();
	}

}
