11.Write an Applet program to display Geometrical Figures using objects


import java.applet.*;
import java.awt.*;
/*<applet code="DemoMouse.class" height=600 width=500>
</applet>*/
public class Geo extends Applet
{
public void paint(Graphics g)
{
 g.setColor(Color.GREEN);
 g.drawLine(20,20,100,20);
 g.drawRect(20,50,90,90);
 g.fillRoundRect(130,50,120,70,15,15);
 g.setColor(Color.RED);
 g.drawOval(20,160,160,100);
 g.fillOval(180,160,160,100);
 }
}
