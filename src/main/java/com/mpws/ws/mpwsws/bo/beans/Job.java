package com.mpws.ws.mpwsws.bo.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mpws.ws.mpwsws.bo.Language;

/**
 * 
 * @author tanguycamus
 *
 */
@Entity
public class Job {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String company;
	@OneToMany
	private List<Mission> missions = new ArrayList<>();
	private String context;
	@Column(nullable = false)
	private Language type;
	private LocalDate startMoment;
	private LocalDate endMoment;

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
	 * Getter name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter company
	 * @return company
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * Setter company
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	/**
	 * Getter missions
	 * @return missions
	 */
	public List<Mission> getMissions() {
		return missions;
	}
	
	/**
	 * Setter missions
	 * @param missions
	 */
	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}
	
	/**
	 * To add a mission
	 * @param mission
	 */
	public void addMision(Mission mission) {
		this.missions.add(mission);
	}
	
	/**
	 * Getter context
	 * @return context
	 */
	public String getContext() {
		return context;
	}
	
	/**
	 * Setter context
	 * @param context
	 */
	public void setContext(String context) {
		this.context = context;
	}
	
	/**
	 * Setter language
	 * @return type
	 */
	public Language getType() {
		return type;
	}

	/**
	 * Getter language
	 * @param type
	 */
	public void setType(Language type) {
		this.type = type;
	}

	/**
	 * Getter start moment
	 * @return start moment
	 */
	public LocalDate getStartMoment() {
		return startMoment;
	}
	
	/**
	 * Setter start moment
	 * @param startMoment
	 */
	public void setStartMoment(LocalDate startMoment) {
		this.startMoment = startMoment;
	}
	
	/**
	 * Getter end moment
	 * @return endMoment
	 */
	public LocalDate getEndMoment() {
		return endMoment;
	}
	
	/**
	 * Setter end moment
	 * @param endMoment
	 */
	public void setEndMoment(LocalDate endMoment) {
		this.endMoment = endMoment;
	}
}
