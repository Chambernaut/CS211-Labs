import java.util.*;

public class Lab_2
{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter sequence for frequency calculation");
    String sequence = scan.nextLine();

    int[] charArray = new int[256];
    ArrayList<String> freqList = new ArrayList<String>();

    for(int a = 0; a < sequence.length(); a++)
    {
      int temp = (int)sequence.charAt(a);
      charArray[temp]++;
    }

    for(int b = 0; b < charArray.length; b++)
    {
      if(charArray[b] > 0)
      {
        String temp = charArray[b] + "." + (char)b;
        freqList.add(temp);
      }
    }

    Collections.sort(freqList);

    for(int c = freqList.size() - 1; c >= 0; c--)
    {
      String[] tempArray = freqList.get(c).split("\\.");
      System.out.print(tempArray[1] + " appeared " + tempArray[0]);
      System.out.println(" times.");
    }

  }
}
