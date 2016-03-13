import java.util.*;
import java.io.*;

class LengthComparator implements Comparator<String>
{
    public int compare(String a, String b)
    {
	       if(a.length() > b.length())
           {
               return 1;
           }

           if(a.length() < b.length())
           {
               return -1;
           }

           else
           {
               return 0;
           }
    }
}

public class Lab_4
{
    public static void main(String args[])
    {
        blindIO eye = new blindIO();
        String[] words = eye.load("dictionary.txt");
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        char[] inputString = inp.toCharArray();
        int topTen = 0;

        Arrays.sort(words, new LengthComparator());

        for(int a = words.length-1; a >= 0; a--)
        {
            char[] test = words[a].toCharArray();
            int count = 0;
            for(int b = 0; b < inputString.length; b++)
            {
                    for(int c = 0; c < test.length; c++)
                    {
                        if(inputString[b] == test[c])
                        {
                            test[c] = '*';
                            count++;
                            break;
                        }
                    }
            }
            if(count == test.length && topTen < 10)
            {
                System.out.println(words[a]);
                topTen++;
            }
        }
    }
}
