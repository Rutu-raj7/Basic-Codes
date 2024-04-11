package METHODS;
import java.util.Scanner;
public class Spy 

    {public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number :");
            int num1=sc.nextInt();

            if (sumOfDigit(num1)==sumOfProduct(num1))
            {
                System.out.println("it is a spy number");
            }
            else
            {
                System.out.println("it is not a spy number");
            }
        }
    

    
    public static int sumOfDigit(int num1)
    {
        int sum=0;
        for(int i=num1;i!=0;i/=10)
        {
            sum+=i%10;
           // sum=sum+rem;
        }
        return sum;
    }
    public static int sumOfProduct(int num1)
    {
        int product=1;

        for(int i=num1;i!=0;i/=10)
        {
            int rem=i%10;
            product=product*rem;

        }
        return product;
    }
        
              }


       /*return is the keyword  and controltranverse statement
       return statement will stop the execution of the method frame get destroyed and control is tranversed to the calling method with the value */       