/**
 * Created by jc321128 on 1/09/17.
 */
public class Student
{
    private static int COURSES = 5;
    private int idNumber;
    private CollegeCourse[] courses = new CollegeCourse[COURSES];

    public Student()
    {
    	//Init CollegeCourse Objects
        for(int i = 0; i < COURSES; i++)
        {
            courses[i] = new CollegeCourse();
        }
    }

    public CollegeCourse getCourse(int index)
    {
        return courses[index];
    }

    public void setCourse(CollegeCourse course, int index)
    {
        courses[index] = course;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
