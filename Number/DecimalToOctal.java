package Number;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to convert in the octal ");
        int num=sc.nextInt();

        String bn="";

        
        for(int i=num;i!=0;i/=8)
        {
         int rem=i%8;

         bn=rem+bn;
        }

        System.out.println(bn);
    }
}
