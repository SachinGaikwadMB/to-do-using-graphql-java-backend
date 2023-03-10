package com.mb.graphql.demo.api.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.mb.graphql.demo.api.persistance.entity.ToDoTask;
import com.mb.graphql.demo.api.service.ToDoTaskService;
import com.mb.graphql.demo.api.web.model.ToDoTaskModel;

@Controller
public class ToDoTaskController
{
	@Autowired
	private ToDoTaskService taskService;
	
	@QueryMapping("getAllToDoTasks")
	public List<ToDoTask> getAllToDoTasks() {
		return taskService.getAllToDoTasks();
	}
	
	@QueryMapping("getToDoTask")
	public ToDoTask getToDoTask(@Argument Integer id) {
		return taskService.getToDoTask(id);
	}
	
	@MutationMapping("saveItem")
	public ToDoTask saveItem(@Argument ToDoTaskModel toDoTaskModel) {
		return taskService.saveItem(toDoTaskModel);
	}
	
	@MutationMapping("deleteToDoTask")
	public boolean deleteToDoTask(@Argument Integer id) {
		return taskService.deleteToDoTask(id);
	}
	
	@MutationMapping("updateToDoTask")
	public boolean updateToDoTask(@Argument Integer id, @Argument  boolean isCompleted) {
		
		System.out.println(isCompleted + " ::: " + "controller");
		return taskService.updateToDoTask(id, isCompleted);
	}
}
