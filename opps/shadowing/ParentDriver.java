public class ParentDriver {
    public static void main(String[]args)
    {
        System.out.println(Parent.b);         // we can call the static variable and static method in the child clas 
                                              // with the help of the class reference.
                                     //  for the non static (intance )we required to the create a constructor to invoke it 
                                      //

        Parent p1=new Parent();
       Parent.a();
        p1.a1();

    }
}
