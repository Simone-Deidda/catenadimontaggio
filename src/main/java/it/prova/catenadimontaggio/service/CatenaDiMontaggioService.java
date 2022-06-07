package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	public void avviaCatenaDiMontaggio(Automobile input);
	public SlotCatenaDiMontaggio caricaSlotCatenaDiMontaggio(Long id);
	void aggiungiAutoAdSlot(Automobile autoInput, SlotCatenaDiMontaggio slotInput);
}
