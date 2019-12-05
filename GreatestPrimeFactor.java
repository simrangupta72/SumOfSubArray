import java.util.Scanner;
public class GreatestPrimeFactor {

	   public static void main(String args[]){
	      int number;
	      int arr[]=new int[20];
	      int j=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();

	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            //System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }

}
