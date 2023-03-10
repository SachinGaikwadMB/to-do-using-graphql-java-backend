package com.mb.graphql.demo.api.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data	
public class ToDoTaskModel
{
	private String title;
	
	private Boolean isCompleted;
	
	private Boolean isFavorite;	
}
