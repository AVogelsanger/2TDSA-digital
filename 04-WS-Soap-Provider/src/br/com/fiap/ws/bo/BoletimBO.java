package br.com.fiap.ws.bo;

import br.com.fiap.ws.to.BoletimTO;

public class BoletimBO {

	public BoletimTO buscar(int codigo) {
		BoletimTO to = null;
		System.out.println("Chamou");
		switch (codigo) {
		case 1:
			to = new BoletimTO("Digital", 0, 5, false);
			break;
		case 2:
			to = new BoletimTO("Enterprise", 0, 8, true);
			break;
		}
		return to;
	}

}
