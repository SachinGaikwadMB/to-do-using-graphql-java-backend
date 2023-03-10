package com.mb.graphql.demo.api.service;

import java.util.List;
import com.mb.graphql.demo.api.persistance.entity.ToDoTask;
import com.mb.graphql.demo.api.web.model.ToDoTaskModel;

public interface ToDoTaskService
{	
	List<ToDoTask> getAllToDoTasks();
	
	ToDoTask getToDoTask(Integer id);
	
	ToDoTask saveItem(ToDoTaskModel toDoTaskModel);
	
	boolean deleteToDoTask(Integer id);
	
	boolean updateToDoTask(Integer id, boolean isCompleted);
	
}
