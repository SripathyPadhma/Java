import java.util.*;
public class sameString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Strings");
        String word1=s.next();
        String word2=s.next();
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        if(word1.equals(word2)){
            System.out.println("They both are equal");
        }
        else{
        System.out.println("Not equal");
        }    
    }
}
