package Pattern;

import java.util.Scanner;

public class DiamondNumber1 {
    public static void main(String [] aargs)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to print *  ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
            System.out.print("  ");
            }
        
            for(int j=1;j<i;j++)
            {
                System.out.print("1 ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("2 ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=i;j<n;j++)
            {
                System.out.print("1 ");
            }

            for(int j=i;j<=n;j++)
            {
                System.out.print("2 ");
            }

            System.out.println();
        }
    }
}
