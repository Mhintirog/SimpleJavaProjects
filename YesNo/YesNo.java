import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class YesNo extends JFrame implements ActionListener
{
	JButton b1 = new JButton("YES");
	JButton b2 = new JButton("NO");
	JTextField tf = new JTextField();
	
	public YesNo()
	{
		super("Yes/No");
		setSize(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new GridLayout(3,1));
		add(tf);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()== b1) tf.setText("Yes");
		if (e.getSource()== b2) tf.setText("No");
	}
	
	
	public static void main (String[] args)
	{
		YesNo w = new YesNo();
		
	}
	
}

