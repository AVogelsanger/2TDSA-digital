package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.service.CandidatoService;

public class RemoveView {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o codigo do candidato que deseja excluir: ");
		int codigo = scan.nextInt();

		CandidatoService service = new CandidatoService();
		try {
			service.remover(codigo);
			System.out.println("Condidato apagado do banco!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		scan.close();

	}

}
