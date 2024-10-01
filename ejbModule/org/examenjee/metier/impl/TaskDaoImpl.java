package org.examenjee.metier.impl;

import java.util.List;


import org.examenjee.entities.Task;
import org.examenjee.metier.TaskDao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name="Task")
public class TaskDaoImpl implements TaskDao{
	
	@PersistenceContext(unitName="ExamenJEEUnit")
	EntityManager em ; 
	
	@Override
	public void createTask(Task t){
		em.persist(t);
	}
	@Override
	public List<Task> ListTask(){
		String requeteJPQL= "select t from Task t "; 
		Query query= em.createQuery(requeteJPQL);
		
				List<Task>  tasks  =  (List<Task>) query.getResultList();

		return tasks  ;
	}
}