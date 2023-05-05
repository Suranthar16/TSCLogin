

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.TcsDB;
import DTO.TcsDTO;
import DAO.TcsDAO;

@WebServlet("/Tcs3Servlet")
public class Tcs3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Tcs3Servlet() {
        super();
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 
		 	  boolean Deleted=false;
		 
		 
			  
			  String emailVal=request.getParameter("emailVal");
			  System.out.println("emailVal  =  "+emailVal);

	
			  
			  TcsDAO dao=new TcsDAO();
			  Deleted=dao.TcsDelete(emailVal);// delete();
				 // delete sql
			 System.out.println("email="+emailVal);
			 
			 ArrayList<TcsDTO> list=dao.retrieveUser();
				if (list != null)
					 System.out.println("list size---"+list.size()) ;
			 
			 HttpSession session =request.getSession();
			 
			 session.setAttribute("Retrivelist", list);
			 
	
		response.sendRedirect("Tcs3.jsp?delete="+Deleted);
	}
}