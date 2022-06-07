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
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
