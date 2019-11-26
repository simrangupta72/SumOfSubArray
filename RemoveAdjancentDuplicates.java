import java.util.Scanner;
public class RemoveAdjancentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String res="";
		int len=str.length();
		if(str.charAt(0)!=str.charAt(1))
		{
			res=res+str.charAt(0);
		}
		for(int i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1))
			{
				res=res+str.charAt(i);
			}
		}
		if(str.charAt(len-1)!=str.charAt(len-2)) {
			res=res+str.charAt(len-1);
		}
		System.out.println("The final string is: "+res);
	}
}
