import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bloodph extends JFrame
{
	private JLabel item;
	JTextField textpH,textpaco2,textHco3;
	String disp = "";
	TextHandler handler = null;
	JButton Submit;
	public bloodph()
	{
		super("BloodpH App");
		setLayout(new FlowLayout());
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		item=new JLabel("Enter the values");
		container.add(item);

		JPanel labels = new JPanel(new GridLayout(0,1));
		add(labels);
		labels.add(new JLabel("pH: "));
		textpH = new JTextField(4);
		container.add(textpH);
		labels.add(new JLabel("paCO2: "));
		textpaco2 = new JTextField(4);
		add(textpaco2);
		labels.add(new JLabel("HCO3: "));
		textHco3 = new JTextField(4);
		container.add(textHco3);
		Submit = new JButton("Submit");
		container.add(Submit);
		handler=new TextHandler();
		textpH.addActionListener(handler);
		textpaco2.addActionListener(handler);
		textHco3.addActionListener(handler);

	}
	private class TextHandler implements ActionListener 
	{
		
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == textpH) 
			{
				 disp = "pH : " + e.getActionCommand();
			} else if (e.getSource() == textpaco2) 
			{
				 disp = "PaCO2 : " + e.getActionCommand();
			} else if (e.getSource() == textHco3) 
			{
				 disp = "HCO3 : " + e.getActionCommand();
			}
				JOptionPane.showMessageDialog(null, disp);
		}
	}

	public static void main(String [] args) throws Exception
	{ 
		bloodph temp=new bloodph();

		JFrame frame = new JFrame("BloodpH");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temp.setSize(275,300);
		temp.setVisible(true);
	}
}
/*
double pHvalue = Double.parseDouble(textpH.getText());
		double paCO2value = Double.parseDouble(textpaco2.getText());
		double HCO3value = Double.parseDouble(textHco3.getText());
		preliminarycheck pcheck = new preliminarycheck();
		pcheck.checkpostrouter(pHvalue,paCO2value,HCO3value);
*/
    