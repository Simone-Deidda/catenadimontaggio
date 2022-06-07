package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class MotoreServiceImpl implements MotoreService {

	@Override
	public void montaMotore(String modello) {
		System.out.println("Montaggio del motore per: " + modello);
		System.out.println("...");
		System.out.println("Fatto!");
	}

}
