package fitness;

public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker tracker = new FitnessTracker("Cricket", 0, "12-01-2015");
        System.out.println(tracker.getActivity());
        System.out.println(tracker.getMinutesParticipated());
        System.out.println(tracker.getDate());
    }
}
