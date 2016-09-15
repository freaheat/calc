
package calc;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gui extends JFrame{
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton c, c1, c2, c3, c4, c5;//+ - / *
    JTextField t1;
    String a, b;
    eHandler hendler = new eHandler();
    
    public gui(String s){
        super(s);
        setLayout(new FlowLayout());
        t1 = new JTextField(15);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton ("6");
        b7 = new JButton ("7");
        b8 = new JButton ("8");
        b9 = new JButton ("9");
        c = new JButton ("+");
        c1 = new JButton ("-");
        c2 = new JButton ("/");
        c3 = new JButton("*");
        c4 = new JButton("Очистить");
        c5 = new JButton ("=");
        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(c);
        add(b3);
        add(b4);
        add(b5);
        add(c1);
        add(b6);
        add(b7);
        add(b8);
        add(c3);
        add(b9);
        add(c4);
        add(c2);
        add(c5);
        c4.addActionListener(hendler);
    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                if(e.getSource() == c4){
                    t1.setText(null);
                }
            }catch(Exception ex){  
            }
        }  
    }  
}
