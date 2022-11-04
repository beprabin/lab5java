/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
package lab5rav;
import java.awt.*;
import java.applet.*;
/*

<applet code="Q4.class" width="500" height="500">
</applet>
*/
public class Q4 extends Applet{ 
    public void paint(Graphics g){
      g.drawLine(10,10,340,10);
      g.drawString("Applet",160,35);
      g.drawLine(10,50,340,50);
      g.drawString("Rectangle",10,80);
      g.drawRect(120, 67, 15, 15);
      g.drawString("Filled Rectangle",10,120);
      g.fillRect(120, 107, 15, 15);
      g.drawString("Arc",10,160);
      g.drawArc(120, 147, 15, 15,0,260);
    }
    
}
