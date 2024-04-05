package String;

import java.util.Scanner;

public class CharacterLowerCase {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string for lower case print");
        String s=sc.next();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(Character.isLowerCase(c))
            {
                System.out.print(c);
            }
        }
        
    }
}
