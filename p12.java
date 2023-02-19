12. Write an Applet program to change the background color randomly


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="DemoMouse.class" height=600 width=500>
</applet>*/
public class DemoMouse extends Applet implements MouseListener,
MouseMotionListener
{
String msg=" ";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void paint(Graphics g)
{
g.drawString(msg,20,20);
}
public void mousePressed(MouseEvent me)
{
setBackground(Color.RED);
repaint();
}
public void mouseClicked(MouseEvent me)
{
setBackground(Color.BLUE);
repaint();
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.GRAY);
repaint();
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.WHITE);
repaint();
}
public void mouseReleased(MouseEvent me)
{
setBackground(Color.MAGENTA);
repaint();
}
public void mouseMoved(MouseEvent me)
{
msg=" mouse moved";
repaint();
}
public void mouseDragged(MouseEvent me)
{
msg=" mouse dragged";
repaint();
}
}
