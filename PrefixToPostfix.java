import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in prefix order:");
		String str = sc.next();
		Stack<String> st = new Stack<String>();
		String final = "";
		String st1 = "";
		String st2 = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
			{
				String s = "";
				s = s + str.charAt(i);
				st.push(s);
			}
			else
			{
				if (!st.empty())
				{
					st1 = st.pop();
				}
				if (!st.empty())
				{
					st2 = st.pop();
				}
				final = st1 + st2 + str.charAt(i);
				st.push(final);
			}
		}
		System.out.println("The string in postfix order is:");
		System.out.println(st.pop());
	}

}
