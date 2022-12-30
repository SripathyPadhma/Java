public class strVowel {
    public static void main(String[] args) {
        String str="Hello world";
        String str2=str.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(str2);
    }
    
}
