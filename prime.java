import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
           boolean flag=false;
           Scanner scan=new Scanner(System.in);
           System.out.println("enter a Number");
           int num=scan.nextInt();
           for(int i=2;i<=num/2;i+=1)
            {
             if(num%i==0)
             {
                flag=true;
                break;
            
             }


           }
           if(!flag)// !flag means flag== false..
            System.out.println(num+"is a prime number");

            else
            System.out.println(num+"is not a prime number");
            
        }
    }

             


    
    

