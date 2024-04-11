package opps.Interface;

 abstract class Instagram1 implements Instagram
{
    public void chat(String s)
    {
        System.out.println(s);
        System.out.println("sent");
    } 
    public void comments(String s)
    {
        System.out.println(s);

    }  
    public void post(String s)
    {
        System.out.println(s);
    }
    public void call(String s)
    {
        System.out.println(s);
    }
    public abstract void story(String s);
}
