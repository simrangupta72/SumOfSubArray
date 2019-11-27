import java.util.Scanner;
public class ArraysSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array A:");
		int n=sc.nextInt();
		System.out.println("Enter the number of elements in array B:");
		int m=sc.nextInt();
		System.out.println("Enter the value of X:");
		int x=sc.nextInt();
		System.out.println("Enter the elements in array A:");
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the elements in array B:");
		int arr2[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("The pairs are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]+arr2[j]==x) {
					System.out.println(arr1[i]+" "+arr2[j]);
				}
			}
		}
	}

}
