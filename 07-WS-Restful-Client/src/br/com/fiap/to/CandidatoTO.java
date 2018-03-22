package br.com.fiap.to;

public class CandidatoTO {

	private int codigo;
	
	private String nome;
	
	private String apelido;
	
	private boolean fichaLimpa;
	
	private int numero;

	public CandidatoTO() {
		super();
	}

	public CandidatoTO(String nome, String apelido, boolean fichaLimpa, int numero) {
		super();
		
		this.nome = nome;
		this.apelido = apelido;
		this.fichaLimpa = fichaLimpa;
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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isFichaLimpa() {
		return fichaLimpa;
	}

	public void setFichaLimpa(boolean fichaLimpa) {
		this.fichaLimpa = fichaLimpa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
