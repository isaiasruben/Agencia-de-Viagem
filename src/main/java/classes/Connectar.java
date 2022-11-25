package classes;

import java.sql.Connection;
import java.sql.SQLException;

import Conexao.Conexao;

public class Connectar {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException 
	{
		Connection conexao= new Conexao().getConnection();
		
		Bilhete bilhete= new Bilhete();
		bilhete.setSaida("11-22-2021: 13:10");
		bilhete.setChagada("11-23-2021: 13:20");
		bilhete.setAssento("11");
		
		CadastrarDao dao= new CadastrarDao();
		dao.marcarVoo(bilhete);
		System.out.println("Voo marcado");
	}

}
