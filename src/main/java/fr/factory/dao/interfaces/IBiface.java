/*
 * Project Factory OTN
 * Copyright 2003 Factory Productions
 * Created: 31 d??c. 2003
 * Author: lmaitre
 */
package fr.factory.dao.interfaces;
/**
 * Class IBiface
 * @author lmaitre
 */
public interface IBiface {
	///////////////////////////////////////
	public abstract Long getId();
	/**
	 * Returns the code.
	 * @return String
	 */
	public abstract String getCode();
	/**
	 * Returns the libelle.
	 * @return String
	 */
	public abstract String getLibelle();
	/**
	 * Sets the id.
	 * @param id The id to set
	 */
	public abstract void setId(Long id);
	/**
	 * Sets the code.
	 * @param code The code to set
	 */
	public abstract void setCode(String code);
	/**
	 * Sets the libelle.
	 * @param libelle The libelle to set
	 */
	public abstract void setLibelle(String libelle);
}