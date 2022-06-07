package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class MockData {
	public static final List<SlotCatenaDiMontaggio> LISTA_SLOT_CATENA_DI_MONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {
		SlotCatenaDiMontaggio slot1 = new SlotCatenaDiMontaggio(1L, "Big Montaggi", "Francia");
		try {
			Automobile auto1 = new Automobile(1L, "500 Abart", "0100145789",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2015"));
			auto1.setSlotCatenaDiMontaggio(slot1);
			slot1.getListaAutomobili().add(auto1);
			
			Automobile auto2 = new Automobile(2L, "Grande punto", "0167122289",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-07-2018"));
			auto2.setSlotCatenaDiMontaggio(slot1);
			slot1.getListaAutomobili().add(auto2);
			
			Automobile auto3 = new Automobile(3L, "Panda", "7457123499",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-10-2020"));
			auto3.setSlotCatenaDiMontaggio(slot1);
			slot1.getListaAutomobili().add(auto3);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		LISTA_SLOT_CATENA_DI_MONTAGGIO.add(slot1);
	}
}
