package exception;

public class exception2 {
    public static void main(String[] args) {
        String s=null;
        try{
        System.out.println(s.length());
        }
        catch(NullPointerException N){
            if(s==null)
                s="";
        }System.out.println(s.length());
        String a="sri";
        try{
            int i=Integer.parseInt(a); 
        }
        catch(NumberFormatException c)
        {
            System.out.println("can't convert str into int");
        }
        finally{
            System.exit(0);
            System.out.println("finally blk - clean");
        }
        

    }
    
}
