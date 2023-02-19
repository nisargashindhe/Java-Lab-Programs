13.Write an Applet program to implement Keyboard events.
  
  
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Key width=600 height=500>
</applet>*/
public class Key extends Applet implements KeyListener
{
int X=40,Y=40;
String msg="KEY EVENTS";
public void init()
{
setBackground(Color.black);
setForeground(Color.yellow);
addKeyListener(this);
}
public void keyPressed(KeyEvent ke)
{
msg="KEY PRESSED";
setBackground(Color.black);
setForeground(Color.blue);
showStatus("KeyPressed");
repaint();
}
public void keyReleased(KeyEvent ke)
{
msg="KEY RELEASED";
setBackground(Color.red);
showStatus("KeyReleased");
}
public void keyTyped(KeyEvent ke)
{
msg="KEY TYPED IS";
msg+=ke.getKeyChar();
setBackground(Color.black);
showStatus("KeyTyped");
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}
