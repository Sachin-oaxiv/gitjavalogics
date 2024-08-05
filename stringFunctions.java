import java.io.*;
import java.util.*;
public class stringFunctions {
    public static void main(String[] args) {
        String a,b,c,e,f;
        Scanner in=new Scanner(System.in);
        System.out.println("\n Enter a string for concatenation:");
        a=in.nextLine();
        System.out.println("\n Enter a string for Replacement having 's' character:");
        b=in.nextLine();
        System.out.println("\n Enter a string to reverse:");
        c=in.nextLine(); 
        System.out.println("\n Enter a string for compraison:");
        e=in.nextLine();
        System.out.println("\n Enter a string for compare:");
        f=in.nextLine();
        a=a.concat("hello hi everybody");
         System.out.println("\n Concatenated String");
          System.out.println( a);
           System.out.println("\n Replace string");
            System.out.println(b.replace('s','a'));
              System.out.println("\nReverse String");
              StringBuilder a1=new StringBuilder();
              a1.append(c);
              a1=a1.reverse();
              System.out.println(a1);
              int result=e.compareTo(f);
              System.out.println("\nString Comparison Result");
              if (result==0)
                  System.out.println("\nEqual");
                  else
                  System.out.println("Not Equal"+result); 
    }
}

        
        
        


    

