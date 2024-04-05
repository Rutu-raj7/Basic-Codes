package String;

import java.util.Scanner;

public class DigitFristCharaLast {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String with number ");
        String s=sc.nextLine();

        String d="";
        String r="";

        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(Character.isDigit(c))
            {
                d=d+c;
            }
            else
            {
                r=r+c;
            }

            
        }
        System.out.println(d+r);
    }
}
