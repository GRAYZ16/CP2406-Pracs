package blood;

public class BloodData
{
    public static final String O_TYPE = "O";
    public static final String A_TYPE = "A";
    public static final String B_TYPE = "B";
    public static final String AB_TYPE = "AB";
    public static final char RH_PLUS = '+';
    public static final char RH_MINUS = '-';

    private String type;
    private char rhFactor;

    public BloodData()
    {
        this(O_TYPE, RH_PLUS);
    }

    public BloodData(String type, char rhFactor)
    {
        this.type = type;
        this.rhFactor = rhFactor;
    }

    public String getType()
    {
        return type;
    }

    public char getRhFactor()
    {
        return rhFactor;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setRhFactor(char rhFactor)
    {
        this.rhFactor = rhFactor;
    }
}
