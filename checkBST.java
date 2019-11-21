import java.util.Scanner;

class Node{
	int key;
	Node left;
	Node right;
	Node(int temp){
		key=temp;
		right=left=null;
	}
}

	public class checkBST {

		static Node root;

		checkBST()
		{
			root=null;
		}
		checkBST(int data)
		{
			root=new Node(data);
		}

	public static boolean check(Node root) {
		if(root.left==null && root.right==null) {
			return true;
		}
		else if(root.key<=root.left.key || root.key>root.right.key) {
			return false;
		}
		else {
			check(root.left);
			check(root.right);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkBST tree=new checkBST();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		if(check(root)) {
			System.out.println("It is a BST");
		}
		else {
			System.out.println("It is not a BST");
		}

	}

}
