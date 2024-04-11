package METHODS;

public class NumberRotation {
    public static void main(String[]args)
    {int num=123;
        int count=3;
        int n=3;
        count(n);
        rotation(num,count);
        //System.out.println(count);
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
            for(int i=count;i!=0;i--)
            {
                int rem=i%10;
                int temp=i%10;
                for(int j=0;j<size;j++)
                {
                    rem=rem*10 ;
                    temp+rem;
                }
                System.out.println(temp +i);
                
            }
            return num;
        }
    
}
