import java.util.Scanner;

/**
 * Created by jc321128 on 1/09/17.
 */
public class ValidatePassword
{
    public static void main(String args[])
    {
        boolean valid = false;

        while (!valid)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a password with at least two uppercase letters, two lowercase letters and two digits");
            String password = scanner.nextLine();

            int digits = 0;
            int lowercaseLetters = 0;
            int uppercaseLetters = 0;

            for(char ch : password.toCharArray())
            {
                if(Character.isDigit(ch))
                    digits++;
                else if(Character.isUpperCase(ch))
                    uppercaseLetters++;
                else if(Character.isLowerCase(ch))
                    lowercaseLetters++;
            }

            if(digits >= 2 && uppercaseLetters >= 2 && lowercaseLetters >= 2)
                valid = true;
            else
            {
                System.out.println("Invalid Password, Please try again");

                if(digits < 2)
                    System.out.println("Incorrect amount of digits");
                else if(uppercaseLetters < 2)
                    System.out.println("Incorrect amount of uppercase letters");
                else if(lowercaseLetters < 2)
                    System.out.println("Incorrect amount of lowercase letters");
            }
        }

        System.out.println("Valid Password");
    }
}
