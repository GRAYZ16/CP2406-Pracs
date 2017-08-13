import java.util.Scanner;

public class NumbersDemo2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("Double Each Number:");
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);

        System.out.println("Each Number plus five:");
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);

        System.out.println("Each Number Squared:");
        displayNumberSquared(a);
        displayNumberSquared(b);

    }

    public static void displayTwiceTheNumber(int number)
    {
        System.out.println(number * 2);
    }

    public static void displayNumberPlusFive(int number)
    {
        System.out.println((number + 5));
    }

    public static void displayNumberSquared(int number)
    {
        System.out.println(number ^ 2);
    }


}
