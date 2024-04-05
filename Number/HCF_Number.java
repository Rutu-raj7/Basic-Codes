package Number;

import java.util.Scanner;

public class HCF_Number {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1 for HCF");
        int num1=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();

        int small=  num1>num2 ? num1:num2;

        while(true)
        {
            if((num1%small==0)&& (num2%small==0))
            {
                System.out.println(small);
                break;
            }
            small--;
        }
    }
}
