package Pattern;

import java.util.Scanner;

public class Butterfly {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of * to print pattern");
        int n=sc.nextInt();

        for(int i=1;i<n;i++)                   // for remove the extra line 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");       // remove the = for space adjustment
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");      // remove the = for space adjustment
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        

        //for lower half

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++ )
            {
                System.out.print("* ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");    // remove the = for space adjustment 
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");   // remove the = for space adjustment
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
                r++;
            }

            System.out.println();
        }
    }
}
