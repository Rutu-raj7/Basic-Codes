package String;

import java.util.Scanner;

public class UpperCaseRPint {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string for print only upper case R  ");
        String s=sc.next();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

           
            if( Character.isUpperCase(c) && (c=='R'|| c=='r'))// print only the UpperCase="R"
            {
                System.out.println(c);
            }
        }
    }
}
