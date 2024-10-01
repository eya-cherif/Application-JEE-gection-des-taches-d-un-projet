package org.examenjee.metier.impl;

import java.util.List;



import org.examenjee.entities.Project;
import org.examenjee.entities.Task;
import org.examenjee.metier.ProjectDao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name="Project")
public class ProjectDaoImpl implements ProjectDao {
	@PersistenceContext(unitName="ExamenJEEUnit")
	EntityManager em; 
	@Override
	public void createProject(Project p ) {
		em.persist(p);
	}
	@Override
	public List<Project> listProject(){
		String requeteJPQL= "select p from Project p "; 
		Query query= em.createQuery(requeteJPQL);
		
				List<Project>  projets =  (List<Project>) query.getResultList();

		return projets ;
	}
	@Override
	public void removeTaskFromProject(Task t ) {
		em.remove(t);
		
		
	}
	@Override
	public void addTaskToProject(Task t) {
		em.persist(t);
	}
}