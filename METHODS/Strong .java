
    import java.util.Scanner;
    class Strong
    {
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number :");
            int num=sc.nextInt();
            if(sumOfFactor(num)==num)
            {
                System.out.println("it is a strong number");
            }

            
        }
        public static int sumOfFactor (int num)
        {
          int sum=0;  
            for (int i=num;i!=0;i/=10)
            {
                int rem=i%10;
                 
               // int sum=1;
                int fact=1;
                for(int j=1;j<=rem;j++)
                {
                    fact=fact*j;
                    sum=sum+fact;
                    System.out.println("sum");
                }
                return sum;
                

            }
        
        }

        
    }