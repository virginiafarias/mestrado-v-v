package com.example;

public class RepositoryImpl implements Respository {

	@Override
	public int salvar(Contato contato) {
		if (contato != null && contato.getNome().isEmpty() && contato.getEmail().isEmpty()) {
			System.out.println("Erro ao cadastrar contato: todos os campos são obrigatórios");
			return 0;
		}
		return 1;
	}
	
	

}
