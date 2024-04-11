package METHODS;

public class RotationOfNumber {
    public static void main(String[]args)
    { int num=1234;
        int count=2;
       int ans= rotation(num,count);
       System.out.println(ans);
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
    public static int rotation(int num,int count)
    {
        int size=count(num)-1;
        for(int i=1;i<=count;i++)
        {
            int rem=num%10;
            num/=10;
            for(int j=1;j<=size;j++)
            {
                rem=rem*10;
            }
            num=rem+num;
        }
        return num;
    }
}
