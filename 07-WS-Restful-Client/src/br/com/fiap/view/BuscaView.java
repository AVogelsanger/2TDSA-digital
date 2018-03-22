package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.service.CandidatoService;
import br.com.fiap.to.CandidatoTO;

public class BuscaView {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Codigo: ");
		int codigo = scan.nextInt();
		
		CandidatoService service = new CandidatoService();
		try {
			CandidatoTO to = service.buscar(codigo);
			System.out.println(to.getNome());
			System.out.println(to.getApelido());
			System.out.println(to.getNumero());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		scan.close();
	}
}
