
public class ParentDriver {
    public static void main(String []args)
    {
        Child c1= new Child();
        c1.m2();

        Parent p2=new Parent();
         p2.m3();
         p2.m2();  //      we can only perform the overriding operation in the non static members,(variable,methods)


           
       Parent p1=new Child(); //if we have no.of the methods ,and i want to replace the some method then we use the 
                              //because of the small error or updation the we can use the the @membere overriding.
                              //for overriding fristely we do the upcasting ,then we store the object of child
                              //is stored in the parent reference.
                              // 

       p1.m2();


    }
}
