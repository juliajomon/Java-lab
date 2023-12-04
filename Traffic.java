import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ActionListener
{
    JRadioButton r1 ;
    JRadioButton r2 ;
    JRadioButton r3 ;

    Color c_red;
    Color c_yellow;
    Color c_green;

    public TrafficLight()
    {
        setBounds(0,0,640,480);
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("YELLOW");
        r3 = new JRadioButton("GREEN");

        r1.setSelected(true);
        c_red = Color.red;
        c_yellow = getBackground();
        c_green = getBackground();

        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);

        add(r1);
        add(r2);
        add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected()==true)
        {
            c_red = Color.red;
            c_yellow = getBackground();
            c_green = getBackground(); 
        }
        else if(r2.isSelected()==true)
        {
            c_yellow = Color.yellow;
            c_red = getBackground();
            c_green = getBackground(); 
        }
        else if(r3.isSelected()==true)
        {
            c_green = Color.green;
            c_red = getBackground();
            c_yellow = getBackground(); 
        }
        repaint();
    }
    public void  paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 50, 50, 50);

        g.setColor(c_red);
        g.fillOval(50, 50, 50, 50);
        g.setColor(c_yellow);
        g.fillOval(150, 50, 50, 50);
        g.setColor(c_green);
        g.fillOval(250, 50, 50, 50);
    }
}

class Traffic{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(640,480);
        f.setLayout(null);
        TrafficLight t = new TrafficLight();
        f.add(t);
        f.setVisible(true);
    }
}
