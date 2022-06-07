package it.prova.catenadimontaggio;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner{
	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SlotCatenaDiMontaggio slot1 = catenaDiMontaggioService.caricaSlotCatenaDiMontaggio(1L);
		
		Automobile auto1 = new Automobile(10L, "Tipo", "001122557489", new Date());
		
		catenaDiMontaggioService.aggiungiAutoAdSlot(auto1, slot1);
		
		catenaDiMontaggioService.avviaCatenaDiMontaggio(auto1);
	}

}
