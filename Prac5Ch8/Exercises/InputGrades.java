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
        int i = 1;
        String grades = "ABCDF";

        //TESTING
        for(Student student : students)
        {
            student = new Student();
            student.setIdNumber(i++);
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
                Student student = students[id];
                CollegeCourse course = student.getCourse(courseID);
                course.setLetterGrade(grade);
            }
            else
                System.out.println("Invalid Grade");

        }
    }
}
