import java.util.Scanner;

/**
 * Created by jc321128 on 1/09/17.
 */
public class InputGrades
{
    public static void main(String args[])
    {
        Student[] students = new Student[10];
        boolean running = true;
        String grades = "ABCDF";

        //Init Student Objects
        for(int i = 0; i < 10; i++)
		{
			students[i] = new Student();
			students[i].setIdNumber(i+1);
		}

        Scanner scanner = new Scanner(System.in);

        while (running)
        {
            System.out.print("Enter ID for student #");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Course ID #");
            int courseID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input Grade #");
            String grade = scanner.nextLine();


            if(grades.contains(grade))
            {
            	students[id-1].getCourse(courseID-1).setLetterGrade(grade);
            }
            else
                System.out.println("Invalid Grade");

        }
    }
}
