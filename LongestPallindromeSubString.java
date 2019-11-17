
import java.util.*;
public class LongestPallindromeSubString{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.next();
        String longest="";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                if(isPalindrome(str)){
                    if(str.length()>longest.length()){
                        longest = str;
                    }
                }
            }
        }

        System.out.print(longest);
     }

     public static boolean isPalindrome(String s){
         String rev="";

         for(int i=s.length()-1;i>=0;i--){
             rev = rev + s.charAt(i);
         }

        if(rev.equals(s))
            return true;
        else
            return false;
     }
}
