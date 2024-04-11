import java.util.Scanner;
class Menu 
{
    public static void main( String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******TIME TABLE********");
        System.out.println("1-monday");
        System.out.println("2-tuesday");
        System.out.println("3-wednesday");
        System.out.println("4-thursday");
        System.out.println("5-friday");
        System.out.println("6-saturday");
        System.out.println("7-sunday");
        System.out.println("enter any number");
        int ip=sc.nextInt();
        switch(ip)
        {
            case 1:
            {
                System.out.println("study the history");
                break;
            }
            case 2:
            {
                System.out.println("study the manual testing");
                break;
            }
            case 3:
            {
                System.out.println("study the SQL");
                break;
            }
            case 4:
            {
                System.out.println("study the HTML");
                break;
            }
            case 5:
            {
                System.out.println("study the CSS");
                break;
            }
            case 6:
            {
                System.out.println("study the core java");
                break;
            }
            case 7:
            {
                System.out.println("study the advanced java");
                break;
            }
            default:
            {
                System.out.println("get the job");
            }
        
            
        }
    }
}