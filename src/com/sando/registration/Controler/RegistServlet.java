package com.sando.registration.Controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sando.register.BusinessService.DatabaseService;
import com.sando.registration.model.Student;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DatabaseService service = new DatabaseService();
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lastname= request.getParameter("first_name");
		String firstname= request.getParameter("last_name");
		String dateofbirth= request.getParameter("birthday");
		String gender= request.getParameter("gender");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		String subject= request.getParameter("subject");
		
		Student student = new Student();
		student.setLastname(lastname);
		student.setFirstname(firstname);
		student.setDateOfbirth(dateofbirth);
		student.setGender(gender);
		student.setEmail(email);
		student.setPhone(phone);
		student.setSubject(subject);
		
		
		
		
		boolean res= service.insertStudent(student);
		if(res) {
			this.getServletConfig().getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);
		}
		else {
			
			response.sendRedirect("index.html");
		}
				
		
	}

}
