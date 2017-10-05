import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener
{
	FlowLayout flow = new FlowLayout();
	JComboBox<String> location = new JComboBox<>();
	JComboBox<Integer> room = new JComboBox<>();
	JComboBox<String> meals = new JComboBox<>();

	float[] locationPrice = {600,750,825};
	float[] roomPrice = {0, 75, 150};
	float[] mealPrice = {0, 200};


	JLabel lLabel = new JLabel("Locations");
	JLabel rLabel = new JLabel("Rooms");
	JLabel mLabel = new JLabel("Meals");
	JLabel pLabel = new JLabel("Total Cost: ");
	JTextField price = new JTextField(10);

	public JVacationRental()
	{
		super("History Facts");
		setLayout(flow);

		location.addItemListener(this);
		room.addItemListener(this);
		meals.addItemListener(this);

		add(lLabel);
		location.addItem("<Select>");
		location.addItem("Douglas");
		location.addItem("Kirwan");
		location.addItem("North Ward");
		add(location);

		add(rLabel);
		room.addItem(0);
		room.addItem(1);
		room.addItem(2);
		room.addItem(3);
		add(room);

		add(mLabel);
		meals.addItem("<Select>");
		meals.addItem("No");
		meals.addItem("Yes");
		add(meals);

		add(pLabel);
		price.setText("$ " + 0);
		add(price);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		JFrame frame = new JVacationRental();
		frame.setSize(400, 150);
		frame.setVisible(true);
	}

	private float calcPrice()
	{
		if(location.getSelectedIndex() < 1 || room.getSelectedIndex() < 1 || meals.getSelectedIndex() < 1)
			return 0;
		else
			return locationPrice[location.getSelectedIndex()-1] + roomPrice[room.getSelectedIndex()-1] + mealPrice[meals.getSelectedIndex()-1];
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		price.setText("$ " + calcPrice());
	}
}
