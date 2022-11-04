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
import java.awt.event.*;
/*

<applet code="Q5.class" width="500" height="500">
</applet>
*/
public class Q5 extends Applet implements ActionListener{
    TextField t1;
    Button b1;
    public void init(){
        t1=new TextField(10);
        t1.setEditable(false);
        b1=new Button("Click");
        b1.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(t1);
        add(b1);
        
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("Pressed");
    }
}
