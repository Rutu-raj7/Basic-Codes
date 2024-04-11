package METHODS;

import javax.lang.model.util.ElementScanner6;

public class RotationPrimeNumber {
    public  static int count(int n)
    {
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        return count;
    }
    public static boolean Prime(int a)
    {
        int i;
        for( i=2;i<a;i++)
        {
            if(a%i==0)
            {
                break;
            }
        }
        if(i==a)
    {
        return true;
    }
    {
        return false;
    }
    }
    public static void rotation(int num)
    {
        int count=count(num);
        int j;
        for(j=0;j<count;j++)
        {
            if (Prime(num))
            {
                int rem=num%10;
                num/=10;
                int size=count-1;
            
            for(int i=size;i>0;i--)
            {
                rem=rem*10;
            }
            num=num+rem;
        }
            else
            {
                System.out.println("it is not prime");
                break;
            }

            }
        
        if(j==count) 
        {
            System.out.println("it is rotational  prime number");
        }
        }
        public static void main(String[]args)
        {
            rotation(1193);
        }
    }

