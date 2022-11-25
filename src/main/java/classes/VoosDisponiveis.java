package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conexao.Conexao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoosDisponiveis
 */
@WebServlet("/VoosDisponiveis")
public class VoosDisponiveis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoosDisponiveis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		 try {
			Connection conexao=new Conexao().getConnection();
			
			PreparedStatement stmt=conexao.prepareStatement("select * from voos");
			ResultSet listar=stmt.executeQuery();
			
			while(listar.next()) 
			{
				int codigo=listar.getInt("codigo");
				String origem=listar.getString("origem");
				String destino=listar.getString("destino");
				int quantidade=listar.getInt("quantidade");
				int saldo=listar.getInt("restantes");
				double valor=listar.getDouble("preco");
				
				 PrintWriter out = response.getWriter();
				
				 out.println("<html>");
				 out.println("<body>");
				 out.println(" <link rel=\"stylesheet\" href=\"./css/estilo.css\">");
				 out.println("<div class=\"caixa\">");
				 out.println("<table border=\"1\" style=\"margin-left:40px;\">");
				 out.println("<h1 style=\"margin-left:120px;\">Voos Dísponiveis</h1>");
				 out.println(" <tr>");
				 out.println("<th>Codigo</th>");
				 out.println("<th>Origem</th>");
				 out.println("<th>Destino</th>");
				 out.println("<th>Quantidades</th>");
				 out.println("<th>Restantes</th>");
				 out.println("<th>Preco</th>");
				 out.println("</tr>");
				 
				 out.println("<tr>");
				 out.println("<td>"+codigo+"</td>");
				 out.println("<td>"+origem+"</td>");
				 out.println("<td>"+destino+"</td>");
				 out.println("<td>"+quantidade+"</td>");
				 out.println("<td>"+saldo+"</td>");
				 out.println("<td>"+valor+"</td>");
				 out.println("</tr>");
				 
				 out.println("<tr>");
				 out.println("<td>"+codigo+"</td>");
				 out.println("<td>"+origem+"</td>");
				 out.println("<td>"+destino+"</td>");
				 out.println("<td>"+quantidade+"</td>");
				 out.println("<td>"+saldo+"</td>");
				 out.println("<td>"+valor+"</td>");
				 out.println("</tr>");
				 
				 out.println("<tr>");
				 out.println("<td>"+codigo+"</td>");
				 out.println("<td>"+origem+"</td>");
				 out.println("<td>"+destino+"</td>");
				 out.println("<td>"+quantidade+"</td>");
				 out.println("<td>"+saldo+"</td>");
				 out.println("<td>"+valor+"</td>");
				 out.println("</tr>");
				 
				 out.println("</table>");
				 out.println("</body>");
				 out.println("</html>");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
