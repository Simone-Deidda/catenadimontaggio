package it.prova.catenadimontaggio.model;

import java.util.ArrayList;
import java.util.List;

public class SlotCatenaDiMontaggio {
	private Long id;
	private String brand;
	private String country;
	private List<Automobile> listaAutomobili = new ArrayList<Automobile>();
	
	
	public SlotCatenaDiMontaggio() {
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country) {
		this.id = id;
		this.brand = brand;
		this.country = country;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Automobile> getListaAutomobili() {
		return listaAutomobili;
	}

	public void setListaAutomobili(List<Automobile> listaAutomobili) {
		this.listaAutomobili = listaAutomobili;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
