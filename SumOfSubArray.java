import java.util.Scanner;
public class SumOfSubArray{
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in your array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of your array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum you want for your SubArray:");
		int k=sc.nextInt();

    int sum=0, count=0;
    		for(int i=0;i<n;i++)
    		{
    			for(int j=i;j<n;j++)
    			{
    				sum=0;
    				for(int m=i;m<=j;m++)
    				{
    					sum=sum+arr[m];
    				}
    				if(sum==k)
    				{
    					System.out.println("Starting index:"+i+",Ending index:"+j);
    					count++;
    				}
    			}
    		}
    		if(count==0) {
    			System.out.println("Such SubArray doesn't exist");
    		}

	}
}
