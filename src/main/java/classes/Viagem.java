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
 * Servlet implementation class Viagem
 */
@WebServlet("/Viagem")
public class Viagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viagem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String nome_viajante = request.getParameter("nome");
		String origem= request.getParameter("origem");
		String destino = request.getParameter("destino");
		String passagem=request.getParameter("passagem");
		String situacao = request.getParameter("tipo");
		String cartao=request.getParameter("cartao");
		
		
		Bilhete bi= new Bilhete();
		
		bi.setNome_cliente(nome_viajante);
		bi.setOrigem(origem);
		bi.setDestino(destino);
		bi.setPassagem(passagem);
		bi.setSituacao(situacao);
		bi.setCartao(cartao);
		
		// registar os dados na BD;
		
		try {
			CadastrarDao dao= new CadastrarDao();
			dao.comprarBilhete(bi);
			response.sendRedirect("./voos.jsp");
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
