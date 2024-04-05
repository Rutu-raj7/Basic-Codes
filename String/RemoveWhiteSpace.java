package String;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string ");
        String s=sc.nextLine();

        String r="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(!Character.isWhitespace(c))
            {
                r=r+c;
            }
        }
        System.out.println(r);
    }
}
