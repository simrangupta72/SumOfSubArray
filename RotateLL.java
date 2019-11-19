import java.util.Scanner;

public class RotateLL {

	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
		}
	}
	public static RotateLL insert(RotateLL l1, int data) {
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
	public static void display(RotateLL l1) {
		Node temp = l1.head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void shift(RotateLL l1, int k) {
		for(int i=0;i<k;i++)
        {
            Node temp=l1.head;
            Node prev=null;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=l1.head;
            l1.head=temp;
        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateLL l1 = new RotateLL();
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
		System.out.println("Enter by how my nodes you want to rotate your linked list:");
		int k=sc.nextInt();
		l1.shift(l1, k);
		l1.display(l1);
	}

}
