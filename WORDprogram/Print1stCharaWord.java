package String.WORDprogram;

import java.util.Scanner;

public class Print1stCharaWord {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String in line");
        String s=sc.nextLine();

        String w="";
        s+=" ";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c!=' ') // character space is available in sentence
            {
                w=w+c;
            }
            else{            // Do not add space in consule after input 
                
             System.out.print(w.charAt(0));
                  w="";
              
            }
        }
    }
}
