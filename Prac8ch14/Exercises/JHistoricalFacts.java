import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener
{
	String quotes[] = {"Quote1", "Quote2", "Quote3"};
	int index = 0;
	FlowLayout flow = new FlowLayout();
	JLabel quote = new JLabel(quotes[index]);
	JButton button = new JButton("Quote");

	public JHistoricalFacts()
	{
		super("History Facts");
		setLayout(flow);
		add(quote);
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
	}

	public static void main(String[] args)
	{
		JFrame frame = new JHistoricalFacts();
		frame.setSize(250, 100);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		index++;
		index = index % 3;
		quote.setText(quotes[index]);
	}
}
