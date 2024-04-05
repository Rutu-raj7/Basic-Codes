package Pattern;

import java.util.Scanner;

public class IncreasingDecreasingTri {
public static void main(String []args)
{
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number to print inc.dec. triangle");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)      //increasing triangle
        {
        System.out.print("  ");
        }
    
    for(int j=i;j<=n;j++)
    {
        System.out.print("* ");   // Decreasing trianglep
    }   
        System.out.println();
   }
 }
}
