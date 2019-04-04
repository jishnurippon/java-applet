/*<applet code="Calculator" width=300 height=200>
</applet>*/
import java.awt.*;
import java.awt.event.*;
public class Calculator extends java.applet.Applet implements ActionListener
{
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	TextField t3 = new TextField(10);
	Label l1 = new Label("First number: ");
	Label l2 = new Label("Second number: ");
	Label l3 = new Label("Sum is: ");
	Button b = new Button("ADD");
	public void init()
	{
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b);
		b.addActionListener(this);
	}
	public void ActionListener(ActionEvent e)
	{
		if(e.getSource() ==  b)
		{
			int n1 = Integer.parseInt(t1.getText());
			int n2 = Integer.parseInt(t2.getText());
			t3.setText("  " + (n1 + n2));
		}
	}
} 
