import java.util.*;
public class stringReverse {
    public static void main(String[] args) {
        String s1="good morning";
        char[] ch=s1.toCharArray();
        StringBuilder s2=new StringBuilder();
        for(int i=(s1.length()-1);i>=0;i--)
        {            s2.append(s1.charAt(i));
        }
        System.out.println("String: "+s1);
        System.out.println("Reverse of the string:"+s2);
    }
}
