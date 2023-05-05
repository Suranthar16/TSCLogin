

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TcsDAO;
import DTO.TcsDTO;

/**
 * Servlet implementation class TcsServlet
 */
@WebServlet("/TcsServlet")
public class TcsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TcsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		TcsDTO dto=new TcsDTO();
		
		String name=request.getParameter("name");
		System.out.println("name="+name);
		dto.setName(name);
		
		String age=request.getParameter("age");
		System.out.println("age="+age);
		dto.setAge(age);
		
		String dob=request.getParameter("dob");
		System.out.println("dod="+dob);
		dto.setDob(dob);
		
		String email=request.getParameter("email");
		System.out.println("email="+email);
		dto.setEmail(email);
		
		String mobile=request.getParameter("mobile");
		System.out.println("mobile="+mobile);
		dto.setMobile(mobile);
		
		String qualification=request.getParameter("qualification");
		System.out.println("qualification="+qualification);
		dto.setQualification(qualification);
		
		String gender=request.getParameter("gender");
		System.out.println("gender="+gender);
		dto.setGender(gender);
		
		TcsDAO dao=new TcsDAO();
		dao.Tcs(dto);
		
		 ArrayList<TcsDTO> list=dao.retrieveUser();
		 if(list!=null)System.out.println("list size---"+list.size());
		 
		 HttpSession session =request.getSession();//creating Session
		 
		 session.setAttribute("Retrivelist", list);//seting value to Session
		 
		
		 response.sendRedirect("Tcs2.jsp");
		
	}

}
