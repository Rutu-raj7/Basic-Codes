package String;

import java.util.Scanner;

public class StartRwith {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to print the word with R ");

        String s=sc.nextLine();
        String w="";
        s=s+w;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c!=' ')
            {
                w=w+c;

            }
            else
            {
               if(w.startsWith("R"))
               {
                   System.out.println(w);
               }

                w="";

            }
        }
    }
}
