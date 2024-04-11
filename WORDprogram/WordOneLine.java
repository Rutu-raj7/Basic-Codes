package String.WORDprogram;

import java.util.Scanner;

public class WordOneLine {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String in line");
        String s=sc.nextLine();

        s=s+" "; 
        String w="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if( c!=' ')
            {
                w=w+c;
            }
            else
            {
                System.out.println(w);
                w="";
            }
        }

    }
}
