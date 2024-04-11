package String;

import java.util.Scanner;

public class ChangeCaseProgram {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.next();

        String l="";
        String r="";


        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(Character.isUpperCase(c))
            {
                Character.isLowerCase(c);
                l=l+c;
            }
            else
            {
                r=r+c;
            }
        }
        System.out.println(r);
        System.out.println(l);
    }
}
