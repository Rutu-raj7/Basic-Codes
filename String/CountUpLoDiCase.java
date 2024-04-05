package String;

import java.util.Scanner;

public class CountUpLoDiCase {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String for count UpperCase,LowerCase,Digit");
        String s=sc.nextLine();

        int Ucount=0;
        int Lcount=0;
        int Dcount=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(Character.isUpperCase(c))
            {
                System.out.print(c);
                Ucount++;  
            }
            if(Character.isLowerCase(c))
            {
                System.out.print(c);
                Lcount++;

            }
            if(Character.isDigit(c))
            {
                System.out.print(c);
                Dcount++;
            }
           
        }
        System.out.println();
        System.out.println(Ucount);
        System.out.println(Lcount);
        System.out.println(Dcount);
    }
}
