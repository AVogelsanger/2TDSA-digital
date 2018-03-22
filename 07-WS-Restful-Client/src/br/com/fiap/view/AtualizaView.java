package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.service.CandidatoService;
import br.com.fiap.to.CandidatoTO;

public class AtualizaView {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código do candidato: ");
		int codigo = scan.nextInt();
		
		System.out.println("Nome: ");
		String nome = scan.next();
		
		System.out.println("Apelido: ");
		String apelido = scan.next();
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Ficha Limpa: ");
		boolean fichaLimpa = scan.nextBoolean();
		
		CandidatoTO to = new CandidatoTO(nome, apelido, fichaLimpa, numero);
		to.setCodigo(codigo);
		
		CandidatoService service = new CandidatoService();
		try {
			service.atualizar(to);
			System.out.println("Atualizado!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		scan.close();
	}
}
