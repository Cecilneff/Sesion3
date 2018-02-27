package sesion3servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sesion3servlet
 */
@WebServlet("/S3servlet")
public class S3servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S3servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	public boolean checkAdmin(String nombre, String DNI) {
		if (nombre.equals("fjnh") && DNI.equals("1234"))
		{return true;
		} else 
			{return false;}
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nombre=request.getParameter("Nombre");
		String DNI=request.getParameter("DNI");
		String url="";
		
		if (checkAdmin(nombre,DNI)) {
			url="WEB-INF/admin.jsp";
		}
		else url ="WEB-INF/error,jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
