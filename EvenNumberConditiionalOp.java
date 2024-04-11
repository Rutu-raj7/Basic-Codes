import java.util.Scanner;
import java.util.Scanner;
class Scan1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

       System.out.println("enter the number");
       int a=in.nextInt();
      // System.out.println("the number is :"+a);

      Scanner k=new Scanner(System.in);
        System.out.println("enter the number");
        int b=k. nextInt();
       // System.out.println("the number is :"+h);

        Scanner l=new Scanner(System.in);
        System.out.println("enter the  number");
        int c=l.nextInt();
       // System.out.println("the number is :"+f);

       int ans= a>b ? a>c? a:c :b>c? b:c;
       System.out.println("the greast number is:"+ans);
        
       String an=ans%2==0? "even number":"odd number";
       System.out.println("the number is :"+an);

    


    }
}