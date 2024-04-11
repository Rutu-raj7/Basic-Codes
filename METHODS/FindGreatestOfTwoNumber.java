package METHODS;

public class FindGreatestOfTwoNumber {

    public static void main(String[]args)
    {
        big(20,30);
        asciiValue('a');
        character(85);
        evenNumber(25);
        primeNumber(5);
        rangeOfValue(92,115);
    }
     public static void big(int num1,int num2)
    {
        int big=num1>num2? num1:num2;
        System.out.println("the greastestof two number is "+big);
    }

    public static void asciiValue(char c)
    {
        int i=c;
        System.out.println(i);
    } 

    public static void character(int num)
    {
        char c= (char)num;
        System.out.println("the ascii value is "+c);
    }
    public static void evenNumber(int num)
    {
        if(num%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("it is not even number");
        }
    } public static void primeNumber(int num)
    {
        int i;
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                break;
            }
        }
        if (i==num)
        {
            System.out.println("it is a prime number");
        }
        else 
        {
            System.out.println("it is a not prime number");
    }
    }
    public static void rangeOfValue(int num1,int num2)
    {         int i;
         for (i=num1;i<=num2;i++)
         {  char c=(char)i;
             System.out.println(c);
         }
    }
}
