package String;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class CharacterSeprate {
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string ");
       String s=sc.next();

       for(int i=0;i<s.length();i++)
       {
           char c =s.charAt(i);

           System.out.println( c );
       }

   } 
}
