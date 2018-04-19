package br.com.fiap.to;

public class PartidoTO {

	private int codigo;
	private String nome;
	private int numero;
	
	public PartidoTO() {
		super();
	}

	public PartidoTO(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
