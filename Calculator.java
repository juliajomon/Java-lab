import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator  
{	
	  double a=0,b=0,result = 0;
      char opp;
	
	Calculator(){
		JFrame f = new JFrame("CALCULATOR");
		JTextField t= new JTextField(10);
	    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,beq,bclr,bdec;
	   
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
        bmul = new JButton("*");
        bdiv = new JButton("/");
        badd = new JButton("+");
        bsub = new JButton("-");
        beq = new JButton("=");
        bdec = new JButton(".");
        bclr = new JButton("clear");
        
		f.setLayout(new GridLayout(6,1));
		
		JPanel p1 = new JPanel();
		p1.add(t);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,4));
		p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(badd);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,4));
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(bsub);

		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1,4));
        p4.add(b7);
        p4.add(b8);
        p4.add(b9);
        p4.add(bdiv);
        
        JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(1,4));
        p5.add(bdec);
        p5.add(b0);
        p5.add(beq);
        p5.add(bmul);
        
        JPanel p6 = new JPanel();
        p6.add(bclr);
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);
		
		b0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("0"));
		    
		    }
		});  
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("1"));
		    }
		});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("2"));
		    }
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("3"));
		    }
		});
		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("4"));
		    }
		});
		
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("5"));
		    }
		});
		
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("6"));
		    }
		});
		
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("7"));
		    }
		});
		
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("8"));
		    }
		});
		
		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("9"));
		    }
		});
		
		bdec.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    t.setText(t.getText().concat("."));
		    }
		});
		
		badd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    a=Double.parseDouble(t.getText());
		    opp = '+';
		    t.setText("");
		    
		    }
		});
		
		bsub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    a=Double.parseDouble(t.getText());
		    opp = '-';
		    t.setText("");
		    
		    }
		});
		
		bmul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    a=Double.parseDouble(t.getText());
		    opp = '*';
		    t.setText("");
		    }
		});
		
		bdiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		    a=Double.parseDouble(t.getText());
		    opp = '/';
		    t.setText("");
		    }
		});
	
		beq.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e){
			b=Double.parseDouble(t.getText());
			
		    switch(opp){
		    	case '+':
 					result =a+b;
		    		break;
		    		
		    	case '-':
 					result =a-b;
		    		break;
		    		
		    	case '*':
 					result =a*b;
		    		break;
		    		
		    	case '/':
 					result =a/b;
		    		break;
		    		
		    	default: result=0;
                    break;
		    		
		    }
		     t.setText("="+result);
		   }
		});
		bclr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
		     t.setText(""+result);
		    }
		});
		
		
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	}
    public static void main(String[] args) {
        new Calculator();
    }
}







