package fitness;

import java.util.Date;

public class FitnessTracker
{
    private String activity;
    private int minutesParticipated;
    private String date;

    public FitnessTracker()
    {
        this("running", 0, "01-01-2017");
    }

    public FitnessTracker(String activity, int minutesParticipated, String date)
    {
        this.activity = activity;
        this.minutesParticipated = minutesParticipated;
        this.date = date;
    }

    public String getActivity()
    {
        return activity;
    }

    public int getMinutesParticipated()
    {
        return minutesParticipated;
    }

    public String getDate()
    {
        return date;
    }
}
