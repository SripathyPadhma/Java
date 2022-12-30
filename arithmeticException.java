package exception;

public class arithmeticException {
    public static void main(String[] args) {
        int a=5,c=0;
        try{
        c=a/0;
        System.out.println(c);
        }
        catch(NullPointerException e1)
        {
            c=123;
            System.out.println("NullPointer Exception"+e1);
 
        }
       /* catch(ArithmeticException e)
        {
            c=123;
            System.out.println("Arithmetic Exception"+e);
        }
         */
        catch(Exception e)
        {
            System.out.println("exception");
        }
        System.out.println(c);
        System.out.println("End of prgm");
        int[] arr={4,5,6,7};
        try{
            System.out.println(arr[4]);
            for(int i=0;i<5;i++)
                System.out.println(arr[i]);
        }
        catch(ArrayIndexOutOfBoundsException A)
        {
            System.out.println("Trying to access value out of index"+A);
            //arr[].append(8,9);
               // arr[4]=8;arr[5]=9;
        }    
        for(int i=0;i<5;i++)
                System.out.println(arr[i]);
    }
}
