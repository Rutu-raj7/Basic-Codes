public class Doctor {
    double fees;
    String degree;

    Doctor()
    {

    }
    Doctor(double fees,String degree)
    {
        this.fees=fees;
        this.degree=degree;

    }
    public void displayDoctor()
    {
        System.out.println(fees);
        System.out.println(degree);
    }
    
}
