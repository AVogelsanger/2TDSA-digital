package br.com.fiap.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PARTIDO")
@SequenceGenerator(name="partido", sequenceName="SQ_T_PARTIDO", allocationSize=1)
public class Partido {

	@Id
	@Column(name="cd_partido")
	@GeneratedValue(generator="partido", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_partido", nullable=false)
	private String nome;
	
	@Column(name="nr_partido", nullable=false)
	private int numero;

	public Partido() {
		super();
	}

	public Partido(String nome, int numero) {
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
