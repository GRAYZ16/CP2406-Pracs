import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame implements ActionListener
{
	FlowLayout flow = new FlowLayout();
	JButton quote = new JButton("Quote");

	public JBookQuote()
	{
		super("Book Quote");
		setLayout(flow);
		add(quote);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quote.addActionListener(this);
	}


	public static void main(String[] args)
	{
		JFrame frame = new JBookQuote();
		frame.setSize(250,100);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this, "A spectre is haunting Europe – the spectre of communism. All the powers of old Europe have\n" + "entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot,\n" + "French Radicals and German police-spies. ");
	}
}
