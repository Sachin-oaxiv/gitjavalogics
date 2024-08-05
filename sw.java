import java.io.*;
import java.util.*;

public class sw {
    int day;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
         Integer day=sc.nextInt();
          switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Thuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thersday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
          
            default:
            System.out.println("give a number between 7");
                break;
          }


        

    }
}