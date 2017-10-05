import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener
{
	FlowLayout flow = new FlowLayout();
	JButton button = new JButton("Click me");
	int timesClicked = 0;


	public JFrameDisableButton2()
	{
		super("Disable Button");
		setLayout(flow);
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
	}


	public static void main(String[] args)
	{
		JFrame frame = new JFrameDisableButton2();
		frame.setSize(250,100);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		timesClicked++;

		if(timesClicked > 7)
		{
			button.setText("ENOUGH");
			button.setEnabled(false);
		}
	}
}
