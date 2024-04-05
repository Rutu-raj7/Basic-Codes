package Number;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number for palindrome check");
        int num=sc.nextInt();

        int rev=0;

        for(int i=num;i!=0;i/=10)
        {
            int rem=i%10;

            rev=rev*10+rem;

        }

        if(num==rev)
        {
            System.out.println("it is palindrome number");
        }
        else
        {
            System.out.println("it is not pallindrome number");
        }
    }
}
