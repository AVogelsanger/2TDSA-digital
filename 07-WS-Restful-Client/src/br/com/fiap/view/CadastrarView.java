package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.service.CandidatoService;
import br.com.fiap.to.CandidatoTO;

public class CadastrarView {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = scan.next();
		
		System.out.println("Apelido: ");
		String apelido = scan.next();
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Ficha Limpa: ");
		boolean fichaLimpa = scan.nextBoolean();
		
		CandidatoTO to = new CandidatoTO(nome, apelido, fichaLimpa, numero);

		CandidatoService service = new CandidatoService();
		try {
			service.cadastrar(to);
			System.out.println("Candidato cadastrado!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		scan.close();
	}
}
