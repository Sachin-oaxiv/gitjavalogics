import java.io.FileInputStream; 
  
// Main Class 
public class filein { 
    public static void main(String args[]) 
    { 
        // Reading from Source file 
        try { 
            FileInputStream fileIn 
                = new FileInputStream("sach.JPG/WIN_20240101_10_11_07_Pro.jpg"); 
            int i = 0; 
            while ((i = fileIn.read()) != -1) { 
                System.out.print((char)i); 
            } 
            fileIn.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
}