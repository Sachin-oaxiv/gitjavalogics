import java.io.FileOutputStream; 
  
// Main class 
public class fileout { 
    public static void main(String args[]) 
    { 
        // Writing in file gfg.txt 
        try { 
            FileOutputStream fileOut 
                = new FileOutputStream("sach.JPG/WIN_20240101_10_11_07_Pro.jpg"); 
            String s = "hi sachin how are you im fine"; 
  
            // converting string into byte array 
            byte b[] = s.getBytes(); 
            fileOut.write(b); 
            fileOut.close(); 
            System.out.println( 
                "file is successfully updated!!"); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
}