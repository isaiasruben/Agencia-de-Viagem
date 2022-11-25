package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			PrintWriter out= response.getWriter();
	
			String username=request.getParameter("user");
			String password=request.getParameter("pass");
			
			//Objecto da classe logar
			
			Logar logar= new Logar();
			
			//realizacao dos get´s e set´s
			logar.setPassword(password);
			logar.setUsername(username);
			int respost=0;
			
			try {
				CadastrarDao dao = new CadastrarDao();
				
				//verificando o resultado da query
				
				respost=dao.efectuarLogin(logar);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(respost!=0) 
			{
				request.getSession().setAttribute("usuario", logar);
				response.sendRedirect("./Pagina_Principal.jsp");
			}
			else 
			{
				String erro="Senha e password incorrect's";
				request.getSession().invalidate();
				response.sendRedirect("./Index.jsp");
			}
	
	}

}
