package String;

import java.util.Scanner;
 
public class OvelsPrintOnly {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if( c=='A'|| c=='a' || c=='E'||c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u') 
            {
                System.out.println(c);
            }

        }
    }
}  

