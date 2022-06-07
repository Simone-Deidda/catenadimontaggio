package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class AutomobileDAOImpl implements AutomobileDAO {

	@Override
	public void insert(Automobile input) {
		for (SlotCatenaDiMontaggio slot: MockData.LISTA_SLOT_CATENA_DI_MONTAGGIO) {
			if (slot.getId() == input.getSlotCatenaDiMontaggio().getId()) {
				slot.getListaAutomobili().add(input);
			}
		}
	}

	

}
