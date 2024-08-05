import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="flowLayout" width=300 height=250></applet> */
class SampleFrame extends Frame{
    Checkbox win98,winNT,solaris,mac;
    Button ok;
    SampleFrame(String title)
    {
        super(title);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(250,250);
        setVisible(true);

        win98=new Checkbox("windows98",null,true);
        winNT=new Checkbox("WindowsNT");
        solaris=new Checkbox("Solaris");
        mac=new Checkbox("MACos");
        ok=new Button("Ok");

        MyWindowAdapter adapter=new MyWindowAdapter(this);

        add(win98);
        add(winNT);
        add(solaris);
        add(mac);
        add(ok);
        addWindowListener(adapter);
    }
    public void paint(Graphics g)
    {
        g.drawString("This is in frame window",10,10);

    
    }
}

 class MyWindowAdapter extends WindowAdapter 
 {
    SampleFrame SampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame)
    {
        this.SampleFrame=SampleFrame;

    }
    public void windowclosing(WindowEvent we)
    {
        SampleFrame.setVisible(false);
    }

}
public class flowLayout extends Applet
{
    Frame f;
    public void init()
    {
        f=new SampleFrame("A Frame Window");
        f.setSize(250,250);
        f.setVisible(true);

    }
    public void start()
    {
        f.setVisible(true);
    }
    public void stop()
    {
        f.setVisible(false);
    }
    public void paint(Graphics g)
    {
        g.drawString("This is in Applet window",10,10);
    }
}
    

    

