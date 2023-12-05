import javax.swing.*;
import java.awt.event.*;

class cal implements ActionListener
{
    JFrame f;
    JTextField t;

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,beq,bclr,bdec;
    static double a=0,b=0,result = 0;
    static int operator = 0;
    public cal()
    {
        f = new JFrame("CALCULATOR");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bmul = new JButton("x");
        bdiv = new JButton("/");
        badd = new JButton("+");
        bsub = new JButton("-");
        beq = new JButton("=");
        bdec = new JButton("1");
        bclr = new JButton("clear");

        t.setBounds(30,40,280,30);

        b1.setBounds(40,100,50,40);
        b2.setBounds(110,100,50,40);
        b3.setBounds(180,100,50,40);
        badd.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bsub.setBounds(250,170,50,40);

        b7.setBounds(40,240,50,40);
        b8.setBounds(110,240,50,40);
        b9.setBounds(180,240,50,40);
        bdiv.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        bmul.setBounds(250,310,50,40);

        bclr.setBounds(40,380,200,40);

        f.add(t);

        f.add(b1);
        f.add(b2);
        /*f.add(t);
        f.add(t);

        f.add(t);
        f.add(t);
        f.add(t);
        f.add(t);

        f.add(t);
        f.add(t);
        f.add(t);
        f.add(t);*/

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b1.addActionListener(this);//add to all button


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
            t.setText(t.getText().concat("9"));//apply to all

        if(e.getSource() == badd)
        {   a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }//add to opp and increament operator
        if(e.getSource() == beq){
            b=Double.parseDouble(t.getText());
            switch (operator) {
                case 1:
                    result = a+b;
                    break;//add all case

            
                default: result=0;
                    break;
            }
            t.setText(""+result);
        }
        if(e.getSource() == bclr){
            t.setText("");
        }

    }
}
/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        new cal();
    }
}
