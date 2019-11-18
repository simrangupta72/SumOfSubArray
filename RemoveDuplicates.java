import java.util.Scanner;
public class RemoveDuplicates {
	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
		}
	}
	public static RemoveDuplicates insert(RemoveDuplicates l1, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (l1.head == null)
			l1.head = newNode;
		else {
			Node last = l1.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return l1;
	}
	public static void display(RemoveDuplicates l1) {
		Node temp = l1.head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void remove(RemoveDuplicates l1) {
		Node current = l1.head;
		while(current!=null) {
			Node temp=current.next;
			Node prev=current;
			while(temp!=null) {
				if(temp.data==current.data) {
					prev.next=temp.next;
					temp=temp.next;
				}
				else {
					prev=temp;
					temp=temp.next;
				}
			}
			current=current.next;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates l1 = new RemoveDuplicates();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many inputs you want in your Linked List");
		int input=sc.nextInt();
		System.out.println("Enter the values you want to insert in your linked list:");
		for(int i=0;i<input;i++)
		{
			int num=sc.nextInt();
			l1.insert(l1, num);
		}
		System.out.println("Your initial linked list looks like this:");
		l1.display(l1);
		System.out.println("After removal of duplicate elements, it looks like this:");
		l1.remove(l1);
		l1.display(l1);
	}

}
