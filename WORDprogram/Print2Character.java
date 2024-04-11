package String.WORDprogram;

import java.util.Scanner;

public class Print2Character {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String for practice");

        String s=sc.nextLine();

        String w="";
        s=s+" ";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                System.out.println(w.substring(0,2));
                w="";
                
            }
        }
    }
}
