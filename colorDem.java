import java.awt.*;
import java.applet.*;
/*<applet code="colorDem" width=3000 height=1000> </applet>*/

public class colorDem extends Applet
{ 
       public void paint(Graphics g)
       {
         //draw line
        Color c1=new Color(255,100,100);
        Color c2=new Color(100,255,100);
        Color c3=new Color(100,100,255);

        g.setColor(c1);
        g.drawLine(200, 200, 100, 100);
        g.drawLine(0,100,100,0);

        g.setColor(c2);
        g.drawLine(40, 25,250,180);
        g.drawLine(75, 90, 400,400);

        g.setColor(c3);
        g.drawLine(20,150,400,400);
        g.drawLine(5,250,80,19);

        g.setColor(Color.red);
        g.drawOval(10, 10, 50, 50);
        g.fillOval(70, 90, 140, 100);

        g.setColor(Color.blue);
        g.drawOval(190, 10, 90, 30);
        g.drawRect(10, 10, 60, 50);

        g.setColor(Color.cyan);
        g.fillRect(100, 10, 90, 30);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);

        
       }
}