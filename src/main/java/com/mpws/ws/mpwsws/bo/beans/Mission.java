package com.mpws.ws.mpwsws.bo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author tanguycamus
 *
 */
@Entity
public class Mission {
	@Id
	private int id;
	private String label;
	
	/**
	 * Getter id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter Label
	 * @return label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Setter label
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
