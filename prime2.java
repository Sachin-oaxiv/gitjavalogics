import java.util.Scanner;

public class prime2 {
    public static void main(String[]args){
        int inp,i;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
       inp=sc.nextInt();
       for(i=2;i<=inp/2;i++){
        if(inp%i==0){
            flag=true;

        }
       }
       if(!flag)
       System.out.println(inp+"It is a prime number");
        
    else
    System.out.println(inp+"it is not a prime number");
       
    }
    
}
