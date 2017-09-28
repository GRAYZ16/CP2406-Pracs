package Turner;

public class DemoTurners2
{
	public static void main(String[] args)
	{
		Turner leaf = new Leaf();
		leaf.turn();

		Turner page = new Page();
		page.turn();

		Turner pancake = new Pancake();
		pancake.turn();

		Turner car = new Car();
		car.turn();

		Turner person = new Person();
		person.turn();
	}
}
