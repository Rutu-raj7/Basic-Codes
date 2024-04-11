package project1;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletepatient")
public class DeletePatient    extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String id=req.getParameter("patientId");
		
		int id1=Integer.parseInt(id);
		
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("ruturaj");
		  EntityManager em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		  Patient p=new Patient();
		  
		  Patient r=em.find(Patient.class,id1);
		
		  et.begin();
		  em.remove(r);
		  et.commit();
		  
		  RequestDispatcher rd=req.getRequestDispatcher("Navigation1.html");
			rd.forward(req, res);
		
			System.out.println("run delete !");
	}
}
