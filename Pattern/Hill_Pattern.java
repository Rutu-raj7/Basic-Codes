package Pattern;

import java.util.Scanner;

public class Hill_Pattern {
    public static void main (String [] aargs)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to print * ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
