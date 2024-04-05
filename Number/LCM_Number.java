package Number;

import java.util.Scanner;

public class LCM_Number {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1 number for hcf");
        int num1=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();

        int large=num1>num2? num1:num2;

        while(true)
        {
            if((large%num1==0) && (large%num2==0))
            {
                System.out.println(large);
                break;
            }
            large++;
        }
    }
}
