/*
 * Project Factory OTN
 * Copyright 2003 Factory Productions
 * Created: 31 d��c. 2003
 * Author: lmaitre
 */
package fr.factory.dao.interfaces;
/**
 * Class IBifaceI18n
 * @author lmaitre
 */
public class BifaceI18n implements IBifaceI18n {
	
	private String code;

	private Long id;
	
	private String[] libelle;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getLibelle() {
		return libelle;
	}

	public void setLibelle(String[] libelle) {
		this.libelle = libelle;
	}
	

}