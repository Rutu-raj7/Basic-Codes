package opps.exception_handling;
import java.util.Scanner;
public class Handling {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the size of the array ");
           int size=s.nextInt();
          int [] a=new int [size];
          int i;

          try{
          for ( i=0;i<a.length;i++)
          {
              a[i]=s.nextInt();
              //System.out.println(a[i]);
          }
          

           System.out.println("enter the 1st element in the array");
           int i1=s.nextInt();

            System.out.println("enter the 2nd element in the array");
           int i2=s.nextInt();
           
           int ans=a[i1] /a[i2];
        

           System.out.println("the ans of the expression is "+ans);

        }
        catch(ArithmeticException e)
        {
            System.out.println("dont divide the number by the 0");
        }
        catch( IndexOutOfBoundsException h)
        {
            System.out.println("put the element which is inserted in the array");
        }
        finally
        {
            System.out.println("when we use the finally block the whatever the connection between the database are closed so..");
        }
    
    }
}
