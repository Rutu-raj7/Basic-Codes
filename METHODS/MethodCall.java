package METHODS;

public class MethodCall {
    public static void main(String[]args)
    {
        System.out.println("hello world");
        add();
        sub();
        mul();
        div();

    }

    public static void add()
    {
        int a=10;
        int b=5;
        System.out.println(a+b);
    }
    public static void sub()
    {
        int a=10;
        int b=5;
        System.out.println(a-b);
    }
    public static void mul()
    {
        int a=12;
        int b=12;
        System.out.println(a*b);
    }
    public static void div()
    {
        double  a=36;
        double b=5;
        double d=a/b;
        System.out.println(d);
    }
        

}
