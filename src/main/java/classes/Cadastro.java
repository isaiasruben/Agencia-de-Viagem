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
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String apelido= request.getParameter("apelido");
		String nome = request.getParameter("nome");
		String nomes_artitiscos= request.getParameter("outros");
		String bairro = request.getParameter("bairro");
		String email = request.getParameter("email");
		String datanascimento=request.getParameter("nasc");
		String genero= request.getParameter("sexo");
		String casa=request.getParameter("casa");
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String quarteirao=request.getParameter("quarteirao");
		
		// monta um objeto contato
		
	Funcionario funcionario = new Funcionario();
		
				funcionario.setApelido(apelido);
				funcionario.setNome(nome);
				funcionario.setDatasnacimento(datanascimento);
				funcionario.setGenero(genero);
				funcionario.setMorada(bairro);
				funcionario.setQuarteirao(quarteirao);
				funcionario.setCasa(casa);
				funcionario.setEmail(email);
				funcionario.setUsername(username);
				funcionario.setPassword(password);
				funcionario.setAlcunha(nomes_artitiscos);
			
			try {
				CadastrarDao dao= new CadastrarDao();
				dao.registar(funcionario);
				
				out.println("<html>");
				out.println("<body>");
				out.println("Contato " + funcionario.getNome() +
				" adicionado com sucesso");
				out.println("</body>");
				out.println("</html>");
			} catch (ClassNotFoundException | SQLException e) {
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
