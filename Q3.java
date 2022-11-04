/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
package lab5rav;
import java.awt.*;
import java.applet.*;
/*

<applet code="Q3.class" width="500" height="500">
</applet>
*/
public class Q3 extends Applet{
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.drawLine(50,50,50,200);
        g.drawLine(100,50,100,200);
    }
}
