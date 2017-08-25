import java.util.Scanner;

/**
 * Created by jc321128 on 25/08/17.
 */
public class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number >> ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
