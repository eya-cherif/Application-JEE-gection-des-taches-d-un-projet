package org.examenjee.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Project implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String code ; 
	private String description ; 
	@OneToMany(mappedBy= "project")
	private Date StartDate ; 
	
	
	public Project() {
		super(); 
	}
	
	public Project(String desc  ) {
		super(); 
		
		this.description = desc ; 
	}
	
	public String getCodeProject () {
		return code ; 
	}
	
	public void setCodeProject (String code ) {
		this.code = code ; 
	}
	
	public String getDescriptionProject () {
		return description  ; 
	}
	
	public void setDescriptionProject  (String description  ) {
		this.description  = description ; 
	}
	
	public Date getStartDateProject  () {
		return StartDate  ; 
	}
	
	public void setStartDateProject (Date startDate ) {
		this.StartDate = startDate ; 
	}
	
	@Override 
	public String toString () {
		return "Project  [code=" + code + ", description =" + description + ", StartDate=" + StartDate + "]";
	}
		
	}
