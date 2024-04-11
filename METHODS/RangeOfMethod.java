package METHODS;
import java.util.Scanner;
public class RangeOfMethod {
    
        public static void main(String[]args)
        {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the Starting number");
    double start=sc.nextDouble();

    System.out.println("enter the end number");
    double end=sc.nextDouble();
    double d=start+end;

    //System.out.println(start+end);
    System.out.println(d);
    sub();
    mul();
    div();
    modules(); 




          }
    public static void sub()
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the Starting number");
    double start=sc.nextDouble();

    System.out.println("enter the end number");
    double end=sc.nextDouble();

    System.out.println(start-end);

    }
    public static void mul()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Starting number");
        double start=sc.nextDouble();
    
        System.out.println("enter the end number");
        double end=sc.nextDouble();
    
        System.out.println(start*end);  
    }
    public static void div()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Starting number");
        double start=sc.nextDouble();
    
        System.out.println("enter the end number");
        double end=sc.nextDouble();
    
        System.out.println(start/end);  
    }
    public static void modules()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Starting number");
        double start=sc.nextDouble();
    
        System.out.println("enter the end number");
        double end=sc.nextDouble();
    
        System.out.println(start%end);  
    } 
        
}
