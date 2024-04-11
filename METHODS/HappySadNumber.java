package METHODS;

public class HappySadNumber {
    public  static int ishappy(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=rem*rem+sum;
            num/=10;
        } 
        return sum;
    }
    public static void main(String[]args)
    {
        int num=56;
        num=ishappy(num);
        while(true)
        {
            if (num==4 || num==1)
            {
                break;
            }
            else
            {
                num=ishappy(num);
            }
        }
        if(num==1)
        {
            System.out.println("it is happy no");
        }
        if(num==4)
        {
            System.out.println("it is sad number");
        }
    }
}
