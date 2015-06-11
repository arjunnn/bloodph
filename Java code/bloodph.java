import java.util.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class bloodph extends JFrame
{
	private JLabel item;

	public bloodph()
	{
		super("BloodpH App");
		setLayout(new FlowLayout());

		item=new JLabel("Enter the values");
		add(item);
	}

public static void main(String [] args) throws Exception
{ 
	bloodph temp=new bloodph();


	JFrame frame = new JFrame("BloodpH");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	temp.setSize(275,275);
	temp.setVisible(true);
    
}
}

    