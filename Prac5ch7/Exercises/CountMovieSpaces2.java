import java.util.Scanner;

/**
 * Created by jc321128 on 1/09/17.
 */
public class CountMovieSpaces2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Movie Quote >> ");
        String quote = scanner.nextLine();
        int numOfSpaces = 0;

        for(char ch : quote.toCharArray())
        {
            if(ch == ' ')
                numOfSpaces++;
        }

        System.out.println(quote + " has " + numOfSpaces + " space characters.");
    }
}
