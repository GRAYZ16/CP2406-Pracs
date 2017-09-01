/**
 * Created by jc321128 on 1/09/17.
 */
public class Student
{
    private int idNumber;
    private CollegeCourse[] courses = new CollegeCourse[5];

    public Student()
    {
        //TESTING
        for(CollegeCourse course : courses)
        {
            course = new CollegeCourse("Sub", 1, "Z");
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
