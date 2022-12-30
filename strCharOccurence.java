import java.util.Scanner;
public class strCharOccurence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       System.out.println("Enter the String: ");
       String s1=s.nextLine();
       //System.out.println(s1.length());
       char[] ch=s1.toCharArray();
       int count=0;
       System.out.println("Enter the letter to be found:");
       char ch1=s.next().charAt(0);
       for(int i=0;i<s1.length();i++)
       {    if(ch1==ch[i]){
                count++;
            }  }
            System.out.println("No of occurence:"+count);
    }
    
}