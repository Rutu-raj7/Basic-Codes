package Number;

import java.util.Scanner;

public class PowerOfNumbr {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The base  for power");
        int base=sc.nextInt();

        System.out.println("Enter the raise for power");
        int raise=sc.nextInt();

        int power=1;

        for(int i=raise;i!=0;i--)
        {
            power=power*base;
        }

        System.out.println(power);
    }
}
