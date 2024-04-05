package Pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to print the *  ");
        int n=sc.nextInt();

        for(int i=1;i<n;i++)   // Remove the = sign for delete the one line
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++)   // Remove the = sign for adjust the tip
            {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<n;j++)        // Remove the = sign for adjust the tip
            {
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
