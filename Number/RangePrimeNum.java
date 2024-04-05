package Number;

import java.util.Scanner;

public class RangePrimeNum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number");
        int start=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int end=sc.nextInt();

        for(int i=start;i<=end;i++)
        {
            int num=i;
            int j;

            for(j=2;j<num;j++)
            {
                if(num%j==0)
                {
                    break;
                }
            }
            if(j==num)
            {
                System.out.println("it is prime nu--->>"+num);
            }
        }

    }
}
