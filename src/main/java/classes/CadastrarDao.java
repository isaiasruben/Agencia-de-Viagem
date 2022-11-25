package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;

public class CadastrarDao  {

	int resultado=0;
	private Connection conexao;
	 double pagamento=11;
	
	public CadastrarDao() throws ClassNotFoundException, SQLException 
	{
		this.conexao=new Conexao().getConnection();
	}
	
	public void registar(Funcionario funcionario) 
	{
		String sql="insert into funcionario(func_apelido,  func_nome, func_genero,  func_datanascimento"
				+ ", func_bairro,func_quarteirao , func_casa, func_email, func_username,  func_password, func_alcunha)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getApelido());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(4, funcionario.getDatasnacimento());
			stmt.setString(3, funcionario.getGenero());
			stmt.setString(5, funcionario.getMorada());
			stmt.setString(6, funcionario.getQuarteirao());
			stmt.setString(7, funcionario.getCasa());
			stmt.setString(8, funcionario.getEmail());
			stmt.setString(9, funcionario.getUsername());
			stmt.setString(10, funcionario.getPassword());
			stmt.setString(11, funcionario.getAlcunha());
			
			stmt.execute();
			
			stmt.close();
			
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public int efectuarLogin(Logar logar) 
	{
		String ver="SELECT COUNT(func_codigo) as valor from funcionario where func_username=? and func_password=?";
		try {
			PreparedStatement stmt= conexao.prepareStatement(ver);
			stmt.setString(1, logar.getUsername());
			stmt.setString(2, logar.getPassword());
			stmt.execute();
			
			PreparedStatement lista= conexao.prepareStatement("SELECT COUNT(func_codigo)"
					+ " as valor from funcionario where func_username='"+logar.getUsername()+"'"
							+ " and func_password='"+logar.getPassword()+"'");
			
			ResultSet result=lista.executeQuery();
			
			while(result.next()) 
			{
				resultado=result.getInt("valor");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resultado;
	}
	
  public void comprarBilhete (Bilhete bilhete) 
  {
	  //criando insercao de dados na tabela Bilhete
	  
	 String sql="insert into Bilhete (bi_nome_cliente, bi_origem, bi_destino,bi_situacao,"
	 		+ "nr_cartao) values (?,?,?,?,?)";
	 String erro="";
	 String nome=bilhete.getNome_cliente();
	 
	 try {
		 
		 //execundado a query usando o metodo PreparedStatement
		 
		 PreparedStatement stmt=conexao.prepareStatement(sql);
		 
		 if(bilhete.getSituacao().equals("idaeVolta")) 
		 {
			 bilhete.getSituacao().equals("idaeVolta");
		 }
		 else 
		 {
			 bilhete.getSituacao().equals("ida");
		 }
			 
			 PreparedStatement lista=conexao.prepareStatement("select * from cliente where nome_cliente='"+nome+"'");
			 
			 // efectuar a busca dos clientes
			 
			 ResultSet listar=lista.executeQuery();
			 
			 while(listar.next()) 
			 {
				 double saldo=listar.getDouble("saldo");
				 
				 if(bilhete.getOrigem().equals("maputo") && bilhete.getOrigem().equals("gaza")) 
				 {
					 pagamento=1200.99;
				 }
				 
				 else if(bilhete.getOrigem().equals("maputo") && bilhete.getOrigem().equals("inhambane")) 
				 {
					 pagamento=1222.99;
				 }
				 
				 else if(bilhete.getOrigem().equals("maputo") && bilhete.getOrigem().equals("tete")) 
				 {
					 pagamento=1250.99;
				 } 
				  
				 if(saldo>=pagamento) 
				 {
					// fazendo listagem do saldo do cliente para verificar o saldo
					 
					 
					 stmt.setString(1, bilhete.getNome_cliente());
					 stmt.setString(2, bilhete.getOrigem());
					 stmt.setString(3, bilhete.getDestino());
					 stmt.setString(4, bilhete.getSituacao());
					 stmt.setString(5, bilhete.getCartao());
					 
					 stmt.execute();
					 stmt.close();
					 
					 String registar="insert into registo (nome_cliente, origem, destino, valor_pago)"
						 		+ "values (?,?,?,?)";
								 PreparedStatement registo=conexao.prepareStatement(registar);
								 registo.setString(1, bilhete.getNome_cliente());
								 registo.setString(2, bilhete.getOrigem());
								 registo.setString(3, bilhete.getDestino());
								 registo.setDouble(4, pagamento);
								 
								 // execução da query
								 
								 registo.execute();
								 registo.close();	
								 
								// Fazendo actualização do saldo do cliente
								 
								 double resut=saldo-pagamento;
								 
						String update="update cliente set saldo='"+resut+"' where nome_cliente='"+bilhete.getNome_cliente()+"'";
						
						PreparedStatement stt=conexao.prepareStatement(update);
						stt.execute();
						stt.close();
								 
								 
				 }
				 else 
				 {
					 System.out.println("Saldo insuficiente");
				 }	 
				
			 }
		 
	 		} catch (Exception e) {
		// TODO: handle exception
	} 
	  
  }
  
  public void marcarVoo(Bilhete bilhete) throws SQLException 
	 {
	  	String sql="insert into marcacao(data_partida, data_chegada, assentos)"
	  			+ "values (?,?,?)";
	  	try {
	  		  PreparedStatement stmt=conexao.prepareStatement(sql);
	  		 stmt.setString(1,bilhete.getSaida());
	  		 stmt.setString(2, bilhete.getChagada());
	  		 stmt.setString(3, bilhete.getAssento());
	  		 
	  		 // executar a funcao 
	  		 
	  		 stmt.execute();
	  		 stmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	  
	 }
	
//	

}
