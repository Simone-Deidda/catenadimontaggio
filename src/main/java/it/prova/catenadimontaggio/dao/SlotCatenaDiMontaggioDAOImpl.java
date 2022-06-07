package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		for (SlotCatenaDiMontaggio slotItem : MockData.LISTA_SLOT_CATENA_DI_MONTAGGIO) {
			if(slotItem.getId() == id)
				return slotItem;
		}
		return null;
	}

	@Override
	public void addAutoToSlot(Automobile automobileInput, SlotCatenaDiMontaggio slotInput) {
		automobileInput.setSlotCatenaDiMontaggio(slotInput);
		for (SlotCatenaDiMontaggio slotItem : MockData.LISTA_SLOT_CATENA_DI_MONTAGGIO) {
			if(slotItem.getId() == slotInput.getId())
				slotItem.getListaAutomobili().add(automobileInput);
		}
	}

}
