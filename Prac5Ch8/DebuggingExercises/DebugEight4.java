// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      String message = "The words in reverse order are\n";
      String prompt = "Enter any word\n" +
                      "Enter " + STOP +  " when you want to stop";
       String prompt2 ="Enter another word\n" +
                       "Enter " + STOP + " when you want to stop";

      entry = JOptionPane.showInputDialog(null, prompt);
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         x++;
         entry = JOptionPane.showInputDialog(null, prompt2);
      }
      for(y = 99; y >= 0; y--)
      {
          if(array[y] != null)
          {
              message += array[y];
              message += "\n";
          }
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

