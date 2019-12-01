import java.util.Scanner;

public class CheckLLPallindrome {
	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}

	}
	public static CheckLLPallindrome insert(CheckLLPallindrome li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head == null)
		li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static CheckLLPallindrome addbeg(CheckLLPallindrome li,int data)
	{
		Node newNode=new Node(data);
		if(li.head==null)
			li.head=newNode;
		else
		{
		newNode.next=li.head;
		li.head=newNode;
		}
		return li;
	}
	public static void check(CheckLLPallindrome li1,CheckLLPallindrome li2)
	{
		Node temp1=li1.head;
		Node temp2=li2.head;
		while(temp1!=null)
		{
			if(temp1.data==temp2.data)
			{
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else
			{
				break;
			}
		}
		if(temp1==null)
		{
			System.out.println("The linked list is pallindrome");
		}
		else
		{
			System.out.println("The linked list is not pallindrome");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CheckLLPallindrome li1=new CheckLLPallindrome();
		CheckLLPallindrome li2=new CheckLLPallindrome();
		System.out.println("Enter the number of elements in linked list:");
		int num1=sc.nextInt();
		System.out.println("Enter the elements in linked list:");
		for(int i=0;i<num1;i++)
		{
			int num=sc.nextInt();
			li1.insert(li1,num);
			li2.addbeg(li2, num);
		}
		check(li1,li2);

	}

}
