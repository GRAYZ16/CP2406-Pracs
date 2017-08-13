import java.util.Scanner;

public class Percentages2
{
	public static void main(String[] args)
	{
		double a;
		double b;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number >> ");
		a = scanner.nextDouble();
		System.out.print("Enter another number >> ");
		b = scanner.nextDouble();
		computePercent(a,b);
	}

	public static void computePercent(double a, double b)
	{
		System.out.println(a + " is " + (a/b*100) + "% of " + b);
	}
}
