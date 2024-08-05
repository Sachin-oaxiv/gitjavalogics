import java.util.*;
public class sortnew {
    public static void main(String[]args){
        int count;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements to sort");
        count=scan.nextInt();
        int num[]=new int[count];
        System.out.println("Enter"+ count +"the Numbers:");
        for(int i=0;i<count;i++)
            num[i]=scan.nextInt();
            scan.close();
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));
            
    }
    
}
