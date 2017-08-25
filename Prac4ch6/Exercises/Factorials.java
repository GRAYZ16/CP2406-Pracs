/**
 * Created by jc321128 on 25/08/17.
 */
public class Factorials
{
    public static int factorial(int number)
    {
        if(number == 1)
            return  1;
        else
            return number * factorial(number-1);
    }
    public static void main(String[] args)
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(factorial(i));
        }
    }
}
