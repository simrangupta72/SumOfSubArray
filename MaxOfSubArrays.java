
import java.util.Scanner;

public class MaxOfSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the value of k:");
		int k=s.nextInt();
		int max=0;
		for(int i=0;i<=n-k;i++)
		{
			max=arr[i];
            for (int j=1;j<k;j++) {
                if (max<arr[i+j])
                    max=arr[i+j];
            }
            System.out.print(max + " ");
		}
	}

}
