import java.io.*;
class MyRunnableThread implements Runnable 
{
public static int myCount=0;
 public MyRunnableThread()
 {

 }

      public void run()
      {
        while(MyRunnableThread.myCount<=10){
            try
            {
                System.out.println("exp1 Thread:"+(++MyRunnableThread.myCount));
                Thread.sleep(6000);
            }
            catch(InterruptedException iex)
            {
                System.out.println("Exception in Thread:"+iex.getMessage());
            }

        }
      }


public class RunMyThread {
    public static void main(String[] args) {
        System.out.println("Start in MainThread....");
        MyRunnableThread mrt=new MyRunnableThread();
        Thread t=new Thread(mrt);
        t.start();
        while(MyRunnableThread.myCount<=10)
        {
            try
            {
                System.out.println("main Thread:"+(++MyRunnableThread.myCount));
                Thread.sleep(6000);
            }
            catch(InterruptedException iex)
            {
                System.out.println("Exception in Thread:"+iex.getMessage());

            }
            System.out.println("end of main Thread....");
        }
    }
}
}