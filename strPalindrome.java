import java.util.*;

public class strPalindrome {
    public static void main(String[] args) {
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        str=sc.next();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse of the string:\n"+rev);
        if(str.equals(rev))
            System.out.println("This is Palindrome");
        else
            System.out.println("This is not a palindrome");
    }
    
}
