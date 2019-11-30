package LinkedList1;

import java.util.Scanner;

public class LinkedListSum {

	Node head;

	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public void insert(int d)
	{
		if(head==null)
			head=new Node(d);
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=new Node(d);
		}
	}

	public int sum(Node current)
	{
		if(current.next==null)
			return current.data;
		return sum(current.next)*10+current.data;
	}

	public static void main(String[] args) {
		LinkedListSum ls=new LinkedListSum();
		LinkedListSum ls2=new LinkedListSum();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements in linked list 1:");
		int n=in.nextInt();
		System.out.println("Enter the elements of your list:");
		for(int i=0;i<n;i++)
		{
			ls.insert(in.nextInt());
		}
		System.out.println("Enter the number of elements in linked list 2:");
		n=in.nextInt();
		System.out.println("Enter the elements of your list:");
		for(int i=0;i<n;i++)
		{
			ls2.insert(in.nextInt());
		}
		System.out.println("Your Sum: ");
		System.out.println(ls.sum(ls.head)+ls2.sum(ls2.head));

	}

}
