package opps.Interface;

public class Instagram2  extends Instagram1  
{
    String name;
    String email;
    String password;

    Instagram2()
    {

    }
    Instagram2(String name,String email,String password)
    {
        this.name=name;
        this.email=email;
        this.password=password;
    }
      public void instagram2()
      {
          System.out.println("!! login successesfully !!");
      }

    public void story(String s)
    {
        System.out.println(s);
    }


}   

