package String;

import java.util.Scanner;

public class CharacterUpperCase {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String ");
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++)      // do not use the = sign it create Iob
        {
            char c=s.charAt(i);

            if(Character.isUpperCase(c))
            {
                System.out.print(c);
            }
        }
    }
}
