package METHODS;

public class AutomorphicNumber {
    public static int count(int a)
    {
        int count=0;
        for(int i=a;i!=0;i/=10)
        {
            count++;
        }
        return count;
    }
    public static int power(int base,int count)
    {
        int power=1;
        for(int i=1;i<=count;i++)
        {
            power=power*base;
        }
        return power;
    }
    public static void main(String[]aegs)
    {
        int num=76;
        int count=count(num);
        int pow=power(10,count);
        if((num*num)%pow==num)
        {
            System.out.println("atomorphic number");

        }
        else
        {
            System.out.println("it is not automorphic number");
        }

    }
}
 