package org.examenjee.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Task implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	private String code ; 
	private String description ; 
	
	private Date StartDate ;
	private Date endDate ; 
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CODE_PROJECT")
	private Project projet ; 
	
	public Task () {
		super(); 
	}
	public Task (String code , String desc , Date start , Date end , Project projet ) {
		super();
		this.code = code ; 
		this.description = desc ; 
		this.StartDate = start ; 
		this.endDate = end ; 
		this.projet = projet ; 
	}
	
	public String getCodeTask () {
		return code ; 
	}
	
	public void setCodeTask (String code ) {
		this.code = code ; 
	}
	
	public String getDescriptionTask () {
		return description  ; 
	}
	
	public void setDescriptionTask  (String description  ) {
		this.description  = description ; 
	}
	
	public Date getStartDateTask  () {
		return StartDate  ; 
	}
	
	public void setStartDateTask (Date startDate ) {
		this.StartDate = startDate ; 
	}
	public Date getEndDateTask  () {
		return endDate  ; 
	}
	
	public void setEndDateTask (Date endDate ) {
		this.endDate = endDate ; 
	}
	
	public Project getProjectTask() {
		return this.projet; 
	}
	
	public void setProjectTask(Project projet ) {
		this.projet = projet ; 
	}
	
	@Override
	public String toString () {
		return "Task  [code=" + code + ", description =" + description + ", StartDate=" + StartDate + "endDate"+ endDate +"Project"+ projet +"]";
	}
}
