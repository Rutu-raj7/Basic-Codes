
import java .util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Sugar
  {
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the your blood sugar level");
          int i=sc.nextInt();
          if(i<=80)
          {
              System.out.println("low blood sugar");
          }
          else if (i>80 && i<=150)
          {
              System.out.println("Exellent");
          }
          else if(i>150&& i<=215)
          {
              System.out.println("Good");
          }
          else if(i>215 && i<380)
          {
              System.out.println("high boold sugar");
          }
          else 
          {
              System.out.println("very high blood sugar, PLEASE CONTACT TO THE DOCTOR");
          }

      }
    
}
