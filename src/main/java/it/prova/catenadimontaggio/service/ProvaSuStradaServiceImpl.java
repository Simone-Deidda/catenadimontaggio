package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {

	@Override
	public void eseguiProvaSuStrada() {
		System.out.println("Esecuzione prova su strada:");
		System.out.println("Test accelerazione......... OK;");
		System.out.println("Test frenata............... OK;");
		System.out.println("Fatto!");
	}

}
