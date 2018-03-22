package br.com.fiap.view;

import java.util.List;

import br.com.fiap.service.CandidatoService;
import br.com.fiap.to.CandidatoTO;

public class ListaView {

	public static void main(String[] args) {
		CandidatoService service = new CandidatoService();
		try {
			List<CandidatoTO> lista = service.listar();
			for (CandidatoTO to : lista) {
				System.out.println(to.getNome());
				System.out.println(to.getApelido());
				System.out.println(to.getNumero());
				System.out.println("**************************");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
