package classes;

import java.sql.Date;

public class Bilhete {

	private String nome_cliente;
	private String origem;
	private String destino;
	private String passagem;
	private String cartao;
	private String situacao;
	
	private String saida;
	private String chagada;
	private String assento;
	

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getPassagem() {
		return passagem;
	}
	public void setPassagem(String passagem) {
		this.passagem = passagem;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public String getChagada() {
		return chagada;
	}
	public void setChagada(String chagada) {
		this.chagada = chagada;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	
}
