package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {

	@Override
	public void montaImpiantoElettrico() {
		System.out.println("Montaggio dell'impianto elettrico:");
		System.out.println("...");
		System.out.println("Fatto!");
	}

}
