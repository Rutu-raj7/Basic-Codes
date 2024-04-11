package METHODS;

public class RotationOfPrime {
    public static void main(String[]args)
    {
        rotating(1193);
    }
    public static int count(int n)
    {
        int count=0;
        for(int i=n;i!=0;i/=10)
        {
            count++;
        }
        return count;
    }  
    public static boolean prime(int a){
    int i;
    for(i=2;i<a;i++)
    {
        if (a%i==0)
        {
            break;
        }
    }
    if (i==a)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
    public static void rotating(int num)
    {
        int count=count(num);
        int i;
        for(i=0;i<count;i++)
        {
            if(prime(num))
            {
                int rem=num%10;
                num/=10;
                int size=count-1;
                for(int j=1;j<=size;j++)
                {
                    rem=rem*10;
                }
                num=num+rem;
            }
            else{
                System.out.println("not rotating prime number");
                break;
            }

        }
        if(i==count)
        {
            System.out.println("it is rotating prime number");
        }
        }

    }


