package Number;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the it is neon or not");
        int num=sc.nextInt();

        int sq=num*num;
        int add=0;

        for(int i=num;i!=0;i/=10)
        {
            int rem=i%10;

            add=add+rem;
        }
        if(num==add)
        {
            System.out.println("it is neon number");
        }
        else
        {
            System.out.println("not neon number");
        }
    }
}
