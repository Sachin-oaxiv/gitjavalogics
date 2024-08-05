import java.awt.*;
import java.applet.*;
/*<applet code="colorm" width=3000 height=1000> </applet>*/

public class colorm extends Applet
{ 
       public void paint(Graphics g)
       {
         //draw line
        Color c1=new Color(255,100,100);
       
        g.setColor(c1);
        g.drawLine(40, 40, 300, 300);
        g.drawLine(300,300,40,40);
       }
    }

