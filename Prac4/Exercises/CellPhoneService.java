import java.util.Scanner;

/**
 * Created by jc321128 on 25/08/17.
 */
public class CellPhoneService
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter minutes talked >> ");
        int minutes = scanner.nextInt();
        System.out.print("Please enter number of text messages sent >> ");
        int messages = scanner.nextInt();
        System.out.print("Please enter the amount of data used >> ");
        int data = scanner.nextInt();

        if(minutes < 500 && messages == 0 && data == 0)
            System.out.println("PLAN A - $49");
        else if(minutes < 500 && data == 0)
            System.out.println("Plan B - $55");
        else if(minutes > 500 && data == 0)
            if(messages < 100)
                System.out.println("Plan C - $61 \n- 100 Texts");
            else
                System.out.println("Plan D - $70 \n- Free Texts");
        else if(data != 0)
            if(data < 2000)
                System.out.println("PLAN E $79");
            else
                System.out.println("Plan F $87");
    }


}
