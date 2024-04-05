package Number;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String []aargs)

    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the digit for product");
        int num=sc.nextInt();

        int pro=1;
        int sum=0;

        for(int i=num;i!=0;i/=10)
        {
            int rem=i%10;

         pro=pro*rem;
         
        }
        System.out.println(pro);
    }
}
