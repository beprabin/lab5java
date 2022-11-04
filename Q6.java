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

<applet code="Q6.class" width="500" height="500">
</applet>
*/
public class Q6 extends Applet implements ActionListener{
    Label l1;
    TextField t1;
    Button b1,b2;
    public void init(){
        l1= new Label("Counter");
        t1=new TextField("0",10);
        b1=new Button("Count Up");
        b2=new Button("Count Down");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        add(l1);
        add(t1);
        add(b1);
        add(b2);
    }
    public void actionPerformed(ActionEvent e){
        
        int n=Integer.parseInt(t1.getText());
        if(e.getActionCommand().equals("Count Up")){
            n++;
            t1.setText(""+n);
        }
        if(e.getActionCommand().equals("Count Down")){
            n--;
            t1.setText(""+n);
        }
    }
}
