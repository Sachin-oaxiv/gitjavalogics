import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Circle
{
    final static float pi=3.14f;
    public static void main(String args[])throws NumberFormatException,IOException
    {
        System.out.println("Enter the radius of a circle");
        InputStreamReader io=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(io);
        float radius=Float.parseFloat(br.readLine());
        System.out.println("Area of circle is:"+radius*radius*pi);
        System.out.println("circum of circle is"+2*radius*pi);
    }
}