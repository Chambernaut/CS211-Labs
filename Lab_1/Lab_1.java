import java.util.Random;

public class Lab_1
{
  public static void main(String args [])
  {
      Random generator = new Random();
      int counter = 1;

      for(int a = 0; a <= 1000000; a++)
      {
        int firstBreak = generator.nextInt((99) + 1) + 1;
        if(firstBreak != 50)
        {
            int pieceA = 100 - firstBreak;
            int pieceB = firstBreak;
            int pieceC;

            if(pieceA > pieceB)
            {
                int secondBreak = generator.nextInt((pieceA) + 1) + 1;
                pieceA = pieceA - secondBreak;
                pieceC = secondBreak;
            }

            else
            {
                int secondBreak = generator.nextInt((pieceB) + 1) + 1;
                pieceB = pieceB - secondBreak;
                pieceC = secondBreak;
            }

            if(pieceA < 50 && pieceB < 50 && pieceC < 50)
            {
                counter++;
            }
        }
      }

      double chance = (double)counter/1000000;
      System.out.println("The likelihood is: " + chance*100 + "%");
  }
}
