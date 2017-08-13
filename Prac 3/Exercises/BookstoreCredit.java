import java.util.Scanner;

public class BookstoreCredit
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter your name >> ");
		String name = scanner.nextLine();
		System.out.print("Enter your GPA >> ");
		double gradePointAverage = scanner.nextDouble();
		bookstoreCredit(name, gradePointAverage);
	}

	public static void bookstoreCredit(String name, double GPA)
	{
		System.out.println("Hello, " + name + ". Your GPA gives you $" + (GPA*10) + " bookstore credit.");
	}
}
