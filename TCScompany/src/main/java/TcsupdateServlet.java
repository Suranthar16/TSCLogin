

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.TcsDTO;
import DAO.TcsDAO;


/**
 * Servlet implementation class TcsupdateServlet
 */
@WebServlet("/TcsupdateServlet")
public class TcsupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TcsupdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 boolean Deleted=false; 
		
		
		TcsDTO dto=new TcsDTO();
		
		String name=request.getParameter("name");
		dto.setName(name);
		
		String age=request.getParameter("age");
		dto.setAge(age);
		
		String dob=request.getParameter("dob");
		dto.setDob(dob);
		
		String email=request.getParameter("email");
		dto.setEmail(email);
		
		String mobile=request.getParameter("mobile");
		dto.setMobile(mobile);
		
		String qualification=request.getParameter("qualification");
		dto.setQualification(qualification);
		
		String gender=request.getParameter("gender");
		dto.setGender(gender);
		
		System.out.println("into update");
		
		
		//Delete function 
		TcsDAO dao1=new TcsDAO();
		
		 Deleted=dao1.TcsDelete(email);// delet();
		 System.out.println("delete email"+email);
		
		
		System.out.println("deleted the data");
		boolean update=false;
		 TcsDAO dao=new TcsDAO(); //updaate function
		if(Deleted) {
		
		 update=dao.Tcs(dto);
		}
		
		System.out.println(""+update);
		
		ArrayList<TcsDTO> list=dao.retrieveUser();
		 if(list!=null)System.out.println("list size---"+list.size());
		 
		 HttpSession session =request.getSession();
		 
		 session.setAttribute("Retrivelist", list);
		
		response.sendRedirect("Tcs3.jsp");
	}

}
