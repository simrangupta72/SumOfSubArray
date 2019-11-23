
import java.util.Scanner;

public class CountMaxGreaterThanK {

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
		int count=0;
		for(int i=0;i<n;i++) {

			for(int j=i;j<n;j++) {
				max=0;
				for(int m=i;m<=j;m++) {
					if(arr[m]>max) {
						max=arr[m];
					}
					if(max>k) {
						count++;
					}
				}

			}
		}
		System.out.println(count);
	}

}
