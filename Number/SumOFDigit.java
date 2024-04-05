package Number;

import java.util.Scanner;

public class SumOFDigit {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the digit to sum");
        int num=sc.nextInt();

        int sum=0;
        for(int i=num;i!=0;i/=10)
        {
            int rem=i%10;

            sum=sum+rem;

        }
        System.out.println(sum);
    }
}
