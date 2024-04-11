import java.util.Scanner;
class Blood
{
    public static void  main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your blood pressure value in mm hg");
        int i=sc.nextInt();

        if(i<=120)
        {
            System.out.println("normal blood pressure");
        }
        else if(i>=120 && i<=129)
        {
            System.out.println("normaly high blood pressure");
        }
        else 
        {
            System.out.println("high blood pressure");
        }
    }
}
