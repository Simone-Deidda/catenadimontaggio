package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService{
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private TelaioService telaioService;
	@Autowired
	SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;

	@Override
	public void avviaCatenaDiMontaggio(Automobile input) {
		System.out.println("Avvio catena di montaggio");
		telaioService.montaTelaio(input.getTelaio());
		motoreService.montaMotore(input.getModello());
		impiantoElettricoService.montaImpiantoElettrico();
		carrozzeriaService.montaCarrozzeria();
		provaSuStradaService.eseguiProvaSuStrada();
		System.out.println("Fine catena di montaggio");
	}

	@Override
	public SlotCatenaDiMontaggio caricaSlotCatenaDiMontaggio(Long id) {
		return slotCatenaDiMontaggioDAO.get(id);
	}

	@Override
	public void aggiungiAutoAdSlot(Automobile autoInput, SlotCatenaDiMontaggio slotInput) {
		slotCatenaDiMontaggioDAO.addAutoToSlot(autoInput, slotInput);
	}

}
