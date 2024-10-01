package org.examenjee.metier;
import org.examenjee.entities.*; 
import java.util.List;

import jakarta.ejb.Local;

@Local
public interface ProjectDao{
	public void addTaskToProject(Task t); 
	public void removeTaskFromProject(Task t ); 
	public List<Project> listProject(); 
	public void createProject(Project p ); 
}