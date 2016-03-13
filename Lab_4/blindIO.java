import java.util.*;
import java.io.*;

public class blindIO
{
    public blindIO()
    {

    }
    public String[] load(String path)
    {
        ArrayList<String> words = new ArrayList<String>();
        String line;
        BufferedReader tiger = null;
        try
        {
            tiger = new BufferedReader(new FileReader(path));
        }
        catch(FileNotFoundException e)
        {
            System.exit(0);
        }

        try
        {
            while((line = tiger.readLine()) != null)
            {
                words.add(line);
            }
        }
        catch(IOException f)
        {
            System.exit(0);
        }
        String[] wordsReturn = new String[words.size()];
        wordsReturn = words.toArray(wordsReturn);

        return wordsReturn;
    }
}
