package jp31;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jp31
 */
@WebServlet("/Jp31")
public class Jp31 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jp31() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String Nombre=request.getParameter("Nombre");
		String Apellido=request.getParameter("Apellido");
		String DNI=request.getParameter("DNI");
		UserTemporales UserT = new UserTemporales (Nombre,Apellido,DNI);
		//String url="/WEB-INF/Welcome.jsp";
		//getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nombre=request.getParameter("Nombre");
		String clave=request.getParameter("clave");
		String url="";
		
		if (checkAdmin(nombre,clave)) {
			url="/WEB-INF/admin.jsp";
		}
		else url ="/WEB-INF/error.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	public boolean checkAdmin(String nombre, String clave) {
		if (nombre.equals("fjnh") && clave.equals("1234"))
		return true;
		 else 
			return false;
		
	}

}
