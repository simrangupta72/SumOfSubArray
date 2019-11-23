import java.util.Scanner;

public class DoublyLinkedLst {
	Node head;
	Node tail;
	public static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}

	public static DoublyLinkedLst insert(DoublyLinkedLst li, int data) {
		Node newNode = new Node(data);
        Node last = li.head;
        newNode.next = null;
        newNode.prev= null;
        if (li.head == null) {
            li.head = newNode;
        }
        else
        {
        	while (last.next != null)
                last = last.next;
            last.next = newNode;
            newNode.prev = last;
        }
		return li;
	}

	public static DoublyLinkedLst delete(DoublyLinkedLst li, int index) {
		Node current=li.head;
		Node last=null;
		if(index==0 && current!=null)
		{
			li.head=current.next;
			current=li.head;
			current.prev=null;
			System.out.println("1st element of your linked list is deleted");
		}
		else {
			int count=0;
			while(current.next!=null) {
				if(count==index) {
					last.next=current.next;
					current=current.next;
					current.prev=last;
					break;
				}

				else {
					last=current;
					current=current.next;
					count++;
				}
			}
			if(current==null)
				System.out.println("Index doesnt exist");
		}
		return li;
	}
	public static DoublyLinkedLst delLast(DoublyLinkedLst li) {
		Node current=li.head;
		Node last=current;
			last.next=current.next;
			current.prev=null;
			return li;
	}
	public static void display(DoublyLinkedLst li) {
		Node temp = li.head;
		Node rev=li.tail;
		System.out.println("Your linked list in forward direction: ");
		while (temp != null) {
			System.out.print(temp.data+" ");
			rev=temp;
			temp = temp.next;

		}
		System.out.println("\n"+"\n"+"In reverese the list will be: ");
		while(rev!=null)
		{
			System.out.print(rev.data+" ");
			rev=rev.prev;
		}
		System.out.println();
		if(li.head==null)
			System.out.println("List does not exist yet");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String cont=null;
		DoublyLinkedLst li=new DoublyLinkedLst();
		do {

		System.out.println("Press 1 for inserting your linked list");
		System.out.println("Press 2 for deleting the last element");
		System.out.println("Press 3 for deleting at a specific index");
		System.out.println("Press 4 to display your linked list");

			int option=s.nextInt();
			switch(option) {

			case 1:
				System.out.println("Enter how many inputs you want in your Linked List");
				int input=s.nextInt();
				for(int i=0;i<input;i++)
				{
					int num=s.nextInt();
					li.insert(li, num);
				}
				break;

			case 2:
				li.delLast(li);
				break;

			case 3:
				if(li.head==null)
					System.out.println("List does not exist yet");
				else {
				System.out.println("Enter the index which you want to delete in your linked list");
				int ind=s.nextInt();
				li.delete(li, ind);
				}
				break;

			case 4:
				li.display(li);
				break;

			default:
				System.out.println("Entered input in invalid");
				break;

		}
			System.out.println("Do you want to continue? yes or no");
			cont=s.next();
			if(cont.contentEquals("yes")||cont.contentEquals("no"))
				continue;
			else
				System.out.println("Enter a valid choice");
		}while(cont.equals("yes"));
	}

}
