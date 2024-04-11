public class Child extends Parent
{
    @Override      //this annotation is used to indicate below method is override.
                   // in the overriding the method name is same of parent mathod name who is to be replaced.
                   // the method overriding is happen in the during the compile run time (compile binding).
public void m2()
{
    System.out.println("from the child class m2");

}
@Override
public void m3()
{
    System.out.println("from the child class m3");
}

}
