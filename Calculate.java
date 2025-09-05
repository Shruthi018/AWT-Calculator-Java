import java.awt.*;
import java.awt.event.*;
public class Calculate implements ActionListener {
	Label label;
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,x,div,plus,minus,eq,clear;
	String str="0";
	char op;
	int i,num1,num2,res;
	
	Calculate(){
		Frame frame= new Frame("Calculator");
		label = new Label("0");
		label.setBounds(50, 30, 400, 70);
		
		btn1 = new Button("1");
		btn1.setBounds(0, 100, 100, 75);
		btn1.addActionListener(this);
		btn2 = new Button("2");
		btn2.setBounds(100, 100, 100, 75);
		btn2.addActionListener(this);
		btn3 = new Button("3");
		btn3.setBounds(200, 100, 100, 75);
		btn3.addActionListener(this);
		plus = new Button("+");
		plus.setBounds(300, 100, 100, 75);
		plus.addActionListener(this);
			
		btn4 = new Button("4");
		btn4.setBounds(0, 175, 100, 75);
		btn4.addActionListener(this);
		btn5 = new Button("5");
		btn5.setBounds(100, 175, 100, 75);
		btn5.addActionListener(this);
		btn6 = new Button("6");
		btn6.setBounds(200, 175, 100, 75);
		btn6.addActionListener(this);
		minus = new Button("-");
		minus.setBounds(300, 175, 100, 75);
		minus.addActionListener(this);
		
		btn7 = new Button("7");
		btn7.setBounds(0, 250, 100, 75);
		btn7.addActionListener(this);
		btn8 = new Button("8");
		btn8.setBounds(100, 250, 100, 75);
		btn8.addActionListener(this);
		btn9 = new Button("9");
		btn9.setBounds(200, 250, 100, 75);
		btn9.addActionListener(this);
		x = new Button("X");
		x.setBounds(300, 250, 100, 75);
		x.addActionListener(this);
		
		clear = new Button("C");
		clear.setBounds(0, 325, 100, 75);
		clear.addActionListener(this);
		btn0 = new Button("0");
		btn0.setBounds(100, 325, 100, 75);
		btn0.addActionListener(this);
	    div = new Button("/");
		div.setBounds(200, 325, 100, 75);
		div.addActionListener(this);
		eq = new Button("=");
		eq.setBounds(300, 325, 100, 75);
		eq.addActionListener(this);
		
		frame.add(label);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(plus);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(minus);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(x);
		frame.add(btn0);
		frame.add(clear);
		frame.add(div);
		frame.add(eq);
			
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setLayout(null);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
		
		 public void actionPerformed(ActionEvent e) {
			 
				if(e.getSource()==btn1) {
					str+=1;
				}
				else if(e.getSource()==btn2) {
					str+=2;
				}
				else if(e.getSource()==btn3) {
					str+=3;
				}
				else if(e.getSource()==btn4) {
					str+=4;
				}
				else if(e.getSource()==btn5) {
					str+=5;
				}
				else if(e.getSource()==btn6) {
					str+=6;
				}
				else if(e.getSource()==btn7) {
					str+=7;
				}
				else if(e.getSource()==btn8) {
					str+=8;
				}
				else if(e.getSource()==btn9) {
					str+=9;
				}
				else if(e.getSource()==btn0) {
					str+=0;
				}
				else if(e.getSource()==clear) {
					str="0";
				}
				if(e.getSource()==plus) {
					str+="+";
				}
				else if(e.getSource()==minus) {
					str+="-";
				}
				else if(e.getSource()==x) {
					str+="x";
				}
				else if(e.getSource()==div) {
					str+="/";
				}
				label.setText(str);
           
            if(e.getSource()==eq) {
            	try {
            		char arr[]=str.toCharArray();
        			for(i=0;i<arr.length;i++) {
        				if(!Character.isDigit(arr[i])) {
        					op=arr[i];
        					break;
        				}
        			}
        			num1=Integer.parseInt(str.substring(0,i));
        			num2=Integer.parseInt(str.substring(i+1));
            		switch(op) {
                	case '+':
                		res=num1+num2;
                		break;
                	case '-':
                		res=num1-num2;
                		break;
                	case 'x':
                		res=num1*num2;
                		break;
                	case '/':
                		res=num1/num2;
                		break;
                	}
            		label.setText(String.valueOf(res));
                    str = String.valueOf(res);
              } 
            catch (Exception ex) {
                label.setText("Error");
              }
			}
		 }
	
	public static void main(String[] args) {
		new Calculate();
	}
}
