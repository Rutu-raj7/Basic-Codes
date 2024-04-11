package opps.exception_handling;

import java.nio.channels.InterruptedByTimeoutException;

public class Exception {
    public static void main(String[]args)throws InterruptedException
    {
        int i;
        for(i=1;i<=5;i++)
        {
            System.out.println("hello");

            Thread.sleep(5000);
        }

    }
}
