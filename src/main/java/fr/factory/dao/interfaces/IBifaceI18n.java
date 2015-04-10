/*
 * Project Factory OTN
 * Copyright 2003 Factory Productions
 * Created: 31 d??c. 2003
 * Author: lmaitre
 */
package fr.factory.dao.interfaces;
/**
 * Class IBifaceI18n
 * @author lmaitre
 */
public interface IBifaceI18n {
	/* {transient=false, volatile=false}*/
	public abstract String getCode();
	/**
	 * Method getId
	 * @return Long
	 */
	public abstract Long getId();
	/**
	 * Method setCode
	 * @return void
	 */
	public abstract void setCode(String string);
	/**
	 * Method setId
	 * @return void
	 */
	public abstract void setId(Long long1);
	/**
	 * Method getLibelle
	 * @return String[]
	 */
	public abstract String[] getLibelle();
	/**
	 * Method setLibelle
	 * @return void
	 */
	public abstract void setLibelle(String[] strings);
}