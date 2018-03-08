package br.com.fiap.ws.to;

public class BoletimTO {

	private String materia;
	
	private int faltas;
	
	private float media;
	
	private boolean aprovado;
	
	public BoletimTO() {
		super();
	}

	public BoletimTO(String materia, int faltas, float media, boolean aprovado) {
		super();
		this.materia = materia;
		this.faltas = faltas;
		this.media = media;
		this.aprovado = aprovado;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
