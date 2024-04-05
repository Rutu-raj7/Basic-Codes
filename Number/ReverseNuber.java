package Number;

import java.util.Scanner;

public class ReverseNuber {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to reverse number");
        int num=sc.nextInt();

        int rev=0;

        for(int i=num;i!=0;i/=10)
        {
            int rem=i%10;

            rev=rev*10+rem;

          //  System.out.println(rev);
        }
        
        System.out.println(rev);
    }
}
