package Number;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to convert to decimal");
        int num=sc.nextInt();
        
        String bn="";

        for(int i=num;i!=0;i/=2)
        {
            int rem=i%2;

            bn=rem+bn;
        }
        System.out.println(bn);
    }
}
