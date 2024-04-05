package Number;

import java.util.Scanner;

public class PallindromeNumberRange {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the stating number");
        int start=sc.nextInt();

        System.out.println("Enter the end number");
        int end=sc.nextInt();

        int count=0;
        
        for(int i=start;i<=end;i++)  //for next number
        {
            int num=i;
            int rev=0;


            for(int j=i;j!=0;j/=10) // for reverse the number
            {
                int rem=j%10;
                 
                rev=rev*10+rem;

            }
            if(num==rev)             // for comparison
            {
                System.out.println("pallindrome Number:_ "+num);
                count++;
            }
        }
        System.out.println(count);
    }
}
