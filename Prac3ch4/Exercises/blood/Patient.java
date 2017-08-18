package blood;

public class Patient
{
    private int ID;
    private int age;
    private BloodData bloodData;

    public Patient(int id, int age, BloodData bloodData)
    {
        this.ID = id;
        this.age = age;
        this.bloodData = bloodData;
    }

    public Patient()
    {
        this(0, 0, new BloodData(BloodData.O_TYPE, BloodData.RH_PLUS));
    }

    public int getID()
    {
        return ID;
    }

    public int getAge()
    {
        return age;
    }

    public BloodData getBloodData()
    {
        return bloodData;
    }
}
