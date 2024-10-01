package org.examenjee.metier;
import org.examenjee.entities.*;

import jakarta.ejb.Local;

import java.util.List;


@Local
public interface TaskDao {
	public void createTask(Task t); 
	public List<Task> ListTask(); 
}