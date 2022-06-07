package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class TelaioServiceImpl implements TelaioService {

	@Override
	public void montaTelaio(String telaio) {
		System.out.println("Montaggio del telaio: " + telaio);
		System.out.println("...");
		System.out.println("Fatto!");
	}

}
