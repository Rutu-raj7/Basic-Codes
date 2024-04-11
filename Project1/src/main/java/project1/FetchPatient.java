package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/fetchpatient")
public class FetchPatient extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ruturaj");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String patientId=req.getParameter("patientId");
		
		try {
	        int id1=Integer.parseInt( patientId);
	    }
	    catch(Exception e)
	    {
	        System.out.println("handle");
	    }
		
		
		Patient p=new Patient();
		{List<Patient> pat = new ArrayList<Patient>();

		Query q = em.createQuery("select a from Patient a");
		
		for (Patient r : pat) {
				PrintWriter pw1 = res.getWriter();
				pw1.write("id of the patient  "+r.getId());
				pw1.write("Frist Name of the patient  "+r.getFirstname());
				pw1.write("Middle Name of the patient  "+r.getMiddlename());
				pw1.write("Middle Name of the patient  "+r.getLastname());
				pw1.write("Last Name of the patient  "+r.getAddress());
				pw1.write("Address of the patient  "+r.getPhonenumber());
				pw1.write("Phone Number of the patient  "+p.getEmail());
				pw1.write("Email of the patient  "+r.getAge());
				pw1.write("Age of the patient  "+r.getChildren());
				pw1.write("Number of Childrens   "+r.getPriority());
		
				
				  

				  RequestDispatcher rd=req.getRequestDispatcher("Navigation1.html");
				  rd.forward(req, res);
				
				  System.out.println("run  fetch");

		     }
		}
	}
}

