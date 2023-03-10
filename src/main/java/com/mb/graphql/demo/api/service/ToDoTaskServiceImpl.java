package com.mb.graphql.demo.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.graphql.demo.api.persistance.entity.ToDoTask;
import com.mb.graphql.demo.api.persistance.repository.ToDoTaskRepository;
import com.mb.graphql.demo.api.web.model.ToDoTaskModel;

@Service
public class ToDoTaskServiceImpl implements ToDoTaskService
{
	@Autowired
	private ToDoTaskRepository taskRepository;

	@Override
	public List<ToDoTask> getAllToDoTasks()
	{
		return taskRepository.findAll();
	}

	@Override
	public ToDoTask getToDoTask(Integer id)
	{
		
		return taskRepository.findById(id).get();
	}

	@Override
	public ToDoTask saveItem(ToDoTaskModel toDoTaskModel)
	{
		ToDoTask task = new ToDoTask();

		task.setTitle(toDoTaskModel.getTitle());
		task.setIsCompleted(toDoTaskModel.getIsCompleted());
		task.setIsFavorite(toDoTaskModel.getIsFavorite());
		
		return taskRepository.save(task);
	}
	
	@Override
	public boolean deleteToDoTask(Integer id)
	{
				taskRepository.deleteById(id);
				return true;
	}

	@Override
	public boolean updateToDoTask(Integer id, boolean isCompleted)
	{
		
		ToDoTask task = taskRepository.findById(id).get();
		System.out.println("Id from service layer " +  ":::" + id);
		System.out.println(task.toString() + ":::" + "  from service layer");
		task.setIsCompleted(isCompleted);
		taskRepository.save(task);
		return true;
	}

}
