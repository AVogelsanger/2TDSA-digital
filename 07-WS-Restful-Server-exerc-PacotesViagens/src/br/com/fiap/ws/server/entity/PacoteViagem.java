package br.com.fiap.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PACOTE_VIAGEM")
@SequenceGenerator(name="pacoteViagem", sequenceName="SQ_T_PACOTE_VIAGEM", allocationSize=1)
public class PacoteViagem {
	
	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(generator="pacoteViagem", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_destino", nullable=false)
	private String destino;
	
	@Column(name="vl_pacote", nullable=false)
	private double valor;
	
	@Column(name="qt_diarias", nullable=false)
	private int diarias;

	public PacoteViagem() {
		super();
	}

	public PacoteViagem(String destino, double valor, int diarias) {
		super();
		
		this.destino = destino;
		this.valor = valor;
		this.diarias = diarias;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

}
