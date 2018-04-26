package br.com.fiap.view;

import java.util.List;

import br.com.fiap.ws.service.NoticiaService;
import br.com.fiap.ws.to.NoticiaTO;

public class NoticiaView {

	public static void main(String[] args) {
		
		NoticiaService service = new NoticiaService();
		
		try {
			List<NoticiaTO> lista = service.listar();
			for (NoticiaTO noticiaTO : lista) {
				System.out.println(noticiaTO.getConteudo());
				System.out.println(noticiaTO.getTitulo());
				System.out.println("*********************");
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
