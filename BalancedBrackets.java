
import java.io.*;

public class BalancedBrackets {

    public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
		System.out.println("Enter the string you want to check:");
		String str = s.nextLine();
		int len=str.length();
		Stack<Character> stack1 = new Stack<Character>();
		for (int i = 0; i < len; i++)
		{
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				stack1.push(str.charAt(i));
			}
			if (!stack1.isEmpty())
			{
				if (str.charAt(i) == ')' && stack1.peek() == '(') {

					stack1.pop();
				} else if (str.charAt(i) == ']' && stack1.peek() == '[') {
					stack1.pop();
				} else if (str.charAt(i) == '}' && stack1.peek() == '{') {
					stack1.pop();
				}
			}

		}

		if (stack1.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}

    }
