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

@WebServlet("/register")
public class PatientDriver extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		
		String id=req.getParameter("id");
		String firstname=req.getParameter("firstname");
		String middlename=req.getParameter("middlename");
		String lastname=req.getParameter("lastname");
		String address=req.getParameter("address");
		String phonenumber=req.getParameter("phonenumber");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String children=req.getParameter("children");
		String priority=req.getParameter("priority");
		
		
		int id1=Integer.parseInt(id);
		int phonenumber1=Integer.parseInt(phonenumber);
		int age1=Integer.parseInt(age);
		int children1=Integer.parseInt(children);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ruturaj");
		 EntityManager em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		  Patient p=new Patient();
		  p.setId(id1);
		  p.setFirstname(firstname);
		  p.setMiddlename(middlename);
		  p.setLastname(lastname);
		  p.setAddress(address);
		  p.setPhonenumber(phonenumber1);
		  p.setEmail(email);
		  p.setAge(age1);
		  p.setChildren(children1);
		  p.setPriority(priority);
		  
		  et.begin();
		  em.persist(p);  // to save
		  et.commit();
		  
		  
		  RequestDispatcher rd=req.getRequestDispatcher("Navigation1.html");
		  rd.forward(req, res);
		
		  System.out.println("run   add");
	}

	
}

