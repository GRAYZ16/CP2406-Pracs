public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("Ocean Liner");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines";
   }
}
