import java.util.Scanner;
class Node {
	int key;
	Node left;
	Node right;

	Node(int d) {
		key = d;
		left = right = null;
	}
}
public class LeastCommonAncestorOfTree {
	static Node root;
	LeastCommonAncestorOfTree()
	{
		root=null;
	}
	LeastCommonAncestorOfTree(int data)
	{
		root=new Node(data);
	}
	public static Node Ancestors(Node root,int a,int b)
	{
		if(root==null||root.key==a|| root.key==b)
			return root;
		Node left=Ancestors(root.left,a,b);
		Node right=Ancestors(root.right,a,b);
		if(left!=null && right!=null)
		    return root;
		if(left!=null)
			return left;
		if(right!=null)
			return right;
		return null;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LeastCommonAncestorOfTree tree=new LeastCommonAncestorOfTree(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		System.out.println("Enter the nodes:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Node n=Ancestors(root,a,b);
		System.out.println("Ancestor of "+a+" and "+b+" is:"+n.key);
	}
}
