import java.io.*;
public class File
{
public static void main(String[] args) 
{
File file = new File("SampleTextFile.txt");
BufferedInputStream bin = null;
try
{
FileInputStream fin = new FileInputStream(file);
bin = new BufferedInputStream(fin);
while( bin.available() > 0 )
System.out.print((char)bin.read());
}
catch(FileNotFoundException e)
{
System.out.println("File not found" + e);
}
catch(IOException ioe)
{
System.out.println("Exception while reading the file " + ioe);
}
finally
 {
    
}
{
try{
if(bin != null)
bin.close();
}catch(IOException ioe)
{
System.out.println("Error while closing the stream : " + ioe);
}
}
}
}
