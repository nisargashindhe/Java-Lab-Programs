14.Write an Applet program to implement Keyboard events.
  
  
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Mouse width=600 height=500>
</applet>*/
public class Mouse extends Applet implements
MouseListener,MouseMotionListener
{
int X=30,Y=30;
String msg="MOUSE EVENTS";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
setBackground(Color.black);
setForeground(Color.white);
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.magenta);
showStatus("Mouse Entered");
repaint();
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.red);
showStatus("Mouser Exited");
repaint();
}
public void mousePressed(MouseEvent me)
{
setBackground(Color.yellow);
showStatus("Mouse Pressed");
repaint();
}
public void mouseReleased(MouseEvent me)
{
setBackground(Color.green);
showStatus("Mouse Released");
repaint();
}
public void mouseMoved(MouseEvent me)
{
X=me.getX();
Y=me.getY();
setBackground(Color.blue);
showStatus("Mouse Moved");
repaint();
}
public void mouseDragged(MouseEvent me)
{
msg="MOUSE DRAGGED";
setBackground(Color.pink);
showStatus("Mouse Dragged at("+me.getX()+","+me.getY()+")");
repaint();
}
public void mouseClicked(MouseEvent me)
{
setBackground(Color.green);
showStatus("Mouse Clicked");
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
