

public class Cardiologist extends Doctor {
    String special;
    String organ;


Cardiologist()
{

}
Cardiologist(String special,String organ,double fees,String degree)
{
    super(fees,degree);
    this.special=special;
    this.organ=organ;
}
public void displayCardiolgist()
{
    displayDoctor();
    System.out.println(special);
    System.out.println(organ);
}
}
