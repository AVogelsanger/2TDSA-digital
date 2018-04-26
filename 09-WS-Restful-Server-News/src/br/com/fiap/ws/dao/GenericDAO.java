package br.com.fiap.ws.dao;

import java.util.List;

import br.com.fiap.ws.exception.CommitException;
import br.com.fiap.ws.exception.RegistroNaoEncontradoException;

public interface GenericDAO <Tabela, Chave> {

	void cadastrar(Tabela tabela);
	
	void atualizar(Tabela tabela);
	
	void excluir(Chave codigo) throws RegistroNaoEncontradoException;
	
	Tabela buscar(Chave codigo);
	
	void commit() throws CommitException;
	
	List<Tabela> listar();
	
}


