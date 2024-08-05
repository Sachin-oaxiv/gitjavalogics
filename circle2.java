import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class circle2 {
    final static float pi= 22/7f;
    public static void main(String[]args)throws NumberFormatException,IOException{
    System.out.println("Enter the radius:");
    InputStreamReader sr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(sr);
    float rad=Float.parseFloat(br.readLine());
    System.out.println(rad*rad*pi);
    System.out.println(rad*2*pi);
}
}
