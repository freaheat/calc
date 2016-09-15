package calc;

import javax.swing.JFrame;

public class Calc {
    public static void main(String[] args) {
        gui r = new gui("calc");
        r.setVisible(true);
        r.setSize(205,250);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setLocationRelativeTo(null);
        r.setResizable(false);
    }
    
}
