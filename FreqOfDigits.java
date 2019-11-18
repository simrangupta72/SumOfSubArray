
import java.util.Scanner;

public class FreqOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of inputs you want in your array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[n];
		System.out.println("Enter the inputs of your array: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			freq[i]=-1;
		}
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=0;
				}
			}
			if(freq[i]!=0) {
				freq[i]=count;
			}
		}
		for(int i=0;i<n;i++) {
			if(freq[i]!=0) {
				System.out.println(arr[i]+":"+freq[i]);
			}
		}

	}

}
