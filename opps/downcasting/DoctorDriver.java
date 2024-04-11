

public class DoctorDriver {
    public static void main(String[]args)
    {
        //Doctor d1=new Doctor(500,"mbbs");

      //  d1.displayDoctor();

        Doctor d1=new Cardiologist("cardiologist","heart",500.0, "mbbs");
            
                // d1.displayDoctor();

             Cardiologist c1=new Cardiologist("cardiologist","heart",500.0, "mbbs");
             c1.displayDoctor();
    }
}
