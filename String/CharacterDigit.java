package String;

import java.util.Scanner;

public class CharacterDigit {
 public static void main(String []args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String here");

     String s=sc.nextLine();

     for(int i=0;i<s.length();i++)
     {
         char c=s.charAt(i);

         if(Character.isDigit(c))
         {
             System.out.print(c);
         }
     }
 }
}
