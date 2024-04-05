package Pattern;

public class AlternateNumAlph {
    
    public static void main(String []args)
    {
        int v=1;
        char c='a';


        for(int i=1;i<=6;i++)
        {
            for(int j=v;j<=6;j++)
            {
                if(v%2==0){
                System.out.print(v );
                v++;

                }
                else
                {
                    System.out.print(c );
                    c++;
                }

                
            }
            System.out.println();
        }
    }
}
