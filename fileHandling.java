package File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//import javax.lang.model.util.ElementScanner14;

public class fileHandling {
    public static void main(String[] args) {
        
        File f=new File("C:\\Users\\Sri Keyan\\OneDrive\\Desktop\\Sri\\abcFile.txt");
        try {
            if(f.createNewFile())
                System.out.println("File created");
            else    
                System.out.println("File not created, already existing ");
        } catch (IOException e) {
                e.printStackTrace();
        }    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        try
            {
                FileWriter fw=new FileWriter(f,true);
            fw.write(s);
            fw.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            
        if(f.exists()){
            System.out.println("Name of the file: "+f.getName());
            System.out.println("Location of file: "+f.getAbsolutePath());
            System.out.println("Is the file readable:"+f.canRead());
            System.out.println("Is the file writable:"+f.canWrite());
            System.out.println("Size of the file: "+f.length());
            
        }
        try {
            //sc1 = new Scanner(f.getAbsoluteFile());
            Scanner sc1 = new Scanner(f);
        
        while(sc1.hasNextLine())
        {
            String str1=sc1.nextLine();
            System.out.println(str1);
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    f.delete();//Deletes the file
    sc.close();
    }}
