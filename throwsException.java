package exception;

public class throwsException  {
   //public static void main(String[] args) throws ArithmeticException, NullPointerException{
    public static void main(String[] args) {
    //int a=5/0;
    throwsException t=new throwsException();
    //t.Str();
    // System.out.println("End of stmnt");
    try{
    t.Str();
    }
    //catch(NullPointerException N){
        catch(stringNull N){
            System.out.println(N);
           // System.out.println(N.getMessage());
        }
   } 
   public void Str() throws stringNull{
    String s=null;
    if(s==null){
       // throw new NullPointerException("the string is null");
       throw new stringNull("string is null");
    }
    else{
        System.out.println(s.length());
    }
    System.out.println(s.length());
   }
}
   class stringNull extends Exception{
   // public char[] getMessage;
    String str1;
    stringNull(String a){
        this.str1=a;
    }
    public String toString(){
        
        return str1;
    }

   }

