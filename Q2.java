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
/*
<applet code="Q2.class" width="500" height="500">
</applet>
*/
public class Q2 extends Applet implements ActionListener
{
    Panel p1,p2;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    public void init(){
        p1=new Panel();
        p2=new Panel();
        l1=new Label("Num 1");
        l2=new Label("Num 2");
        l3=new Label("Result");
        
        
        b1=new Button("add");
        b2=new Button("mul");
        b3=new Button("sub");
        b4=new Button("div");
        
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t3.setEditable(false);
        
        p1.setLayout(new GridLayout(3,3));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        p2.setLayout(new FlowLayout());
        p2.add(b4);
        p2.add(b3);
        p2.add(b2);
        p2.add(b1);
        
        setLayout(new GridLayout(2,1));
        add(p1);
        add(p2);
        
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c;
        if (e.getActionCommand() == "add") {
            c = a + b;
            t3.setText("" + c);
        }
        if (e.getActionCommand() == "mul") {
            c = a * b;
            t3.setText("" + c);
        }
        if (e.getActionCommand() == "sub") {
            c = a - b;
            t3.setText("" + c);
        }
        if (e.getActionCommand() == "div") {
            double z = (double)a/ b;
            t3.setText("" + z);
        }
    }
    
}
