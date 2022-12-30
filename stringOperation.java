import java.util.*;
public class stringOperation {
    public static void main(String[] args) {
       //String to string array conversion
        String s="I am a good person";
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
        //Char to String array
        char[] ch={'a','e','i','o','u'};
        String str=new String(ch);
        System.out.println(str);

        //string array to String
        String[] str1 ={"Sri","is","a","Software Developer"};
        ////String str2=str1.toString();
        ////System.out.println(str2);
        String str2=Arrays.toString(str1);
        System.out.println(str2);
       

        //String to char array
        String str3="welcome";
        char[] ch3=str3.toCharArray();
        for(int j=0;j<ch3.length;j++){
            System.out.println(ch3[j]);
        }
       
    }
    

    
}
