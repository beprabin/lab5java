/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 */
package lab5rav;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Q7 extends Applet{
/*
<applet code="Q7.class" width="500" height="500">
</applet>
*/
    public void paint(Graphics g){
            addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
            Graphics g=getGraphics();
            g.setColor(Color.BLACK);
            g.fillOval(e.getX(), e.getY(), 5, 5);
            }
            public void mouseMoved(MouseEvent e){}
        });
    }
}
