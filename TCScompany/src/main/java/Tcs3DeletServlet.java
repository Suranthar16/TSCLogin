

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.TcsDB;
import DTO.TcsDTO;

/**
 * Servlet implementation class Tcs3DeletServlet
 */
@WebServlet("/Tcs3DeletServlet")
public class Tcs3DeletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tcs3DeletServlet() {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		
		
		public boolean TcsDelet(TcsDTO dto) {

			TcsDB db=new TcsDB();
			Connection conn= db.getConnection();
			boolean result1=false;

			String sql="Delet* From test1.tcsdata Where email=?";
			PreparedStatement ps=null;
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1, dto.getEmail() );
				
				
				double result=0;
				result=ps.executeUpdate();
				System.out.println(result);
					if(result>0) 
					{
						result1=true;
						System.out.println("Delet success!");
					}
			    } catch (Exception e) {
			    	System.out.println(e);
			    }


				System.out.println(conn);
				return result1;
			  

	     }
	
}
