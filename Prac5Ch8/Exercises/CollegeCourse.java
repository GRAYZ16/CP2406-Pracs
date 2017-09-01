/**
 * Created by jc321128 on 1/09/17.
 */
public class CollegeCourse
{
    private String courseID;
    private int creditHours;
    private String letterGrade;


    public CollegeCourse(String courseID, int creditHours, String letterGrade)
    {
        this.courseID = courseID;
        this.creditHours = creditHours;
        this.letterGrade = letterGrade;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
}
