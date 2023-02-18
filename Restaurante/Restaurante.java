package Restaurante;

public class Restaurante{
	private String nomeRes;
	private String cidade;
	private String end;
	private String cardapio;
	private String avaR;
	private String avaP;
	private String avaS;
	private int pedido;
	private float preco;
	
	
	public Restaurante(String nomeRes, String cidade, String end, String cardapio, String avaR,String avaS, String avaP, float preco) {
		super();
		this.nomeRes = nomeRes;
		this.cidade = cidade;
		this.end = end;
		this.cardapio = cardapio;
		this.avaR = avaR;
		this.avaP = avaP;
		this.avaS = avaS;
		this.pedido = pedido;
		this.preco = preco;
	}

	
	public Restaurante(String nomeCliente) {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNomeRes() {
		return nomeRes;
	}


	public void setNomeRes(String nomeRes) {
		this.nomeRes = nomeRes;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getCardapio() {
		return cardapio;
	}


	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
	}


	public String getAvaR() {
		return avaR;
	}


	public void setAvaR(String avaR) {
		this.avaR = avaR;
	}


	public String getAvaP() {
		return avaP;
	}


	public void setAvaP(String avaP) {
		this.avaP = avaP;
	}


	public String getAvaS() {
		return avaS;
	}


	public void setAvaS(String avaS) {
		this.avaS = avaS;
	}


	public int getPedido() {
		return pedido;
	}


	public void setPedido(int pedido) {
		this.pedido = pedido;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}

}