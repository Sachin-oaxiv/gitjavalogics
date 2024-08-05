import java.util.Calendar;

public class cal {
  public static void main(String[]args){
    Calendar n=Calendar.getInstance();
    System.out.println("current date is"+n.get(Calendar.DATE));
    System.out.println("Current Month is"+n.get(Calendar.MONTH));
    System.out.println("Current Year is"+n.get(Calendar.YEAR));
    System.out.println("Current 12 Hours format is"+n.get(Calendar.HOUR));
    System.out.println("Current 24 Hours format is"+n.get(Calendar.HOUR_OF_DAY));
    System.out.println("Current Min is"+n.get(Calendar.MINUTE));
    System.out.println("Current sec is"+n.get(Calendar.SECOND));
    System.out.println("Current Ms is"+n.get(Calendar.MILLISECOND));
System.out.println("Current full date and time is"+
             n.get(Calendar.YEAR)+"-"+
              n.get(Calendar.MONTH)+"-"+
               n.get(Calendar.DATE)+"-"+
                n.get(Calendar.HOUR)+":"+
                 n.get(Calendar.MINUTE)+":"+
                  n.get(Calendar.SECOND)+":"+
                   n.get(Calendar.MILLISECOND)+".");
                    
  }
    
}
