import java.util.Scanner;
import java.util.Scanner;
class Menu1
{
    public static void main( String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******MENU CARD********");
        System.out.println("1- PURE-VEG.");
        System.out.println("2- NONE-VEG");
    
        System.out.println("CHOSE ANY ONE OF THE above  ");
        int ip=sc.nextInt();
        switch(ip)
        {
            case 1:
            {
                System.out.println("***PURE VEG MENU LIST***");
                System.out.println("1-Pizza on fire");
                System.out.println("2-Born for burgers");
                System.out.println("3-Pasta la vista");
                System.out.println("SELECT THE ONE IN THE ABOVE");
                int im=sc.nextInt();
              
                switch(im)
                {
                    case 1:
                    {
                        System.out.println("**-pizza on fire**");
                        System.out.println("1-cheese pizza");
                        System.out.println("2-Margherita Pizza.");
                        System.out.println("3-Veggies Pizza.");
                        System.out.println("SELECT THE ONE IN THE ABOVE");
                        int in=sc.nextInt();

                        switch(in)
                        {
                            case 1:
                            {
                                System.out.println("your order is cheese pizza !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is margherita pizza !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is veggies pizza !, will be ready in 15 minute");
                            }
                            break;
                            
                        }
                
                    } 
                    break;
                    case 2:
                    {
                        System.out.println("**born for burger**");
                        System.out.println("1-paneer tikki burger");
                        System.out.println("2-spicy paneer burger");
                        System.out.println("3-crunchy paneer burger");
                        System.out.println("SELECT THE ONE IN THE ABOVE");
                        int io=sc.nextInt();
                        
                        switch(io)
                        {
                            case 1:
                            {
                                System.out.println("your order is paneer tikki burger !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is spicy paneer burger !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is crunchy paneer burger !, will be ready in 15 minute");
                            }
                            break; 
                        }

                    }  
                    break;
                    case 3:
                     {
                       System.out.println("**pasta la vista**");
                       System.out.println("1-masala pasta ");
                       System.out.println("2-spicy masala pasta");
                       System.out.println("3-mashroom masala pasta");
                       System.out.println("SELECT THE ONE IN THE ABOVE");
                        int iq=sc.nextInt();


                        switch(iq)
                        {
                            case 1:
                            {
                                System.out.println("your order is masala pasta !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is spicy masala pasta !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is mashroom masala pasta !, will be ready in 15 minute");
                            }
                            break; 

                        }


                     }



                }
                break;
            
    
            
            }
            case 2:
            {
                System.out.println("***PURE NON-VEG MENU LIST***");
                System.out.println("1-chicken Pizza on fire");
                System.out.println("2-Born for chicken burgers");
                System.out.println("3-chicken Pasta la vista");
                System.out.println("SELECT THE ONE IN THE ABOVE");
                int ir=sc.nextInt();

                switch(ir)
                {
                    case 1:
                    {
                        System.out.println("**-chicken pizza on fire**");
                        System.out.println("1- chicken cheese pizza");
                        System.out.println("2-chicken tandoori Pizza.");
                        System.out.println("3- chicken Veggies Pizza.");
                        System.out.println("SELECT THE ONE IN THE ABOVE");
                        int is=sc.nextInt();

                        switch(is)
                        {
                            case 1:
                            {
                                System.out.println("your order is chicken cheese pizza !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is chicken tandoori pizza !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is chicken veggies pizza !, will be ready in 15 minute");
                            }
                            break;
                        }

                    }
                    break;
                    case 2:
                    {
                        System.out.println("**born for chicken burger**");
                        System.out.println("1-chicken tikki burger");
                        System.out.println("2-chicken spicy burger");
                        System.out.println("3-crunchy chicken burger");
                        System.out.println("SELECT THE ONE IN THE ABOVE");
                        int it=sc.nextInt();
                        switch(it)
                        {
                            case 1:
                            {
                                System.out.println("your order is chicken tikki burger !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is  chicken spicy burger !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is crunchy chicken burger !, will be ready in 15 minute");
                            }
                            break;  
                        }

                    }
                    break;
                    case 3:
                    {
                        System.out.println("**pasta la vista**");
                       System.out.println("1-chicken masala pasta ");
                       System.out.println("2-spicy chicken masala pasta");
                       System.out.println("3-cocktail chicken pasta");
                       System.out.println("SELECT THE ONE IN THE ABOVE");
                        int iu=sc.nextInt();
                        switch(iu)
                        {
                            case 1:
                            {
                                System.out.println("your order is chicken masala pasta !, will be ready in 15 minute");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("your order is spicy chicken masala pasta !, will be ready in 15 minute");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("your order is cocktail chicken pasta !, will be ready in 15 minute");
                            }
                            break;
                        }
                    }
                    break;
                }
                 

            
                
            }
            default :
            {
                System.out.println("ENTER WHICH  IN MENU ");
                break;
            }
                
            
        }
    }
       
}