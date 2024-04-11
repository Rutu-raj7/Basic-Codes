package opps.abstraction;  

public class Linux {
    public int calculator(int a,int b)
   {
       int ans=a+b;
       System.out.println(ans);
       return ans;
   }

   public void notepad(String type)
   {
       System.out.println(type);
   }

   public void time(String time)
   {
       System.out.println("time show");
   }
   public void paint(String draw)
   {
       System.out.println( draw);  
}
}
