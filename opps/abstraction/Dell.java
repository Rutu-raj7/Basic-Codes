package opps.abstraction;

public abstract class Dell {
    public void welcome()
    {
        System.out.println("welcome in the dell system.");
    }
    abstract int calculator(int a,int b);

    abstract void notepad(String type);
      
    abstract void time(String time);

    abstract void paint(String draw); 

}
