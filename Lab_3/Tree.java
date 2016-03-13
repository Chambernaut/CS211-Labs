import java.io.*;
import java.util.*;

public class Tree implements Comparable<Tree>
   {
   public Node root;
   public int frequency=0;

   public Tree()
      {
          root = null;
      }

   public int compareTo(Tree object)
   {
       if(frequency-object.frequency>0)
       {
           return 1;
       }

        else if(frequency-object.frequency<0)
        {
           return -1;
        }

        else
        {
            return 0;
        }
   }


   String path="error";
   public String getCode(char letter)
   {
       path = "";
       

       //How do you get the code for the letter? Maybe try a traversal of the tree
       //Track the path along the way and store the current path when you arrive at the right letter

       return path;
   }
}
