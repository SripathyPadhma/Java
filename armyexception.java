package exception;

import java.util.Scanner;

public class armyexception {
    public static void main(String[] args) {
        armyexception e=new armyexception();
        try {
            e.getValue(); 
        }
        catch (validInput v) {
            System.out.println(v);
        }
    }
    public void getValue() throws validInput{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<0)
            throw new validInput("Enter valid input(i.e. age>0)");
        else if(age>18)
            System.out.println("Eligible for army selection");
        else
            System.out.println("Not eligible for army selection");
        }
       
    }
    class validInput extends Exception{
        String val;
        validInput(String a){
            this.val=a;
            //System.out.println(a);
        }
        public String toString(){
            return val;
        }
            }
  